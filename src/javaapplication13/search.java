
package javaapplication13;
import static javax.swing.JOptionPane.*;
public class search extends javax.swing.JFrame {
    static welcomepage previous;
    public search(welcomepage p) {
        initComponents();
        setTitle("Search page");
        setSize(400,500);
         setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        previous = p;
    }//END OF search CONSTRACTOR
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/folder/Grunge-abstract-pattern-background-material-05.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 90, 160, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/folder/Search.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 180, 50, 50);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 240, 260, 150);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Back");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 420, 90, 20);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Search Page");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 30, 130, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Enter ID ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 90, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/folder/Yellow arrow.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 410, 50, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Search");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 200, 70, 20);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Enter Name ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 90, 90, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 130, 160, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/folder/Grunge-abstract-pattern-background-material-05.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 400, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     String str1 = jTextField1.getText(); 
    String str2 = jTextField2.getText(); 
    
     try{
         int ad = Integer.parseInt(str2);
     if (jTextField1.getText().isEmpty()&&jTextField2.getText().isEmpty()){
         area.setText("Please fill all the field");
     }  //END OF IF 
     
     
     else
          
       area.setText(insert.l1.Search(str1,ad)); 
     }
     catch(Exception e){
         area.setText(jTextField1.getText()+" is not in the system");
     }
        
     
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
  previous.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
   
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new search(previous).setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
