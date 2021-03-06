/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campuses;

import InternalFrames.CampusServices;
import InternalFrames.PatanAbout;
import InternalFrames.PatanGallery;

import InternalFrames.PatanLocation;
import Ujaalo.Campuses;

/**
 *
 * @author User
 */
public class PatanCollege extends javax.swing.JFrame {

    /**
     * Creates new form PatanCollege
     */
    public PatanCollege() {
        initComponents();
        
        //AboutText.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        SideTabPanel1 = new javax.swing.JPanel();
        UniversityLogo1 = new javax.swing.JLabel();
        btn_about1 = new javax.swing.JButton();
        btn_location1 = new javax.swing.JButton();
        btn_gallery1 = new javax.swing.JButton();
        btn_services1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LutonPane = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setName("PatanCollege"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(99, 110, 114));
        jPanel2.setForeground(new java.awt.Color(99, 110, 114));

        jPanel4.setBackground(new java.awt.Color(99, 110, 114));
        jPanel4.setForeground(new java.awt.Color(99, 110, 114));

        SideTabPanel1.setBackground(new java.awt.Color(237, 28, 36));
        SideTabPanel1.setMaximumSize(new java.awt.Dimension(270, 768));
        SideTabPanel1.setMinimumSize(new java.awt.Dimension(270, 768));

        UniversityLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uu1.png"))); // NOI18N

        btn_about1.setBackground(new java.awt.Color(237, 28, 36));
        btn_about1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_about1.setForeground(new java.awt.Color(255, 255, 255));
        btn_about1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about1.png"))); // NOI18N
        btn_about1.setText("     About Us");
        btn_about1.setBorder(null);
        btn_about1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_about1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_about1MousePressed(evt);
            }
        });
        btn_about1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_about1ActionPerformed(evt);
            }
        });

        btn_location1.setBackground(new java.awt.Color(237, 28, 36));
        btn_location1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_location1.setForeground(new java.awt.Color(255, 255, 255));
        btn_location1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Campus.png"))); // NOI18N
        btn_location1.setText("     Location");
        btn_location1.setBorder(null);
        btn_location1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_location1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_location1ActionPerformed(evt);
            }
        });

        btn_gallery1.setBackground(new java.awt.Color(237, 28, 36));
        btn_gallery1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_gallery1.setForeground(new java.awt.Color(255, 255, 255));
        btn_gallery1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coursess.png.png"))); // NOI18N
        btn_gallery1.setText("     Gallery");
        btn_gallery1.setBorder(null);
        btn_gallery1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gallery1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gallery1ActionPerformed(evt);
            }
        });

        btn_services1.setBackground(new java.awt.Color(237, 28, 36));
        btn_services1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_services1.setForeground(new java.awt.Color(255, 255, 255));
        btn_services1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/apply.png"))); // NOI18N
        btn_services1.setText("       Services");
        btn_services1.setBorder(null);
        btn_services1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_services1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_services1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SideTabPanel1Layout = new javax.swing.GroupLayout(SideTabPanel1);
        SideTabPanel1.setLayout(SideTabPanel1Layout);
        SideTabPanel1Layout.setHorizontalGroup(
            SideTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_about1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_location1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_gallery1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_services1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(SideTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanel1Layout.createSequentialGroup()
                        .addComponent(UniversityLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43))))
        );
        SideTabPanel1Layout.setVerticalGroup(
            SideTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideTabPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(UniversityLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btn_about1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_location1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_gallery1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_services1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(SideTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1300_1.jpg"))); // NOI18N

        LutonPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LutonPaneLayout = new javax.swing.GroupLayout(LutonPane);
        LutonPane.setLayout(LutonPaneLayout);
        LutonPaneLayout.setHorizontalGroup(
            LutonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LutonPaneLayout.setVerticalGroup(
            LutonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LutonPaneLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(SideTabPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LutonPane))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideTabPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LutonPane)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_about1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_about1MousePressed
        // This will connect another tabbed window inside the same jframe
    }//GEN-LAST:event_btn_about1MousePressed

    private void btn_about1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_about1ActionPerformed
        // TODO add your handling code here:

        PatanAbout ba = new PatanAbout();
        LutonPane.add(ba);
        ba.show();
    }//GEN-LAST:event_btn_about1ActionPerformed

    private void btn_location1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_location1ActionPerformed
        PatanLocation pla = new PatanLocation();
        LutonPane.add(pla);
        pla.show();
    }//GEN-LAST:event_btn_location1ActionPerformed

    private void btn_gallery1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gallery1ActionPerformed
         PatanGallery pga = new PatanGallery();
        LutonPane.add(pga);
        pga.show();
    }//GEN-LAST:event_btn_gallery1ActionPerformed

    private void btn_services1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_services1ActionPerformed
         CampusServices ba = new CampusServices();
       LutonPane.add(ba);
       ba.show();
    }//GEN-LAST:event_btn_services1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        Campuses cgf = new Campuses();
        cgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        Campuses cgf = new Campuses();
        cgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(PatanCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatanCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatanCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatanCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatanCollege().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane LutonPane;
    private javax.swing.JPanel SideTabPanel1;
    private javax.swing.JLabel UniversityLogo1;
    private javax.swing.JButton btn_about1;
    private javax.swing.JButton btn_gallery1;
    private javax.swing.JButton btn_location1;
    private javax.swing.JButton btn_services1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
