package GeneralGUI;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

import com.univpm.oop.log.Log;
import com.univpm.oop.model.Citta;
import com.univpm.oop.services.Convertitore;
import com.univpm.oop.src.Main;
import com.univpm.oop.statistiche.Stat;

/**
*
* @author Diego
*/
public class SingleCity extends javax.swing.JFrame {
      private int clicked = 0;
      private float temp1= 37;
   /**
    * Creates new form SingleCity
    */
   public SingleCity() {
       initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jLabel1 = new javax.swing.JLabel();
       MenùReturn = new javax.swing.JButton();
       jLabel2 = new javax.swing.JLabel();
       jButton1 = new javax.swing.JButton();
       jComboBox1 = new javax.swing.JComboBox<>();
       NameCity = new javax.swing.JLabel();
       MediaTemp = new javax.swing.JLabel();
       VarTemp = new javax.swing.JLabel();
       MediaHum = new javax.swing.JLabel();
       VarHum = new javax.swing.JLabel();
       MediaPres = new javax.swing.JLabel();
       VarPres = new javax.swing.JLabel();

       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

       jLabel1.setText("Single City Meteo");

       MenùReturn.setText("Ritorna al menù");
       MenùReturn.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseClicked(java.awt.event.MouseEvent evt) {
               MenùReturnMouseClicked(evt);
           }
       });
       MenùReturn.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               MenùReturnActionPerformed(evt);
           }
       });

       jLabel2.setText("Seleziona la Città");

       jButton1.setText("Cerca");
       jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mousePressed(java.awt.event.MouseEvent evt) {
               jButton1MousePressed(evt);
           }
       });

       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L'aquila", "Potenza", "Catanzaro", "Napoli", "Bologna", "Trieste", "Roma", "Genova", "Milano", "Ancona", "Campobasso", "Torino", "Bari", "Cagliari", "Palermo", "Firenze", "Trento", "Perugia", "Aosta", "Venezia" }));
       jComboBox1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jComboBox1ActionPerformed(evt);
           }
       });

       MediaTemp.setText("Media Temperatura");

       VarTemp.setText("Varianza Temperatura");

       MediaHum.setText("Media Umidità");

       VarHum.setText("Varianza Umidità");

       MediaPres.setText("Media Pressione");

       VarPres.setText("Varianza Pressione");

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
               .addContainerGap(650, Short.MAX_VALUE)
               .addComponent(MenùReturn)
               .addGap(42, 42, 42))
           .addGroup(layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(NameCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                       .addComponent(jLabel1)
                       .addGroup(layout.createSequentialGroup()
                           .addComponent(jLabel2)
                           .addGap(1, 1, 1)))
                   .addComponent(MediaHum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(VarTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(VarHum, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                   .addComponent(MediaTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(VarPres, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                   .addComponent(MediaPres, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel1)
               .addGap(33, 33, 33)
               .addComponent(jLabel2)
               .addGap(5, 5, 5)
               .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(jButton1)
               .addGap(11, 11, 11)
               .addComponent(NameCity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(17, 17, 17)
               .addComponent(MediaTemp)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(VarTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(MediaHum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(VarHum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(MediaPres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(VarPres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(MenùReturn)
               .addGap(34, 34, 34))
       );

       pack();
   }// </editor-fold>                        

   private void MenùReturnMouseClicked(java.awt.event.MouseEvent evt) {                                        
       // TODO add your handling code here:
       new StartingFrame().setVisible(true);
       dispose();
   }                                       

   private void MenùReturnActionPerformed(java.awt.event.ActionEvent evt) {                                           
       // TODO add your handling code here:
   }                                          

   /**
    * Ricerca il meteo di una singola città quando viene premuto il pulsante
    * @param evt
    * @return i dati ottenuti sono della media e varianza di temperatura, pressione e umidità
    */
   private void jButton1MousePressed(java.awt.event.MouseEvent evt) {                                      
       // TODO add your handling code here:
	   String DataType=new String();
	   DataType= "Giornaliero";
	  
	   String citta= (String)jComboBox1.getSelectedItem();
	  if(String.valueOf(citta)=="L'aquila"|| String.valueOf(citta)=="L'Aquila")citta="Comune di L\u0027Aquila";
	   System.out.println(citta);
	   Date[] date = Main.menuDate(DataType);
	   Stat stat = new Stat();
	   Convertitore conv = new Convertitore();
		Double[] valP ;
		Double[] valU ;
		Double[] valT ;
		ArrayList<Citta> c = conv.JsonToCitta(date[0],date[1]);
		if(citta.equals("Nord") || citta.equals("Centro") || citta.equals("Sud")) {
			 valP = stat.getDataByLocation(c, citta,0);
			 valU = stat.getDataByLocation(c, citta,1);
			 valT = stat.getDataByLocation(c, citta,2);
			
		}else {
			 valP = stat.getValues(c, citta,true);
			 valU = stat.getValues(c, citta,false);
			 valT = stat.getValues(c, citta);
		}
		
		double mediaP = stat.getMedia(valP);
		double mediaU = stat.getMedia(valU);
		double mediaT = stat.getMedia(valT);
		double varT=stat.getVarianza(valT);
		double varP=stat.getVarianza(valP);
		double varU=stat.getVarianza(valU);
	System.out.println(date[0] +" " +date[1]);

	   
     NameCity.setText("Meteo di " + jComboBox1.getSelectedItem());
   MediaTemp.setText("Temperatura media: " + String.valueOf((float)mediaT) +"° ");
   VarTemp.setText("Varianza della temperatura: " + String.valueOf((float)varT) +"° ");
   MediaPres.setText("Pressione media: " +String.valueOf((float)mediaP)+"Pa");
   VarPres.setText("Varianza della pressione: " +String.valueOf((float)varP)+ "Pa");
   VarHum.setText("Varianza dell'umidità: " + String.valueOf((float)varU)+"%");
   MediaHum.setText("Media dell'umidità: " +(float)mediaU+ "%");
   }                                     

   private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       // TODO add your handling code here:
   }                                          

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
       /* Set the Nimbus look and feel */
       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
       /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        */
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(SingleCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           Log.report(new Date()+"-"+ex.getMessage());
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(SingleCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           Log.report(new Date()+"-"+ex.getMessage());
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(SingleCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           Log.report(new Date()+"-"+ex.getMessage());
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(SingleCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           Log.report(new Date()+"-"+ex.getMessage());
       }
       //</editor-fold>
       
       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new SingleCity().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JLabel MediaHum;
   private javax.swing.JLabel MediaPres;
   private javax.swing.JLabel MediaTemp;
   private javax.swing.JButton MenùReturn;
   private javax.swing.JLabel NameCity;
   private javax.swing.JLabel VarHum;
   private javax.swing.JLabel VarPres;
   private javax.swing.JLabel VarTemp;
   private javax.swing.JButton jButton1;
   private javax.swing.JComboBox<String> jComboBox1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   // End of variables declaration                   
}
