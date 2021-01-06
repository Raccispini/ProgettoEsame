package GeneralGUI;



/**
*
* @author Diego
*/
public class MultiCity extends javax.swing.JFrame {
   int clicked=0;
   int clicked1=0;
   /**
    * Creates new form SingleCity
    */
   public MultiCity() {
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

       jMenu1 = new javax.swing.JMenu();
       jLabel1 = new javax.swing.JLabel();
       MenùReturn = new javax.swing.JButton();
       SelectCity1 = new javax.swing.JComboBox<>();
       SelectCity2 = new javax.swing.JComboBox<>();
       TimeSpan = new javax.swing.JComboBox<>();
       SelectCityLabel1 = new javax.swing.JLabel();
       SelectCityLabel2 = new javax.swing.JLabel();
       SelectTimespan = new javax.swing.JLabel();
       Cerca = new javax.swing.JButton();
       nameCityLabel1 = new javax.swing.JLabel();
       nameCityLabel2 = new javax.swing.JLabel();
       MediaTemp1 = new javax.swing.JLabel();
       MediaTemp2 = new javax.swing.JLabel();
       VarTemp1 = new javax.swing.JLabel();
       VarTemp2 = new javax.swing.JLabel();
       MediaHum1 = new javax.swing.JLabel();
       MediaHum2 = new javax.swing.JLabel();
       VarHum1 = new javax.swing.JLabel();
       VarHum2 = new javax.swing.JLabel();
       MediaPr1 = new javax.swing.JLabel();
       MediaPr2 = new javax.swing.JLabel();
       VarPr1 = new javax.swing.JLabel();
       VarPr2 = new javax.swing.JLabel();

       jMenu1.setText("jMenu1");

       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

       jLabel1.setText("Meteo Per confronto tra città");

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

       SelectCity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L'aquila", "Potenza", "Catanzaro", "Napoli", "Bologna", "Trieste", "Roma", "Genova", "Milano", "Ancona", "Campobasso", "Torino", "Bari", "Cagliari", "Palermo", "Firenze", "Trento", "Perugia", "Aosta", "Venezia" }));
       SelectCity1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               SelectCity1ActionPerformed(evt);
           }
       });

       SelectCity2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L'aquila", "Potenza", "Catanzaro", "Napoli", "Bologna", "Trieste", "Roma", "Genova", "Milano", "Ancona", "Campobasso", "Torino", "Bari", "Cagliari", "Palermo", "Firenze", "Trento", "Perugia", "Aosta", "Venezia" }));
       SelectCity2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               SelectCity2ActionPerformed(evt);
           }
       });

       TimeSpan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giornaliero", "Settimanale", "Mensile", "Annuale" }));

       SelectCityLabel1.setText("Seleziona la Città");

       SelectCityLabel2.setText("Seleziona la Città");

       SelectTimespan.setText("Range di Tempo");

       Cerca.setText("Cerca");
       Cerca.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mousePressed(java.awt.event.MouseEvent evt) {
               CercaMousePressed(evt);
           }
       });

       MediaTemp1.setText("Media Temperatura");

       MediaTemp2.setText("Media Temperatura");

       VarTemp1.setText("Varianza Temperatura");

       VarTemp2.setText("Varianza Temperatura");

       MediaHum1.setText("Media Umidità");

       MediaHum2.setText("Media Umidità");

       VarHum1.setText("Varianza Umidità");

       VarHum2.setText("Varianza Umidità");

       MediaPr1.setText("Media Pressione");

       MediaPr2.setText("Media Pressione");

       VarPr1.setText("Varianza Pressione");

       VarPr2.setText("Varianza Pressione");

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(MenùReturn)
               .addGap(32, 32, 32))
           .addGroup(layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel1)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
           .addGroup(layout.createSequentialGroup()
               .addGap(250, 250, 250)
               .addComponent(SelectTimespan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(TimeSpan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
           .addGroup(layout.createSequentialGroup()
               .addGap(69, 69, 69)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(VarPr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(MediaPr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(VarHum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(nameCityLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(VarTemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(MediaTemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(MediaHum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(SelectCityLabel1)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(SelectCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(18, 18, 18)
                       .addComponent(Cerca)
                       .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                               .addComponent(nameCityLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(VarTemp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(MediaTemp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(MediaHum2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                               .addComponent(VarHum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(MediaPr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(VarPr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                           .addGroup(layout.createSequentialGroup()
                               .addComponent(SelectCityLabel2)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                               .addComponent(SelectCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                       .addGap(76, 76, 76))))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel1)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(SelectCityLabel2)
                       .addComponent(SelectCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(SelectCityLabel1)
                       .addComponent(SelectCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGap(3, 3, 3)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(SelectTimespan)
                   .addComponent(TimeSpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(20, 20, 20)
               .addComponent(Cerca)
               .addGap(11, 11, 11)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                   .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                       .addComponent(nameCityLabel1)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(MediaTemp1)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(VarTemp1)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(MediaHum1))
                   .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                       .addComponent(nameCityLabel2)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(MediaTemp2)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(VarTemp2)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(MediaHum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(VarHum1)
                   .addComponent(VarHum2))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(MediaPr1)
                   .addComponent(MediaPr2))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(VarPr1)
                   .addComponent(VarPr2))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
               .addComponent(MenùReturn)
               .addGap(23, 23, 23))
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

   private void SelectCity1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       // TODO add your handling code here:
   }                                           

   private void CercaMousePressed(java.awt.event.MouseEvent evt) {                                   
       // TODO add your handling code here:
       nameCityLabel2.setText("Meteo di " + SelectCity2.getSelectedItem());
       nameCityLabel1.setText("Meteo di " + SelectCity1.getSelectedItem());
       MediaTemp1.setText("Temperatura media: "  +"° ");
       VarTemp1.setText("Varianza della temperatura: " +"° ");
       MediaPr1.setText("Pressione media: " +"Pa");
       VarPr1.setText("Varianza della pressione: " + "Pa");
       MediaPr1.setText("Media della pressione: "+ "Pa");
       VarHum1.setText("Variaza dell'umidità: " + "%");
       MediaHum1.setText("Media dell'umidità: " + "%");
       MediaTemp2.setText("Temperatura media: "  +"° ");
       VarTemp2.setText("Varianza della temperatura: " +"° ");
       MediaPr2.setText("Pressione media: " +"Pa");
       VarPr2.setText("Varianza della pressione: " + "Pa");
       MediaPr2.setText("Media della pressione: "+ "Pa");
       VarHum2.setText("Variaza dell'umidità: " + "%");
       MediaHum2.setText("Media dell'umidità: " + "%");
   
   }                                  

   private void SelectCity2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
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
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(SingleCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(SingleCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(SingleCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
   private javax.swing.JButton Cerca;
   private javax.swing.JLabel MediaHum1;
   private javax.swing.JLabel MediaHum2;
   private javax.swing.JLabel MediaPr1;
   private javax.swing.JLabel MediaPr2;
   private javax.swing.JLabel MediaTemp1;
   private javax.swing.JLabel MediaTemp2;
   private javax.swing.JButton MenùReturn;
   private javax.swing.JComboBox<String> SelectCity1;
   private javax.swing.JComboBox<String> SelectCity2;
   private javax.swing.JLabel SelectCityLabel1;
   private javax.swing.JLabel SelectCityLabel2;
   private javax.swing.JLabel SelectTimespan;
   private javax.swing.JComboBox<String> TimeSpan;
   private javax.swing.JLabel VarHum1;
   private javax.swing.JLabel VarHum2;
   private javax.swing.JLabel VarPr1;
   private javax.swing.JLabel VarPr2;
   private javax.swing.JLabel VarTemp1;
   private javax.swing.JLabel VarTemp2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JLabel nameCityLabel1;
   private javax.swing.JLabel nameCityLabel2;
   // End of variables declaration                   
}
