/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Ujaalo.Login;
import Ujaalo.OracleDatabase;
import Ujaalo.StudentDashboard;
import java.sql.Connection;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author User
 */



public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    
    Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs = null;
    
    
    
    public ChangePassword() {
        initComponents();
        
       Login.txt_unID.getText();
       UnID.setText(Login.txt_unID.getText());
       
       
        
    }
    
    public void information(){
        
        
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterLoginMain = new javax.swing.JPanel();
        RegisterName = new javax.swing.JLabel();
        SideLogin = new javax.swing.JPanel();
        RegisterLoginIcon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BackPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UnID = new javax.swing.JTextField();
        UniversityIDSeparator = new javax.swing.JSeparator();
        UniversityIDSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UniversityIDSeparator2 = new javax.swing.JSeparator();
        txt_reNewpass = new javax.swing.JPasswordField();
        btn_changePass = new javax.swing.JButton();
        txt_newPass = new javax.swing.JPasswordField();
        lbl_validate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        RegisterLoginMain.setBackground(new java.awt.Color(255, 255, 255));
        RegisterLoginMain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        RegisterLoginMain.setPreferredSize(new java.awt.Dimension(700, 509));

        RegisterName.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        RegisterName.setForeground(new java.awt.Color(214, 48, 49));
        RegisterName.setText("Change Password");

        SideLogin.setBackground(new java.awt.Color(214, 48, 49));

        RegisterLoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userLogin.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(214, 48, 49));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ujaalo Kiosk");

        javax.swing.GroupLayout SideLoginLayout = new javax.swing.GroupLayout(SideLogin);
        SideLogin.setLayout(SideLoginLayout);
        SideLoginLayout.setHorizontalGroup(
            SideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideLoginLayout.createSequentialGroup()
                .addGroup(SideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideLoginLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(RegisterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SideLoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        SideLoginLayout.setVerticalGroup(
            SideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideLoginLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(RegisterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackPanel.setBackground(new java.awt.Color(214, 48, 49));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 48, 49));
        jLabel1.setText("University ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(214, 48, 49));
        jLabel3.setText("New Password");

        UnID.setEditable(false);
        UnID.setBackground(new java.awt.Color(255, 255, 255));
        UnID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UnID.setForeground(new java.awt.Color(102, 102, 102));
        UnID.setBorder(null);

        UniversityIDSeparator.setBackground(new java.awt.Color(153, 153, 153));
        UniversityIDSeparator.setForeground(new java.awt.Color(153, 153, 153));
        UniversityIDSeparator.setMaximumSize(new java.awt.Dimension(261, 24));
        UniversityIDSeparator.setMinimumSize(new java.awt.Dimension(261, 24));
        UniversityIDSeparator.setPreferredSize(new java.awt.Dimension(261, 24));

        UniversityIDSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        UniversityIDSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        UniversityIDSeparator1.setMaximumSize(new java.awt.Dimension(261, 24));
        UniversityIDSeparator1.setMinimumSize(new java.awt.Dimension(261, 24));
        UniversityIDSeparator1.setPreferredSize(new java.awt.Dimension(261, 24));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/University ID.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Password.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(214, 48, 49));
        jLabel6.setText("Retype-password");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Password.png"))); // NOI18N

        UniversityIDSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        UniversityIDSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        UniversityIDSeparator2.setMaximumSize(new java.awt.Dimension(261, 24));
        UniversityIDSeparator2.setMinimumSize(new java.awt.Dimension(261, 24));
        UniversityIDSeparator2.setPreferredSize(new java.awt.Dimension(261, 24));

        txt_reNewpass.setBackground(new java.awt.Color(255, 255, 255));
        txt_reNewpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_reNewpass.setForeground(new java.awt.Color(102, 102, 102));
        txt_reNewpass.setBorder(null);
        txt_reNewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reNewpassActionPerformed(evt);
            }
        });
        txt_reNewpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_reNewpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_reNewpassKeyReleased(evt);
            }
        });

        btn_changePass.setBackground(new java.awt.Color(214, 48, 49));
        btn_changePass.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_changePass.setForeground(new java.awt.Color(255, 255, 255));
        btn_changePass.setText("Change");
        btn_changePass.setBorder(null);
        btn_changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changePassActionPerformed(evt);
            }
        });

        txt_newPass.setBackground(new java.awt.Color(255, 255, 255));
        txt_newPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_newPass.setForeground(new java.awt.Color(102, 102, 102));
        txt_newPass.setBorder(null);

        lbl_validate.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_validate.setForeground(new java.awt.Color(255, 0, 51));
        lbl_validate.setText("*One or more required information is empty.");

        javax.swing.GroupLayout RegisterLoginMainLayout = new javax.swing.GroupLayout(RegisterLoginMain);
        RegisterLoginMain.setLayout(RegisterLoginMainLayout);
        RegisterLoginMainLayout.setHorizontalGroup(
            RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                .addComponent(SideLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btn_changePass, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLoginMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLoginMainLayout.createSequentialGroup()
                                .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(226, 226, 226))
                                    .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(37, 37, 37)
                                            .addComponent(UnID, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(UniversityIDSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UniversityIDSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLoginMainLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_reNewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(UniversityIDSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLoginMainLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLoginMainLayout.createSequentialGroup()
                                .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_validate, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RegisterName))
                                .addGap(57, 57, 57)
                                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        RegisterLoginMainLayout.setVerticalGroup(
            RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(RegisterName)
                .addGap(18, 18, 18)
                .addComponent(lbl_validate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(UnID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UniversityIDSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UniversityIDSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegisterLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_reNewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UniversityIDSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_changePass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(RegisterLoginMainLayout.createSequentialGroup()
                        .addComponent(txt_newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterLoginMain, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterLoginMain, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        //KioskMain kmr = new KioskMain();
        //kmr.setVisible(true);
        this.setVisible(false);
        //kmr.pack();
        //rgf.dispose();
        //new RegisterLogin().setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changePassActionPerformed
        
        conn = OracleDatabase.ConnectDb();
        String UniID = UnID.getText();
        String newpass = txt_newPass.getText();
        String repass = txt_reNewpass.getText();
        
        
        try{
           
           String sql = "UPDATE Student SET Password=? WHERE UniversityID=?";
           pst = (OraclePreparedStatement) conn.prepareStatement(sql);
           
           //This was working in time but now its not working need to think about h
           
           pst.setString(1,newpass);
           pst.setString(2,UniID);
           
           
        
           
           
           rs =(OracleResultSet) pst.executeQuery();
           
           if (rs.next())
           {
               JOptionPane.showMessageDialog(null,"Your password has changed successfully.");
               
               StudentDashboard sgf= new StudentDashboard();
                sgf.setVisible(true);
                this.dispose();
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Something went wrong while changing password.Try again with required fields.");
           }
           
       }
       catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
       
        
       
        
       /** This will make the next window visible but need to work on more
        StudentDashboard sgf= new StudentDashboard();
        sgf.setVisible(true);
        this.dispose(); 
        **/

    }//GEN-LAST:event_btn_changePassActionPerformed

    private void txt_reNewpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_reNewpassKeyPressed
        // This is the portion whether live checking of new password with retype password is done
        
        
        
       
        String newpass = txt_newPass.getText();
        String repass = txt_reNewpass.getText();
          if(!newpass.equals(repass)){
            
              lbl_validate.setText("Password Match Error.Try Again ");
                
              
              if(newpass.equals(repass)){
                  lbl_validate.setText("Both input passwords are matching ");
              }
              
              
        }
         // else{
            //lbl_validate.setText("Both input passwords are matching ");
           // lbl_validate.setText("");
       // }
        
        
      
        
        
    }//GEN-LAST:event_txt_reNewpassKeyPressed

    private void txt_reNewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reNewpassActionPerformed
        // TODO add your handling code here:
        
        String newpass = txt_newPass.getText();
        String repass = txt_reNewpass.getText();
         if(newpass.equals(repass)){
                  lbl_validate.setText("Both input passwords are matching ");
              }
        
    }//GEN-LAST:event_txt_reNewpassActionPerformed

    private void txt_reNewpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_reNewpassKeyReleased
        // TODO add your handling code here:
        
        String newpass = txt_newPass.getText();
        String repass = txt_reNewpass.getText();
         if(newpass.equals(repass)){
                  lbl_validate.setText("Both input passwords are matching ");
              }
    }//GEN-LAST:event_txt_reNewpassKeyReleased

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private javax.swing.JLabel RegisterLoginIcon;
    private javax.swing.JPanel RegisterLoginMain;
    private javax.swing.JLabel RegisterName;
    private javax.swing.JPanel SideLogin;
    private javax.swing.JTextField UnID;
    private javax.swing.JSeparator UniversityIDSeparator;
    private javax.swing.JSeparator UniversityIDSeparator1;
    private javax.swing.JSeparator UniversityIDSeparator2;
    private javax.swing.JButton btn_changePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_validate;
    private javax.swing.JPasswordField txt_newPass;
    private javax.swing.JPasswordField txt_reNewpass;
    // End of variables declaration//GEN-END:variables
}
