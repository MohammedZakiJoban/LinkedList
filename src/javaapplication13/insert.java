/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
public class insert extends javax.swing.JFrame {
   
    
   static  LinkedList l1 = new LinkedList();
   
 static welcomepage previous;
    public insert(welcomepage p) {
        initComponents();
       
          setSize(600,560);
         setLocationRelativeTo(null);
        setTitle("Add Student Detail");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     previous = p;
    }//END OF INSERT CONSTRACTOR
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        na = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passport = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enrollment Page");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("registration Page");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 30, 220, 40);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 70, 20);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Age");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 210, 80, 20);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Nationality");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 270, 100, 30);
        getContentPane().add(id);
        id.setBounds(140, 110, 170, 30);
        getContentPane().add(name);
        name.setBounds(140, 160, 170, 30);

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(140, 210, 170, 30);
        getContentPane().add(na);
        na.setBounds(140, 270, 170, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/folder/Green ball.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 460, 50, 50);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Passport");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 340, 70, 20);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Email");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 400, 60, 20);
        getContentPane().add(passport);
        passport.setBounds(140, 340, 170, 30);
        getContentPane().add(email);
        email.setBounds(140, 400, 170, 30);

        area.setColumns(20);
        area.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 280, 200, 150);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/folder/Yellow arrow.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 460, 50, 50);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Back");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 470, 80, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Submit");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 470, 120, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText(" ID");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 110, 90, 20);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Number of volunteer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 100, 170, 40);

        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        getContentPane().add(num);
        num.setBounds(450, 140, 40, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/folder/iPad-2-Pattern-Wallpaper-03-600x600.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 590, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        boolean check;
        String idn = id.getText();
        String nam = name.getText();
        String sage = age.getText();
        String sna = na.getText();
        String ps = passport.getText();
        String em = email.getText();
        
         
     
     if (id.getText().isEmpty()&& age.getText().isEmpty()){
         area.setText("Please fill all the field");
     }  
     else{       
try{
      int ad = Integer.parseInt(idn);
       int ad2 = Integer.parseInt(sage);
       
      check = checkID(ad);
      
      if (check == true){
      JOptionPane.showMessageDialog(null,ad + "  is already in the list\nPlease enter a vaild ID"); 
       id.setText("");
      
      }
      else{
        info in = new info(nam,ad2,sna,ps,em,ad);
         int x = l1.size + 1;
        String s= x+"";
        
         num.setText(s);
     l1.insert(in);
     area.setText(l1.Search(nam,ad));
     

         id.setText("");
        name.setText("");
        age.setText("");
        na.setText("");
        passport.setText("");
        email.setText("");
      }
      
     
      
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,  "Please enter a valid data "); 
}
     }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
   // public LinkedList getOb(){  
   //     return l1;       
   // }
    
    
    
    
    public boolean checkID(int id){
        
        boolean check = false;   
        Node temp = l1.start;   
   if (temp == null )
   {
       check =false;
    }
    else { 
       while (temp != null && temp.getData().getId() != id)
       {
           temp = temp.getLinkNext();
        }      
        if (temp != null)
        check = true;   
            else
            check = false;
    
   }  
   return check;
    }
    
    
    
    
   
  
   
     

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
  previous.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert(previous).setVisible(true);
            }
        });
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField na;
    private javax.swing.JTextField name;
    private javax.swing.JTextField num;
    private javax.swing.JTextField passport;
    // End of variables declaration//GEN-END:variables
}
