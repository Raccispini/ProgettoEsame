package com.example.demo.controller;
import com.example.demo.statistiche.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



//Classe non utilizzata momentaneamente (Serve per gestire le call da Postaman alla nostra API)

 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam; 
 import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Citta;
import com.example.demo.services.*;
import com.example.demo.src.Convertitore;
import com.example.demo.statistiche.Stat;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

 /**
  *  Classe che gestisce le call a SpringBoot
  * @author Federico
  * @author Nicolò
  *
  */
 
 @RestController public class Controller {
 
 String url = "";//"C:\\Users\\OEM\\Downloads\\demo\\Esempio chiamata.txt";

 /**
  * Call che restituisce il meteo di una citta
  * @author Federico
  * 
  * @param city	 Citta di cui abbiamo chiesto il meteo
  * @param agg Se si fa direttamente una call ad Open Weather se no prima cerca nel database se c'è un dato utilizzabile
  * @return JsonObject contenente tutte le informazioni riguardanti il meteo
  */
 @GetMapping("/Weather")
 public Citta getWeather(@RequestParam(name = "Citta", defaultValue = "Rome") String city,@RequestParam(name = "Aggiornamento", defaultValue = "Si")String agg) {
	 Citta c = new Citta();
	 Convertitore conv = new Convertitore(); 
	 if(agg.equals("Si")) {
		 try { 
			 int ID = Integer.parseInt(city);
			 url = "http://api.openweathermap.org/data/2.5/weather?id=" + ID + "&appid=907bf98c6e55b2f5321b46b5edb794de&units=metric&lang=it";
				 
		 	}catch (NumberFormatException e) {
			 url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + ",IT&appid=907bf98c6e55b2f5321b46b5edb794de&units=metric&lang=it"; 
		 	}	 
			String meteo = CercaMeteo.getMeteo(url);
			c = conv.getClassFromCall(meteo);
			//Aggiunto autosalvataggio
			Gson gson = new Gson();
			conv.salva(gson.toJson(c));
			return c;
	 }
	 else if(agg.equals("No")){	
		 c = conv.findInJson(city);
		 return c;
	 }
	 else return null;
 }

/**
 * Call che restituisce tutte le statistiche di una citta 
 * 
 * @author Federico
 * @author Nicolò
 * 
 * @param body JsonObject contenente tutti i dati necessari al funzionamento
 * @param city Citta oggetto della ricerca
 * @param type Tipo di range di tempo (Giornaliero,Settimanale,Mensile,Annuale o Custom)
 * @param range Range di date nel caso in cui type = Custom
 * @return JsonObject contenente tutte le info  riguardanti le statistiche
 */

@PostMapping("/Stat")
 public JsonObject getStat(@RequestBody JsonObject body) {
	Convertitore conv = new Convertitore();
	ArrayList<Filtro> f = getFilterFromJson(body);
	ArrayList<Citta> citta = conv.JsonToCitta();
	
	for(int i = 0; i<f.size();i++) {
		citta = f.get(i).filtra(citta);
	}
	/*
	 String city =  body.get("city").getAsString();
     String type = body.get("type").getAsString();
     Date[] date = new Date[2];
     if(type.equals("Customizzato")) {
		 JsonArray range = body.getAsJsonArray("range");
		 String inizio = range.get(0).getAsString();
		 String fine = range.get(1).getAsString();
		 date = menuDate(inizio,fine);
		 }
     else {
    	 date = menuDate(type);
    	 }*/
	 Stat s = new Stat();
	
	 Double[][] dati = s.getValues(citta);
	 double mediaP = s.getMedia(dati[0]);
	 double mediaU = s.getMedia(dati[1]);
	 double mediaT = s.getMedia(dati[2]);
	 double varianzaP = s.getVarianza(dati[0]);
	 double varianzaU = s.getVarianza(dati[1]);
	 double varianzaT = s.getVarianza(dati[2]);
	 JsonObject JsonReturn = new JsonObject();
	 if(dati == null) {
		 JsonReturn.addProperty("Nessun valore trovato nel range di tempo specificato","");
		 return JsonReturn;
	 }
	 else {
		 JsonReturn.addProperty("Nome", citta.get(0).getNome());
		 JsonReturn.addProperty("Media Umidità", new DecimalFormat("#.##").format(mediaU));
		 JsonReturn.addProperty("Varianza Umidità", new DecimalFormat("#.##").format(varianzaU));
		 JsonReturn.addProperty("Media Pressione",new DecimalFormat("#.##").format(mediaP));
		 JsonReturn.addProperty("Varianza Pressione", new DecimalFormat("#.##").format(varianzaP));
		 JsonReturn.addProperty("Media Temperatura",  new DecimalFormat("#.##").format(mediaT));
		 JsonReturn.addProperty("Varianza Temperatura",  new DecimalFormat("#.##").format(varianzaT));
		 return JsonReturn;
		 }
 }

/**
 * Call che dato un JsoonObject per input restituisce un JsonObject contentente le citta con i valori massimi di temperatura, umidita e pressione nel database
 * @author Federico 
 *
 * @param body
 * @param type Tipo di range di tempo(Giornaliero, Settimanale, Mensile, Annuale o Customizzato) 
 *
 * @return JsonObject contenente tutti le citta con i valori massimi nel Database
 */
 @PostMapping("/Max")
 public JsonObject getMax(@RequestBody JsonObject body) {
     String type = body.get("type").getAsString();
     Date[] date = new Date[2];
     if(type.equals("Customizzato")) {
		 JsonArray range = body.getAsJsonArray("range");
		 String inizio = range.get(0).getAsString();
		 String fine = range.get(1).getAsString();
		 date = menuDate(inizio,fine);
		 }
     else {
    	 date = menuDate(type);
    	 };
	 Stat s = new Stat();
	 System.out.println(date[0] + " " + date[1]);
	 return s.getMax(date[0],date[1]);
 }
 /**
  * Dato un JsonObject passato in post  restituisce tutte le citta con i valori minimi di pressione, umidità e Temperatura nel database
  * @author Federico
  * 
  * @param body
  * @param type Range di tempo(Giornaliero, Settimanale, Mensile, Annuale o Customizzato)
  * @param range Nel caso in cui type=Customizzato allora range contiente la data di inizio e di fine del range di tempo
  * @return JsonObject contenente tutte le citta con i valori minimi di pressione, umidità e temperatura nel Database
  */
 @PostMapping("/Min")
 public JsonObject getMin(@RequestBody JsonObject body) {
     String type = body.get("type").getAsString();
     Date[] date = new Date[2];
     if(type.equals("Customizzato")) {
		 JsonArray range = body.getAsJsonArray("range");
		 String inizio = range.get(0).getAsString();
		 String fine = range.get(1).getAsString();
		 date = menuDate(inizio,fine);
		 }
     else {
    	 date = menuDate(type);
    	 };
	 Stat s = new Stat();
	 return s.getMin(date[0],date[1]);
}
 
/**
 * Call che dato un JsonBody in post restituisce un altro JsonBody contenente tutte le informazioni riguardanti le citta con valori minimi di umidita, pressione e temperatura
 * @author Federico
 *  
 * @param body
 * @param zone zona geografica
 * @param type Range di tempo (Giornaliero, Settimanale, Mensile, Annuale o Customizzato)
 * @param range Nel caso in cui type = Customizzato allora range conterrà il range di date 
 * @return JsonObject contenente le città con i valori minimi di umidità, pressione e temperatura
 */
@PostMapping("/ZoneGeo")
 public JsonObject getZoneGeo(@RequestBody JsonObject body) {
	 String zone = body.get("zone").getAsString();
     String type = body.get("type").getAsString();
     Date[] date = new Date[2];
     if(type.equals("Customizzato")) {
		 JsonArray range = body.getAsJsonArray("range");
		 String inizio = range.get(0).getAsString();
		 String fine = range.get(1).getAsString();
		 date = menuDate(inizio,fine);
		 }
     else {
    	 date = menuDate(type);
    	 };
	 Stat stat = new Stat();
	 Double[] valP =  stat.getDataByLocation(date[0], date[1], zone, true);
	 Double[] valU = stat.getDataByLocation(date[0], date[1], zone, false);
	 double mediaP = stat.getMedia(valP);
	 double mediaU = stat.getMedia(valU);
	 double varianzaU = stat.getVarianza(valU);
	 double varianzaP = stat.getVarianza(valP);
	 JsonObject JsonReturn = new JsonObject();
	 if(valP == null && valU == null) {
		 JsonReturn.addProperty("Nessun valore trovato nel range di tempo specificato","");
		 return JsonReturn;
	 }
	 else {
		 JsonReturn.addProperty("Zona", zone);
		 JsonReturn.addProperty("Media Umidità", new DecimalFormat("#.##").format(mediaU));
		 JsonReturn.addProperty("Varianza Umidità", new DecimalFormat("#.##").format(varianzaU));
		 JsonReturn.addProperty("Media Pressione",new DecimalFormat("#.##").format(mediaP));
		 JsonReturn.addProperty("Varianza Pressione", new DecimalFormat("#.##").format(varianzaP));
		 return JsonReturn;
		 }		
 }
 
/**
 * Call per gestire i favoriti
 * @author Federico
 * 
 * @param action 	<br>Se "Aggiungi" : aggiunge ai favoriti <b>name</b>
 * 					<br>Se "Rimuovi" : rimuove dai favoriti <b>name</b>
 * 					<br>Se "Stampa" : ritorna i favoriti
 * @param name Oggetto di action
 * @return ritorna JsonObject con i log di alcune azioni
 */
 @GetMapping("/Fav")
 public JsonObject Favoriti(@RequestParam(name = "Action")String action,@RequestParam(name = "Name", defaultValue = "")String name) {
	 Favoriti fav = new Favoriti();
	 switch(action) {
	 case "Aggiungi":
		 fav.addFavoriti(name);
		 return fav.stampaFavoriti();
	 case "Rimuovi":
		 fav.removeFavoriti(name);
		 return fav.stampaFavoriti();
	 case "Stampa":
		return fav.stampaFavoriti();
	default:
		JsonObject errObj = new JsonObject();
		errObj.addProperty("La scelta selezionata non è consentita","");
		return errObj;		 
	 }

 }
 
/**
 * @author Nicolò		
 * @param time
 * @return
 */
 public static Date[] menuDate(String time) {
	 Date inizio = new Date();
	 Date fine = new Date();
	 LocalDate l;
		switch (time) {
		case "Giornaliero":
			fine = new Date();
			l = LocalDate.now().minusDays(1);
			inizio = Date.from(l.atStartOfDay(ZoneId.systemDefault()).toInstant());
			// stampaStat(inizio,fine,citta);
			break;
		case "Settimanale":
			fine = new Date();
			l = LocalDate.now().minusDays(7);
			inizio = Date.from(l.atStartOfDay(ZoneId.systemDefault()).toInstant());
			// stampaStat(inizio,fine,citta);
			break;
		case "Mensile":
			fine = new Date();
			l = LocalDate.now().minusDays(30);
			inizio = Date.from(l.atStartOfDay(ZoneId.systemDefault()).toInstant());
			// stampaStat(inizio,fine,citta);
			break;
		case "Annuale":
			fine = new Date();
			l = LocalDate.now().minusDays(365);
			inizio = Date.from(l.atStartOfDay(ZoneId.systemDefault()).toInstant());
			// stampaStat(inizio,fine,citta);
			break;
		}
				
		Date[] date = {inizio, fine};
		return date;
	}
 
 /**
  * Converte un range di date da String a Date
  * @author Federico
  * 
  * @param start Inizio range
  * @param end Fine range
  * @return Array di Date contenente le date di inizio e fine
  */
 public static  Date[] menuDate(String start,String end) {
	 Date inizio = new Date();
	 Date fine = new Date();
	 try {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");
			inizio = formato.parse(start);
			fine = formato.parse(end);
		}catch (ParseException e1) {
			try {
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
				inizio = formato.parse(start);
				fine = formato.parse(end);					
				}catch (ParseException e2) {
					e2.printStackTrace();
				}
		}
	 Date[] date = {inizio, fine};
	 return date;
		}
 
 
 public ArrayList<Filtro> getFilterFromJson(JsonObject body){
	 ArrayList<Filtro> f = new ArrayList<Filtro>();
	 	JsonObject jo = body.get("filtri").getAsJsonObject();
		JsonObject jobject = jo.get("tempo").getAsJsonObject();
		if(jobject.get("attivo").getAsBoolean()) {
			f.add(new Tempo(jobject.get("filtro").getAsString()));
		}
		jobject = jo.get("ZoneGeografiche").getAsJsonObject();
		if(jobject.get("attivo").getAsBoolean()) {
			f.add(new ZoneGeografiche(jobject.get("filtro").getAsString()));
		}
		jobject = jo.get("nome").getAsJsonObject();
		if(jobject.get("attivo").getAsBoolean()) {
			f.add(new NomeId(jobject.get("filtro").getAsString()));
		}
		return f;
	}
 }
 
 