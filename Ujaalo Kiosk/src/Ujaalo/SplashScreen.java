
package Ujaalo;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

/**
 *
 * Developer = Kshitij Bajagain (Backend Main Coder)
 *             Prabin Chapagain (Prototype Design)
               Prajwol Thapa    (Content Writer)
               Lokendra Dangi   (Documentation)
               Buddha Lama      (Coding and Miscelleanous)
 */




public class SplashScreen extends javax.swing.JFrame {

   
    
        

    public SplashScreen() {
        
               
        initComponents();
        
        ShowDate(); //Method For Showing Date in Jlabel named lbl_Date
        ShowTime(); //Method For Showing Time in JLabel named lbl_Time
    }

    
    //Method Showing Date
    void ShowDate(){
        
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        lbl_Date.setText(s.format(d));
        
    }
    
    
    void ShowTime(){
        new Timer(0,new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lbl_Time.setText(s.format(d));
                   
            }  
        }
              
        ).start();
              
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplashScreenPanel = new javax.swing.JPanel();
        KioskLogo = new javax.swing.JLabel();
        FacebookIcon = new javax.swing.JLabel();
        GmailIcon = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        ConatctUs = new javax.swing.JLabel();
        kioskTitle = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        loadingnumber = new javax.swing.JLabel();
        SlideShow = new javax.swing.JLabel();
        lbl_Date = new javax.swing.JLabel();
        lbl_Time = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        SplashScreenPanel.setBackground(new java.awt.Color(99, 110, 109));
        SplashScreenPanel.setMaximumSize(new java.awt.Dimension(1366, 768));
        SplashScreenPanel.setMinimumSize(new java.awt.Dimension(1366, 768));
        SplashScreenPanel.setPreferredSize(new java.awt.Dimension(1366, 768));

        KioskLogo.setForeground(new java.awt.Color(255, 102, 102));
        KioskLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logofinal.png"))); // NOI18N
        KioskLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        KioskLogo.setPreferredSize(new java.awt.Dimension(400, 400));
        KioskLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                KioskLogoMouseReleased(evt);
            }
        });

        FacebookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/face1.png"))); // NOI18N
        FacebookIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FacebookIcon.setPreferredSize(new java.awt.Dimension(65, 65));

        GmailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gmail12.png"))); // NOI18N
        GmailIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GmailIcon.setPreferredSize(new java.awt.Dimension(65, 65));

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_twitter_24px.png"))); // NOI18N
        twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter.setPreferredSize(new java.awt.Dimension(65, 65));

        ConatctUs.setBackground(new java.awt.Color(255, 255, 255));
        ConatctUs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConatctUs.setForeground(new java.awt.Color(255, 255, 255));
        ConatctUs.setText("Contact us:");

        kioskTitle.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        kioskTitle.setForeground(new java.awt.Color(255, 255, 255));
        kioskTitle.setText("Ujaalo Student Information Kiosk");

        loadingBar.setForeground(new java.awt.Color(0, 255, 102));
        loadingBar.setPreferredSize(new java.awt.Dimension(146, 12));

        loadingnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loadingnumber.setForeground(new java.awt.Color(255, 255, 255));
        loadingnumber.setText("99%");

        SlideShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grad1.png"))); // NOI18N

        lbl_Date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_Date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Date.setText("Date");

        lbl_Time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_Time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Time.setText("Time");

        Date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Date");

        Time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));
        Time.setText("Time");

        javax.swing.GroupLayout SplashScreenPanelLayout = new javax.swing.GroupLayout(SplashScreenPanel);
        SplashScreenPanel.setLayout(SplashScreenPanelLayout);
        SplashScreenPanelLayout.setHorizontalGroup(
            SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenPanelLayout.createSequentialGroup()
                .addComponent(KioskLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SplashScreenPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loadingBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kioskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(202, 202, 202))
                    .addGroup(SplashScreenPanelLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(SlideShow)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(SplashScreenPanelLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(ConatctUs)
                .addGap(102, 102, 102)
                .addComponent(FacebookIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(GmailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222)
                .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenPanelLayout.createSequentialGroup()
                        .addComponent(loadingnumber)
                        .addGap(520, 520, 520))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenPanelLayout.createSequentialGroup()
                        .addComponent(Date)
                        .addGap(28, 28, 28)
                        .addComponent(lbl_Date)
                        .addGap(37, 37, 37)
                        .addComponent(Time)
                        .addGap(26, 26, 26)
                        .addComponent(lbl_Time)
                        .addGap(29, 29, 29))))
        );
        SplashScreenPanelLayout.setVerticalGroup(
            SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Date)
                    .addComponent(Date)
                    .addComponent(Time)
                    .addComponent(lbl_Time))
                .addGap(46, 46, 46)
                .addComponent(kioskTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(SlideShow)
                .addGap(38, 38, 38)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loadingnumber)
                .addGap(63, 63, 63)
                .addGroup(SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twitter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GmailIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(SplashScreenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KioskLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addGroup(SplashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FacebookIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenPanelLayout.createSequentialGroup()
                        .addComponent(ConatctUs)
                        .addGap(27, 27, 27))))
        );

        getContentPane().add(SplashScreenPanel);
        SplashScreenPanel.setBounds(0, 0, 1366, 768);

        setBounds(0, 0, 1366, 757);
    }// </editor-fold>//GEN-END:initComponents

    private void KioskLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KioskLogoMouseReleased
        
        //This is Slider Function for Images automically changing while loading of kiosk is performed
        //But these portion are mentioned inside comment for now 
        
        
        
        
        
        
        //AnimationClass AC = new AnimationClass(); 
        //AC.jLabelXRight(0, 800, 10, 2, KioskLogo);
        
    }//GEN-LAST:event_KioskLogoMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        //Splah Screen object initialization By KB
        
        SplashScreen Splash= new SplashScreen();
        /* Create and display the form */
        
        // Events for Splah Screen
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            
            
            //This is a method which makes image and loading screen thread
            public void run() {
                Splash.setVisible(true);
            }
        });
        
        KioskMain kmr= new KioskMain();
        try{
            for(int i=0; i<=100; i++)
            {
                Thread.sleep(60); // Thread can be changed inorder to change timing between loading screen and many more
                Splash.loadingnumber.setText(Integer.toString(i) + "%");
                Splash.loadingBar.setValue(i);
                
                //JOptionPane.showMessageDialog(null, "there is no any image path");
                  
            }
        }catch(Exception e){}
        //int i = 0;
        
        
        // JOPTIONPANE for completion of 100% of SplashScreen
        /**if (i<=100){
            Component Explore = null;
         JOptionPane.showMessageDialog(Explore, "Explore Ujaalo Student Information System.");
        }
        **/
        new SplashScreen().setVisible(false);
        kmr.setVisible(true);
        Splash.dispose();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConatctUs;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel FacebookIcon;
    private javax.swing.JLabel GmailIcon;
    private javax.swing.JLabel KioskLogo;
    private javax.swing.JLabel SlideShow;
    private javax.swing.JPanel SplashScreenPanel;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel kioskTitle;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JLabel lbl_Time;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingnumber;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables
}
