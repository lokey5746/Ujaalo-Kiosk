
package Ujaalo;
import Student.Clubs;
import Student.ChangePassword;
import Student.StudentFacilities;
import Student.StudentBookings;
import static Ujaalo.Login.txt_unID;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

import java.lang.String;
import java.net.URL;
import java.sql.Connection;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
/**
 *
 * @author User
 */

public class StudentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form StudentDashboard
     */
    
    Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs = null;
    
    
    
    public StudentDashboard() {
        initComponents();
        
        ShowDate(); //Method For Showing Date in Jlabel named lbl_Date
        ShowTime(); //Method For Showing Time in JLabel named lbl_Time
        AccountDetails();
        LoginInfo();
       
    }

   
    
    void AccountDetails()
    {
        txtUnID.setText(Login.txt_unID.getText());
        txtEmail.setText(Login.txt_email.getText());
        
        String UniID1= Login.txt_unID.getText();
        
        conn = OracleDatabase.ConnectDb();
    
        
        try
    {
        //conn = OracleDatabase.ConnectDb();
        String sql = "SELECT StdName,EnrolledCourse FROM Student WHERE UniversityID=?";
        
        pst = (OraclePreparedStatement) conn.prepareStatement(sql);
        pst.setString(1,Login.txt_unID.getText());
        
        rs =(OracleResultSet) pst.executeQuery();
        
        //ResultSet R = S.executeQuery(sql);
        
       while(rs.next())
           {
              
               txtName.setText(rs.getString(1));
               txtCourse.setText(rs.getString(2));
                
           }
           
             
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    
        
        
        
        
        
        
        
        
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
    
    
    
    
    
    
    
    public void LoginInfo(){
        
        conn = OracleDatabase.ConnectDb();
    
        
        try
    {
        //conn = OracleDatabase.ConnectDb();
        String sql = "SELECT Login_Date FROM SessionManagement WHERE UniversityID=?";
        
        pst = (OraclePreparedStatement) conn.prepareStatement(sql);
        pst.setString(1,Login.txt_unID.getText());
        
        rs =(OracleResultSet) pst.executeQuery();
        
        //ResultSet R = S.executeQuery(sql);
        
       while(rs.next())
           {
              
               //String LoginDate=(rs.getString(1));
               more.setText(rs.getString(1));
               //txtCourse.setText(rs.getString(2));
                
           }
           
            
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    
        
    }
    
    
    
    
    
    
    
     public void UserLog(){
        
        conn = OracleDatabase.ConnectDb();
        String userID = txt_unID.getText();
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
         String date = s.format(d);
         
         String LogDate= more.getText();

         
        try{
           //UPDATE Student SET Password=? WHERE UniversityID=?
           String sql = "UPDATE SessionManagement SET LogOut_Date=? WHERE UniversityID=? ";
           pst = (OraclePreparedStatement) conn.prepareStatement(sql);
           pst.setString(1,date);
           pst.setString(2,userID);
           //pst.setString(3,txtLogIn.getText()); //AND Login_Date=?
           
           
           
           
           
           rs =(OracleResultSet) pst.executeQuery();
           
          
           
       }
       catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
     
     public void ViewEvents(){
          Events ef= new Events();
        ef.setVisible(true);
        this.dispose();
         
         
     }
 
     
     
     public void Logout(){
         
          UserLog();
        
        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
        
     }
    
     
     
     public void StudentFacilities(){
         
         StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
     }
    
     
     public void ChangePassword(){
         ChangePassword pgf = new ChangePassword();
        pgf.setVisible(true);
         
     }
     
     
     
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SideTabPanel = new javax.swing.JPanel();
        UniversityLogo = new javax.swing.JLabel();
        btn_units = new javax.swing.JButton();
        btn_myBookings = new javax.swing.JButton();
        btn_BREO = new javax.swing.JButton();
        btn_Clubs = new javax.swing.JButton();
        btn_changePass = new javax.swing.JButton();
        btn_EduLoan = new javax.swing.JButton();
        icon_help = new javax.swing.JLabel();
        lbl_help = new javax.swing.JLabel();
        icon_logout = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        dyanmicPanel = new javax.swing.JPanel();
        more = new javax.swing.JLabel();
        EventsPanel = new javax.swing.JPanel();
        EventPanel = new javax.swing.JPanel();
        lblEvents = new javax.swing.JLabel();
        EventName1 = new javax.swing.JLabel();
        Events1Icon = new javax.swing.JLabel();
        EventName2 = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        Events2Icon = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        EventsName3 = new javax.swing.JLabel();
        Events3Icon = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        MoreEvents = new javax.swing.JLabel();
        MoreEventsIcon = new javax.swing.JLabel();
        CampusPanel = new javax.swing.JPanel();
        CampusServices = new javax.swing.JPanel();
        lblCampusServices = new javax.swing.JLabel();
        AllServices = new javax.swing.JLabel();
        Separator4 = new javax.swing.JSeparator();
        Separator5 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        CampusServices1 = new javax.swing.JLabel();
        CampusServices2 = new javax.swing.JLabel();
        CampusServices3 = new javax.swing.JLabel();
        CampusServices1Icon = new javax.swing.JLabel();
        CampusServices2Icon = new javax.swing.JLabel();
        CampusServices3Icon = new javax.swing.JLabel();
        AllServicesIcon = new javax.swing.JLabel();
        AccomodationPanel = new javax.swing.JPanel();
        Accomodation = new javax.swing.JPanel();
        lblAccomodation = new javax.swing.JLabel();
        Separator6 = new javax.swing.JSeparator();
        Accomodation1 = new javax.swing.JLabel();
        Accomodation12 = new javax.swing.JLabel();
        Accomodation3 = new javax.swing.JLabel();
        Accomodation4 = new javax.swing.JLabel();
        Separator7 = new javax.swing.JSeparator();
        StudentPanel = new javax.swing.JPanel();
        Student = new javax.swing.JPanel();
        Studentlife = new javax.swing.JLabel();
        Separator11 = new javax.swing.JSeparator();
        Separator10 = new javax.swing.JSeparator();
        StudentLife1 = new javax.swing.JLabel();
        StudentLife2 = new javax.swing.JLabel();
        Separator9 = new javax.swing.JSeparator();
        StudentLifeIcon5 = new javax.swing.JLabel();
        CampusServices4 = new javax.swing.JLabel();
        CampusServices3Icon1 = new javax.swing.JLabel();
        CampusServices2Icon1 = new javax.swing.JLabel();
        FeaturedEvents = new javax.swing.JPanel();
        Events = new javax.swing.JPanel();
        FeatureEvents = new javax.swing.JLabel();
        UpcomingEvents = new javax.swing.JLabel();
        ProfileIcon = new javax.swing.JLabel();
        uniID = new javax.swing.JLabel();
        StudentName = new javax.swing.JLabel();
        StudentEmail = new javax.swing.JLabel();
        AccountInformation = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        lbl_Date = new javax.swing.JLabel();
        lbl_Time = new javax.swing.JLabel();
        txtUnID = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();
        txtCourse = new javax.swing.JLabel();
        WelcomeNotification = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));

        MainPanel.setBackground(new java.awt.Color(99, 110, 114));
        MainPanel.setMaximumSize(new java.awt.Dimension(1366, 768));
        MainPanel.setMinimumSize(new java.awt.Dimension(1366, 768));

        SideTabPanel.setBackground(new java.awt.Color(237, 28, 36));
        SideTabPanel.setMaximumSize(new java.awt.Dimension(270, 768));
        SideTabPanel.setMinimumSize(new java.awt.Dimension(270, 768));

        UniversityLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uu1.png"))); // NOI18N

        btn_units.setBackground(new java.awt.Color(237, 28, 36));
        btn_units.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_units.setForeground(new java.awt.Color(255, 255, 255));
        btn_units.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/club12.png"))); // NOI18N
        btn_units.setText("      Dashboard      ");
        btn_units.setBorder(null);
        btn_units.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_units.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_unitsMousePressed(evt);
            }
        });

        btn_myBookings.setBackground(new java.awt.Color(237, 28, 36));
        btn_myBookings.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_myBookings.setForeground(new java.awt.Color(255, 255, 255));
        btn_myBookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/e-library.png"))); // NOI18N
        btn_myBookings.setText("    My Bookings      ");
        btn_myBookings.setToolTipText("");
        btn_myBookings.setBorder(null);
        btn_myBookings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_myBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_myBookingsActionPerformed(evt);
            }
        });

        btn_BREO.setBackground(new java.awt.Color(237, 28, 36));
        btn_BREO.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_BREO.setForeground(new java.awt.Color(255, 255, 255));
        btn_BREO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BREO.png"))); // NOI18N
        btn_BREO.setText("      BREO               ");
        btn_BREO.setBorder(null);
        btn_BREO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_BREO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BREOMouseClicked(evt);
            }
        });
        btn_BREO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BREOActionPerformed(evt);
            }
        });

        btn_Clubs.setBackground(new java.awt.Color(237, 28, 36));
        btn_Clubs.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_Clubs.setForeground(new java.awt.Color(255, 255, 255));
        btn_Clubs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clubs1.png"))); // NOI18N
        btn_Clubs.setText("     Clubs                ");
        btn_Clubs.setBorder(null);
        btn_Clubs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClubsActionPerformed(evt);
            }
        });

        btn_changePass.setBackground(new java.awt.Color(237, 28, 36));
        btn_changePass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_changePass.setForeground(new java.awt.Color(255, 255, 255));
        btn_changePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/changepassword.png"))); // NOI18N
        btn_changePass.setText("  Change Password");
        btn_changePass.setBorder(null);
        btn_changePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changePassActionPerformed(evt);
            }
        });

        btn_EduLoan.setBackground(new java.awt.Color(237, 28, 36));
        btn_EduLoan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_EduLoan.setForeground(new java.awt.Color(255, 255, 255));
        btn_EduLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loan.png"))); // NOI18N
        btn_EduLoan.setText("      Education Loan ");
        btn_EduLoan.setBorder(null);
        btn_EduLoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EduLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EduLoanActionPerformed(evt);
            }
        });

        icon_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help.png"))); // NOI18N
        icon_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_help.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_help.setForeground(new java.awt.Color(255, 255, 255));
        lbl_help.setText("Help");

        icon_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        icon_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_logoutMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SideTabPanelLayout = new javax.swing.GroupLayout(SideTabPanel);
        SideTabPanel.setLayout(SideTabPanelLayout);
        SideTabPanelLayout.setHorizontalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_units, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_myBookings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_BREO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Clubs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_changePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_EduLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(icon_logout)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_help)
                .addGap(18, 18, 18)
                .addComponent(lbl_help)
                .addGap(31, 31, 31))
        );
        SideTabPanelLayout.setVerticalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideTabPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_units, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_myBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_BREO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Clubs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_changePass, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_EduLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(icon_help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(icon_logout, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addComponent(logout)
                        .addGap(31, 31, 31))))
        );

        dyanmicPanel.setBackground(new java.awt.Color(99, 110, 114));
        dyanmicPanel.setMaximumSize(new java.awt.Dimension(1090, 768));
        dyanmicPanel.setMinimumSize(new java.awt.Dimension(1090, 768));

        more.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        more.setForeground(new java.awt.Color(255, 255, 255));
        more.setText("More...");
        more.setPreferredSize(new java.awt.Dimension(26, 22));

        EventsPanel.setBackground(new java.awt.Color(255, 255, 255));
        EventsPanel.setForeground(new java.awt.Color(255, 102, 102));
        EventsPanel.setPreferredSize(new java.awt.Dimension(300, 238));

        EventPanel.setBackground(new java.awt.Color(237, 28, 36));

        lblEvents.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEvents.setForeground(new java.awt.Color(255, 255, 255));
        lblEvents.setText("Events");

        javax.swing.GroupLayout EventPanelLayout = new javax.swing.GroupLayout(EventPanel);
        EventPanel.setLayout(EventPanelLayout);
        EventPanelLayout.setHorizontalGroup(
            EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPanelLayout.setVerticalGroup(
            EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        EventName1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EventName1.setForeground(new java.awt.Color(51, 51, 51));
        EventName1.setText("Artificial Intelligence Workshop");
        EventName1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EventName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventName1MouseClicked(evt);
            }
        });

        Events1Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ai.png"))); // NOI18N

        EventName2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EventName2.setForeground(new java.awt.Color(51, 51, 51));
        EventName2.setText("Computer Science Conference");
        EventName2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EventName2.setPreferredSize(new java.awt.Dimension(239, 19));
        EventName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventName2MouseClicked(evt);
            }
        });

        Separator.setBackground(new java.awt.Color(153, 153, 153));
        Separator.setForeground(new java.awt.Color(153, 153, 153));
        Separator.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator.setPreferredSize(new java.awt.Dimension(261, 24));

        Events2Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/conf.png"))); // NOI18N

        Separator1.setBackground(new java.awt.Color(153, 153, 153));
        Separator1.setForeground(new java.awt.Color(153, 153, 153));
        Separator1.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator1.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator1.setPreferredSize(new java.awt.Dimension(261, 24));

        EventsName3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EventsName3.setForeground(new java.awt.Color(51, 51, 51));
        EventsName3.setText("New Year Special 2076");
        EventsName3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EventsName3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventsName3MouseClicked(evt);
            }
        });

        Events3Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newYear.png"))); // NOI18N

        Separator2.setBackground(new java.awt.Color(153, 153, 153));
        Separator2.setForeground(new java.awt.Color(153, 153, 153));
        Separator2.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator2.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator2.setPreferredSize(new java.awt.Dimension(261, 24));

        MoreEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/more1.png"))); // NOI18N
        MoreEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoreEventsMouseClicked(evt);
            }
        });

        MoreEventsIcon.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        MoreEventsIcon.setForeground(new java.awt.Color(51, 51, 51));
        MoreEventsIcon.setText("View All Events");
        MoreEventsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MoreEventsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoreEventsIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EventsPanelLayout = new javax.swing.GroupLayout(EventsPanel);
        EventsPanel.setLayout(EventsPanelLayout);
        EventsPanelLayout.setHorizontalGroup(
            EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EventsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventsPanelLayout.createSequentialGroup()
                        .addComponent(Events1Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventName1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventsPanelLayout.createSequentialGroup()
                        .addComponent(Events2Icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventName2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(EventsPanelLayout.createSequentialGroup()
                        .addComponent(Events3Icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventsName3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventsPanelLayout.createSequentialGroup()
                        .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Separator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Separator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Separator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(EventsPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(MoreEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoreEventsIcon)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EventsPanelLayout.setVerticalGroup(
            EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsPanelLayout.createSequentialGroup()
                .addComponent(EventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Events1Icon)
                    .addComponent(EventName1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventName2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Events2Icon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Events3Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventsName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoreEventsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoreEvents))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CampusPanel.setBackground(new java.awt.Color(255, 255, 255));
        CampusPanel.setForeground(new java.awt.Color(204, 102, 0));
        CampusPanel.setPreferredSize(new java.awt.Dimension(220, 200));

        CampusServices.setBackground(new java.awt.Color(153, 102, 255));
        CampusServices.setPreferredSize(new java.awt.Dimension(300, 37));

        lblCampusServices.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCampusServices.setForeground(new java.awt.Color(255, 255, 255));
        lblCampusServices.setText("Campus Service");

        javax.swing.GroupLayout CampusServicesLayout = new javax.swing.GroupLayout(CampusServices);
        CampusServices.setLayout(CampusServicesLayout);
        CampusServicesLayout.setHorizontalGroup(
            CampusServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CampusServicesLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(lblCampusServices, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        CampusServicesLayout.setVerticalGroup(
            CampusServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCampusServices, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        AllServices.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        AllServices.setForeground(new java.awt.Color(51, 51, 51));
        AllServices.setText("View All Services");
        AllServices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AllServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllServicesMouseClicked(evt);
            }
        });

        Separator4.setBackground(new java.awt.Color(153, 153, 153));
        Separator4.setForeground(new java.awt.Color(153, 153, 153));
        Separator4.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator4.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator4.setPreferredSize(new java.awt.Dimension(261, 24));

        Separator5.setBackground(new java.awt.Color(153, 153, 153));
        Separator5.setForeground(new java.awt.Color(153, 153, 153));
        Separator5.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator5.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator5.setPreferredSize(new java.awt.Dimension(261, 24));

        Separator3.setBackground(new java.awt.Color(153, 153, 153));
        Separator3.setForeground(new java.awt.Color(153, 153, 153));
        Separator3.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator3.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator3.setPreferredSize(new java.awt.Dimension(261, 24));

        CampusServices1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hostel.png"))); // NOI18N

        CampusServices2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        CampusServices2.setForeground(new java.awt.Color(51, 51, 51));
        CampusServices2.setText("Conference Hall  Research Labs");
        CampusServices2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CampusServices2.setPreferredSize(new java.awt.Dimension(239, 19));
        CampusServices2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampusServices2MouseClicked(evt);
            }
        });

        CampusServices3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/more1.png"))); // NOI18N
        CampusServices3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampusServices3MouseClicked(evt);
            }
        });

        CampusServices1Icon.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        CampusServices1Icon.setForeground(new java.awt.Color(51, 51, 51));
        CampusServices1Icon.setText("Student Village(Hostel)");
        CampusServices1Icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CampusServices1Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampusServices1IconMouseClicked(evt);
            }
        });

        CampusServices2Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Recreation.png"))); // NOI18N

        CampusServices3Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/conf.png"))); // NOI18N

        AllServicesIcon.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        AllServicesIcon.setForeground(new java.awt.Color(51, 51, 51));
        AllServicesIcon.setText("Recreational Services");
        AllServicesIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AllServicesIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllServicesIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CampusPanelLayout = new javax.swing.GroupLayout(CampusPanel);
        CampusPanel.setLayout(CampusPanelLayout);
        CampusPanelLayout.setHorizontalGroup(
            CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CampusPanelLayout.createSequentialGroup()
                .addComponent(CampusServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CampusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addComponent(CampusServices1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampusServices1Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(Separator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Separator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Separator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addComponent(CampusServices3Icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampusServices2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addComponent(CampusServices2Icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AllServicesIcon))
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(CampusServices3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AllServices)))
                .addContainerGap())
        );
        CampusPanelLayout.setVerticalGroup(
            CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CampusPanelLayout.createSequentialGroup()
                .addComponent(CampusServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CampusServices1)
                    .addComponent(CampusServices1Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampusServices2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampusServices3Icon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CampusServices2Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllServicesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AllServices, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampusServices3)))
        );

        AccomodationPanel.setBackground(new java.awt.Color(255, 255, 255));
        AccomodationPanel.setForeground(new java.awt.Color(102, 255, 0));
        AccomodationPanel.setPreferredSize(new java.awt.Dimension(300, 238));

        Accomodation.setBackground(new java.awt.Color(153, 0, 153));
        Accomodation.setPreferredSize(new java.awt.Dimension(300, 37));

        lblAccomodation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAccomodation.setForeground(new java.awt.Color(255, 255, 255));
        lblAccomodation.setText("Accomodation");

        javax.swing.GroupLayout AccomodationLayout = new javax.swing.GroupLayout(Accomodation);
        Accomodation.setLayout(AccomodationLayout);
        AccomodationLayout.setHorizontalGroup(
            AccomodationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccomodationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        AccomodationLayout.setVerticalGroup(
            AccomodationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAccomodation, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        Separator6.setBackground(new java.awt.Color(153, 153, 153));
        Separator6.setForeground(new java.awt.Color(153, 153, 153));
        Separator6.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator6.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator6.setPreferredSize(new java.awt.Dimension(261, 24));

        Accomodation1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accomo.png"))); // NOI18N

        Accomodation12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Accomodation12.setForeground(new java.awt.Color(51, 51, 51));
        Accomodation12.setText(" Bedford Campus Accomodation");
        Accomodation12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accomodation12.setPreferredSize(new java.awt.Dimension(239, 19));
        Accomodation12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Accomodation12MouseClicked(evt);
            }
        });

        Accomodation3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Accomodation3.setForeground(new java.awt.Color(51, 51, 51));
        Accomodation3.setText("Luton Campus Accomodation");
        Accomodation3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accomodation3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Accomodation3MouseClicked(evt);
            }
        });

        Accomodation4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/conf.png"))); // NOI18N

        Separator7.setBackground(new java.awt.Color(153, 153, 153));
        Separator7.setForeground(new java.awt.Color(153, 153, 153));
        Separator7.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator7.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator7.setPreferredSize(new java.awt.Dimension(261, 24));

        javax.swing.GroupLayout AccomodationPanelLayout = new javax.swing.GroupLayout(AccomodationPanel);
        AccomodationPanel.setLayout(AccomodationPanelLayout);
        AccomodationPanelLayout.setHorizontalGroup(
            AccomodationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Accomodation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AccomodationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccomodationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Separator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccomodationPanelLayout.createSequentialGroup()
                        .addComponent(Accomodation4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Accomodation12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccomodationPanelLayout.createSequentialGroup()
                        .addComponent(Accomodation1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(Accomodation3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        AccomodationPanelLayout.setVerticalGroup(
            AccomodationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccomodationPanelLayout.createSequentialGroup()
                .addComponent(Accomodation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(AccomodationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Accomodation3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accomodation1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AccomodationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Accomodation12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accomodation4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        StudentPanel.setBackground(new java.awt.Color(255, 255, 255));
        StudentPanel.setForeground(new java.awt.Color(153, 0, 51));
        StudentPanel.setPreferredSize(new java.awt.Dimension(300, 238));

        Student.setBackground(new java.awt.Color(153, 153, 0));
        Student.setPreferredSize(new java.awt.Dimension(300, 37));

        Studentlife.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Studentlife.setForeground(new java.awt.Color(255, 255, 255));
        Studentlife.setText("Student Life");

        javax.swing.GroupLayout StudentLayout = new javax.swing.GroupLayout(Student);
        Student.setLayout(StudentLayout);
        StudentLayout.setHorizontalGroup(
            StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(Studentlife, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        StudentLayout.setVerticalGroup(
            StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Studentlife, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        Separator11.setBackground(new java.awt.Color(153, 153, 153));
        Separator11.setForeground(new java.awt.Color(153, 153, 153));
        Separator11.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator11.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator11.setPreferredSize(new java.awt.Dimension(261, 24));

        Separator10.setBackground(new java.awt.Color(153, 153, 153));
        Separator10.setForeground(new java.awt.Color(153, 153, 153));
        Separator10.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator10.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator10.setPreferredSize(new java.awt.Dimension(261, 24));

        StudentLife1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StudentLife1.setForeground(new java.awt.Color(51, 51, 51));
        StudentLife1.setText("Student Life / Student Village");
        StudentLife1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentLife1.setPreferredSize(new java.awt.Dimension(239, 19));
        StudentLife1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentLife1MouseClicked(evt);
            }
        });

        StudentLife2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StudentLife2.setForeground(new java.awt.Color(51, 51, 51));
        StudentLife2.setText("Campus Services");
        StudentLife2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentLife2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentLife2MouseClicked(evt);
            }
        });

        Separator9.setBackground(new java.awt.Color(153, 153, 153));
        Separator9.setForeground(new java.awt.Color(153, 153, 153));
        Separator9.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator9.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator9.setPreferredSize(new java.awt.Dimension(261, 24));

        StudentLifeIcon5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StudentLifeIcon5.setForeground(new java.awt.Color(51, 51, 51));
        StudentLifeIcon5.setText("Student Facilities");
        StudentLifeIcon5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentLifeIcon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentLifeIcon5MouseClicked(evt);
            }
        });

        CampusServices4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Services.png"))); // NOI18N

        CampusServices3Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentLife.png"))); // NOI18N

        CampusServices2Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Feat.png"))); // NOI18N

        javax.swing.GroupLayout StudentPanelLayout = new javax.swing.GroupLayout(StudentPanel);
        StudentPanel.setLayout(StudentPanelLayout);
        StudentPanelLayout.setHorizontalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CampusServices4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StudentLife2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separator11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Separator10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Separator9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CampusServices2Icon1)
                        .addGap(18, 18, 18)
                        .addComponent(StudentLifeIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CampusServices3Icon1)
                        .addGap(18, 18, 18)
                        .addComponent(StudentLife1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentPanelLayout.setVerticalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addComponent(Student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StudentLife2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampusServices4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(Separator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StudentLife1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampusServices3Icon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentLifeIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampusServices2Icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        FeaturedEvents.setBackground(new java.awt.Color(255, 255, 255));

        Events.setBackground(new java.awt.Color(255, 153, 102));

        FeatureEvents.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FeatureEvents.setForeground(new java.awt.Color(255, 255, 255));
        FeatureEvents.setText("Featured Events");

        javax.swing.GroupLayout EventsLayout = new javax.swing.GroupLayout(Events);
        Events.setLayout(EventsLayout);
        EventsLayout.setHorizontalGroup(
            EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(FeatureEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventsLayout.setVerticalGroup(
            EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FeatureEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        UpcomingEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AIW.jpg"))); // NOI18N

        javax.swing.GroupLayout FeaturedEventsLayout = new javax.swing.GroupLayout(FeaturedEvents);
        FeaturedEvents.setLayout(FeaturedEventsLayout);
        FeaturedEventsLayout.setHorizontalGroup(
            FeaturedEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Events, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(UpcomingEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FeaturedEventsLayout.setVerticalGroup(
            FeaturedEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeaturedEventsLayout.createSequentialGroup()
                .addComponent(Events, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(UpcomingEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Profile.png"))); // NOI18N

        uniID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        uniID.setForeground(new java.awt.Color(255, 255, 255));
        uniID.setText("University ID :");

        StudentName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        StudentName.setForeground(new java.awt.Color(255, 255, 255));
        StudentName.setText("Name :");

        StudentEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        StudentEmail.setForeground(new java.awt.Color(255, 255, 255));
        StudentEmail.setText("Email :");

        AccountInformation.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        AccountInformation.setForeground(new java.awt.Color(255, 255, 255));
        AccountInformation.setText("Account Information");

        Date.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Date :");

        lbl_Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Date.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Date.setText("Date");

        lbl_Time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Time.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Time.setText("Time");

        txtUnID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        Course.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Course.setForeground(new java.awt.Color(255, 255, 255));
        Course.setText("Course :");

        txtCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        WelcomeNotification.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        WelcomeNotification.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeNotification.setText("Welcome To Ujaalo Kiosk");

        javax.swing.GroupLayout dyanmicPanelLayout = new javax.swing.GroupLayout(dyanmicPanel);
        dyanmicPanel.setLayout(dyanmicPanelLayout);
        dyanmicPanelLayout.setHorizontalGroup(
            dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(more, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(dyanmicPanelLayout.createSequentialGroup()
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccomodationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EventsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(FeaturedEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dyanmicPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(WelcomeNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dyanmicPanelLayout.createSequentialGroup()
                                .addComponent(uniID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUnID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                                .addComponent(ProfileIcon)
                                .addGap(18, 18, 18)
                                .addComponent(AccountInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                                .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dyanmicPanelLayout.createSequentialGroup()
                                        .addComponent(StudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(dyanmicPanelLayout.createSequentialGroup()
                                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                                .addComponent(Date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        dyanmicPanelLayout.setVerticalGroup(
            dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dyanmicPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProfileIcon)
                            .addComponent(AccountInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUnID, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(uniID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(StudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(Course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Date)
                            .addComponent(lbl_Time))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FeaturedEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(dyanmicPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(WelcomeNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dyanmicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CampusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(StudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dyanmicPanelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(EventsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(AccomodationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15)
                .addComponent(more, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SideTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dyanmicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dyanmicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_unitsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_unitsMousePressed
        // This will connect another tabbed window inside the same jframe
 
        //gowdie.Isobel [] Pets = new gowdie.Isobel[4];
        
        
        
      

    }//GEN-LAST:event_btn_unitsMousePressed

    private void btn_myBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_myBookingsActionPerformed
        // TODO add your handling code here:
        StudentBookings bgf = new StudentBookings();
        bgf.setVisible(true);
        
        
        
    }//GEN-LAST:event_btn_myBookingsActionPerformed

    private void btn_BREOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BREOActionPerformed
        // TODO add your handling code here:
          //System.out.println("This is Closing function");
//        NewBrowser ubr = new NewBrowser();
//        String[] args = {};
//        ubr.main(args);
//        
         try {
    Desktop.getDesktop().browse(new URL("https://breo.beds.ac.uk/webapps/login/").toURI());
} catch (Exception e) {}
        
        
    }//GEN-LAST:event_btn_BREOActionPerformed

    private void btn_ClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClubsActionPerformed
        // TODO add your handling code here:
        
        Clubs cgf = new Clubs();
        cgf.setVisible(true);
    
        
        
    }//GEN-LAST:event_btn_ClubsActionPerformed

    private void btn_changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changePassActionPerformed
        // This will enables the functions of change password
        ChangePassword pgf = new ChangePassword();
        pgf.setVisible(true);
       
    }//GEN-LAST:event_btn_changePassActionPerformed

    private void btn_EduLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EduLoanActionPerformed
        // This will enable the function of 
        
         try {
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "D:\\Java Project\\Ujaalo Kiosk\\src\\PdfFiles\\EducationLoan.pdf");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error");
    }
         
        
        
    }//GEN-LAST:event_btn_EduLoanActionPerformed

    private void EventName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventName1MouseClicked
        // TODO add your handling code here:
        
//        Events ef= new Events();
//        ef.setVisible(true);
//        this.dispose();

        ViewEvents();
     

    }//GEN-LAST:event_EventName1MouseClicked

    private void icon_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_logoutMouseClicked
        // TODO add your handling code here:
        
        UserLog();
        
        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_icon_logoutMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        UserLog();
        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logoutMouseClicked

    private void btn_BREOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BREOMouseClicked
        // TODO add your handling code here:
        
        // NewBrowser ubr = new NewBrowser();
        //String[] args = {};
       // ubr.main(args);
        
    }//GEN-LAST:event_btn_BREOMouseClicked

    private void EventName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventName2MouseClicked
        // TODO add your handling code here:
        
        Events ef= new Events();
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EventName2MouseClicked

    private void EventsName3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsName3MouseClicked
        // TODO add your handling code here:
        
        Events ef= new Events();
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EventsName3MouseClicked

    private void MoreEventsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreEventsIconMouseClicked
        // TODO add your handling code here:
        
        Events ef= new Events();
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MoreEventsIconMouseClicked

    private void MoreEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreEventsMouseClicked
        // TODO add your handling code here:
        
        Events ef= new Events();
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MoreEventsMouseClicked

    private void CampusServices1IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampusServices1IconMouseClicked
        // TODO add your handling code here:
        
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CampusServices1IconMouseClicked

    private void CampusServices2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampusServices2MouseClicked
        // TODO add your handling code here:
        
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CampusServices2MouseClicked

    private void AllServicesIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllServicesIconMouseClicked
        // TODO add your handling code here:
        
        
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AllServicesIconMouseClicked

    private void CampusServices3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampusServices3MouseClicked
        // TODO add your handling code here:
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CampusServices3MouseClicked

    private void AllServicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllServicesMouseClicked
        // TODO add your handling code here:
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AllServicesMouseClicked

    private void Accomodation3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accomodation3MouseClicked
        // TODO add your handling code here:
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Accomodation3MouseClicked

    private void Accomodation12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accomodation12MouseClicked
        // TODO add your handling code here:
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Accomodation12MouseClicked

    private void StudentLife2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentLife2MouseClicked
        // TODO add your handling code here:
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StudentLife2MouseClicked

    private void StudentLife1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentLife1MouseClicked
        // TODO add your handling code here:
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StudentLife1MouseClicked

    private void StudentLifeIcon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentLifeIcon5MouseClicked
        // TODO add your handling code here:
        StudentFacilities sf = new StudentFacilities();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StudentLifeIcon5MouseClicked

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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard().setVisible(true);
                
                //new StudentDashboard().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Accomodation;
    private javax.swing.JLabel Accomodation1;
    private javax.swing.JLabel Accomodation12;
    private javax.swing.JLabel Accomodation3;
    private javax.swing.JLabel Accomodation4;
    private javax.swing.JPanel AccomodationPanel;
    private javax.swing.JLabel AccountInformation;
    private javax.swing.JLabel AllServices;
    private javax.swing.JLabel AllServicesIcon;
    private javax.swing.JPanel CampusPanel;
    private javax.swing.JPanel CampusServices;
    private javax.swing.JLabel CampusServices1;
    private javax.swing.JLabel CampusServices1Icon;
    private javax.swing.JLabel CampusServices2;
    private javax.swing.JLabel CampusServices2Icon;
    private javax.swing.JLabel CampusServices2Icon1;
    private javax.swing.JLabel CampusServices3;
    private javax.swing.JLabel CampusServices3Icon;
    private javax.swing.JLabel CampusServices3Icon1;
    private javax.swing.JLabel CampusServices4;
    private javax.swing.JLabel Course;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel EventName1;
    private javax.swing.JLabel EventName2;
    private javax.swing.JPanel EventPanel;
    private javax.swing.JPanel Events;
    private javax.swing.JLabel Events1Icon;
    private javax.swing.JLabel Events2Icon;
    private javax.swing.JLabel Events3Icon;
    private javax.swing.JLabel EventsName3;
    private javax.swing.JPanel EventsPanel;
    private javax.swing.JLabel FeatureEvents;
    private javax.swing.JPanel FeaturedEvents;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MoreEvents;
    private javax.swing.JLabel MoreEventsIcon;
    private javax.swing.JLabel ProfileIcon;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator10;
    private javax.swing.JSeparator Separator11;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JSeparator Separator7;
    private javax.swing.JSeparator Separator9;
    private javax.swing.JPanel SideTabPanel;
    private javax.swing.JPanel Student;
    private javax.swing.JLabel StudentEmail;
    private javax.swing.JLabel StudentLife1;
    private javax.swing.JLabel StudentLife2;
    private javax.swing.JLabel StudentLifeIcon5;
    private javax.swing.JLabel StudentName;
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JLabel Studentlife;
    private javax.swing.JLabel UniversityLogo;
    private javax.swing.JLabel UpcomingEvents;
    private javax.swing.JLabel WelcomeNotification;
    private javax.swing.JButton btn_BREO;
    private javax.swing.JButton btn_Clubs;
    private javax.swing.JButton btn_EduLoan;
    private javax.swing.JButton btn_changePass;
    private javax.swing.JButton btn_myBookings;
    private javax.swing.JButton btn_units;
    private javax.swing.JPanel dyanmicPanel;
    private javax.swing.JLabel icon_help;
    private javax.swing.JLabel icon_logout;
    private javax.swing.JLabel lblAccomodation;
    private javax.swing.JLabel lblCampusServices;
    private javax.swing.JLabel lblEvents;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JLabel lbl_Time;
    private javax.swing.JLabel lbl_help;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel more;
    private javax.swing.JLabel txtCourse;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtName;
    public static javax.swing.JLabel txtUnID;
    private javax.swing.JLabel uniID;
    // End of variables declaration//GEN-END:variables
}
