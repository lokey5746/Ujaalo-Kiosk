/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Ujaalo.OracleDatabase;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author User
 */
public class StudentInfo extends javax.swing.JFrame {

    
    
    
     Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs = null;
    
    /**
     * Creates new form StudentInfo
     */
    public StudentInfo() {
        initComponents();
        
        StudentInformation();
    }
    
    
    
    
    public void StudentInformation(){
    
    DefaultTableModel table = new DefaultTableModel();
   
   
    
    table.addColumn("UniversityID");
    table.addColumn("FullName");
    table.addColumn("EmailAddress");
    table.addColumn("Password");
    table.addColumn("EnrolledCourse");
   
     
     
     
    
    conn = OracleDatabase.ConnectDb();
    try
    {
        //conn = OracleDatabase.ConnectDb();
        String sql = "SELECT * FROM Student";
        
        pst = (OraclePreparedStatement) conn.prepareStatement(sql);
        
        
        rs =(OracleResultSet) pst.executeQuery();
        
        //ResultSet R = S.executeQuery(sql);
        
        while(rs.next()){
            table.addRow(new Object[] // this is a object of our manual table which has function like addRow/addColumn DefaultTableModel table = new DefaultTableModel();
            
            {
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                
               
            });
        }
        StudentInformation.setModel(table);
        StudentInformation.setShowHorizontalLines(true); 
        StudentInformation.setGridColor(Color.white);  //This will give us manual sequence color
        
        
        
        
        
        
    }catch(Exception e){
        
    }
   
}
    
    
     public void StudentDelete(){
        
         String StudentID=SID.getText();
        conn = OracleDatabase.ConnectDb();

     
        try{
            String deleteOracle = "DELETE FROM Student WHERE UniversityID=?";
                    
          //UPDATE Student SET Password=? WHERE UniversityID=?"
            
            pst = (OraclePreparedStatement) conn.prepareStatement(deleteOracle);
            
             pst.setString(1, StudentID);

            rs =(OracleResultSet) pst.executeQuery();

            if (rs.next())
            {
                JOptionPane.showMessageDialog(null,"Delete of selected User Successful.Note that you will loss the Student Information also.");

                
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Delete of User Unsuccessful");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
     
     
     
     
      public void SessionDelete(){
        
         String StudentID=SID.getText();
        conn = OracleDatabase.ConnectDb();

     
        try{
            String deleteOracle = "DELETE FROM SessionManagement WHERE UniversityID=?";
                    
          //UPDATE Student SET Password=? WHERE UniversityID=?"
            
            pst = (OraclePreparedStatement) conn.prepareStatement(deleteOracle);
            
             pst.setString(1, StudentID);

            rs =(OracleResultSet) pst.executeQuery();

           

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
     
     
     
     
     public void DeleteSElectedUserBooking(){
      String StudentID=SID.getText();
        conn = OracleDatabase.ConnectDb();

     
        try{
            String deleteOracle = "DELETE FROM Booking WHERE UniversityID=?";
                    
          //UPDATE Student SET Password=? WHERE UniversityID=?"
            
            pst = (OraclePreparedStatement) conn.prepareStatement(deleteOracle);
            
             pst.setString(1, StudentID);

            rs =(OracleResultSet) pst.executeQuery();
      
           

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
     
     
     }
     
     public void DeleteSElectedUserEnrollCourse(){
      String StudentID=SID.getText();
        conn = OracleDatabase.ConnectDb();

     
        try{
            String deleteOracle = "DELETE FROM EnrolledCourse WHERE UniversityID=?";
                    
          //UPDATE Student SET Password=? WHERE UniversityID=?"
            
            pst = (OraclePreparedStatement) conn.prepareStatement(deleteOracle);
            
             pst.setString(1, StudentID);

            rs =(OracleResultSet) pst.executeQuery();
      
           

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
     
     
     }
     
     
     
     
     
     
     
     
     
     public void UpdateStudent(){
        String StudentID=SID.getText();
        conn = OracleDatabase.ConnectDb();

     
        try{
            String sql2 = "UPDATE Student SET StdName=?,StdEmail=?,Password=? WHERE UniversityID=?";
                    
          //UPDATE Student SET Password=? WHERE UniversityID=?"
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql2);
            
            
           
            pst.setString(1,FullName.getText());
            
            
            
            pst.setString(2,Email.getText());
            
            pst.setString(3,Password.getText());
           
            //pst.setString(4,EnrollCourse.getText());
            
            
       
             pst.setString(4, StudentID);

            rs =(OracleResultSet) pst.executeQuery();

            if (rs.next())
            {
                JOptionPane.showMessageDialog(null,"Update of selected UserInformation Successful.");

                
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Adding selected UserInfo Unsuccessful.Please fill the  form carefully!!");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentInfo = new javax.swing.JPanel();
        lblUserInformation = new javax.swing.JLabel();
        BackPanel2 = new javax.swing.JPanel();
        minimize2 = new javax.swing.JLabel();
        lbl_FullName = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        btn_DeleteUser = new javax.swing.JButton();
        Email = new javax.swing.JTextField();
        Separator2 = new javax.swing.JSeparator();
        lbl_Password = new javax.swing.JLabel();
        btn_upadteStudents = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentInformation = new javax.swing.JTable();
        FullName = new javax.swing.JTextField();
        Separator4 = new javax.swing.JSeparator();
        lbl_UniversityID1 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();
        lbl_enrolledCourse2 = new javax.swing.JLabel();
        Separator5 = new javax.swing.JSeparator();
        EnrollCourse = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Separator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        StudentInfo.setBackground(new java.awt.Color(255, 255, 255));
        StudentInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));
        StudentInfo.setMaximumSize(new java.awt.Dimension(1211, 626));
        StudentInfo.setMinimumSize(new java.awt.Dimension(1211, 626));
        StudentInfo.setPreferredSize(new java.awt.Dimension(1078, 559));

        lblUserInformation.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblUserInformation.setForeground(new java.awt.Color(214, 48, 49));
        lblUserInformation.setText("User Information");

        BackPanel2.setBackground(new java.awt.Color(214, 48, 49));

        minimize2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        minimize2.setForeground(new java.awt.Color(255, 255, 255));
        minimize2.setText("X");
        minimize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackPanel2Layout = new javax.swing.GroupLayout(BackPanel2);
        BackPanel2.setLayout(BackPanel2Layout);
        BackPanel2Layout.setHorizontalGroup(
            BackPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minimize2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackPanel2Layout.setVerticalGroup(
            BackPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize2)
                .addContainerGap())
        );

        lbl_FullName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_FullName.setForeground(new java.awt.Color(214, 48, 49));
        lbl_FullName.setText("FullName");

        lbl_Email.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(214, 48, 49));
        lbl_Email.setText("Email Address");

        btn_DeleteUser.setBackground(new java.awt.Color(214, 48, 49));
        btn_DeleteUser.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_DeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_DeleteUser.setText("Delete");
        btn_DeleteUser.setBorder(null);
        btn_DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteUserActionPerformed(evt);
            }
        });

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Email.setForeground(new java.awt.Color(102, 102, 102));
        Email.setBorder(null);
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailKeyPressed(evt);
            }
        });

        Separator2.setBackground(new java.awt.Color(153, 153, 153));
        Separator2.setForeground(new java.awt.Color(51, 51, 51));
        Separator2.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator2.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator2.setPreferredSize(new java.awt.Dimension(261, 24));

        lbl_Password.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_Password.setForeground(new java.awt.Color(214, 48, 49));
        lbl_Password.setText("Password");

        btn_upadteStudents.setBackground(new java.awt.Color(214, 48, 49));
        btn_upadteStudents.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_upadteStudents.setForeground(new java.awt.Color(255, 255, 255));
        btn_upadteStudents.setText("Update");
        btn_upadteStudents.setBorder(null);
        btn_upadteStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upadteStudentsActionPerformed(evt);
            }
        });

        StudentInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "UniversityID", "FullName", "Email", "Password", "EnrolledCourse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentInformation.setRowHeight(60);
        StudentInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentInformationMouseClicked(evt);
            }
        });
        StudentInformation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentInformationKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(StudentInformation);

        FullName.setBackground(new java.awt.Color(255, 255, 255));
        FullName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        FullName.setForeground(new java.awt.Color(102, 102, 102));
        FullName.setBorder(null);
        FullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FullNameKeyPressed(evt);
            }
        });

        Separator4.setBackground(new java.awt.Color(153, 153, 153));
        Separator4.setForeground(new java.awt.Color(51, 51, 51));
        Separator4.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator4.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator4.setPreferredSize(new java.awt.Dimension(261, 24));

        lbl_UniversityID1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_UniversityID1.setForeground(new java.awt.Color(214, 48, 49));
        lbl_UniversityID1.setText("UniversityID");

        SID.setEditable(false);
        SID.setBackground(new java.awt.Color(255, 255, 255));
        SID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        SID.setForeground(new java.awt.Color(102, 102, 102));
        SID.setBorder(null);
        SID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SIDKeyPressed(evt);
            }
        });

        lbl_enrolledCourse2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_enrolledCourse2.setForeground(new java.awt.Color(214, 48, 49));
        lbl_enrolledCourse2.setText("EnrolledCourse");

        Separator5.setBackground(new java.awt.Color(153, 153, 153));
        Separator5.setForeground(new java.awt.Color(51, 51, 51));
        Separator5.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator5.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator5.setPreferredSize(new java.awt.Dimension(261, 24));

        EnrollCourse.setEditable(false);
        EnrollCourse.setBackground(new java.awt.Color(255, 255, 255));
        EnrollCourse.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EnrollCourse.setForeground(new java.awt.Color(102, 102, 102));
        EnrollCourse.setBorder(null);
        EnrollCourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnrollCourseKeyPressed(evt);
            }
        });

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.setBorder(null);
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
        });

        Separator7.setBackground(new java.awt.Color(153, 153, 153));
        Separator7.setForeground(new java.awt.Color(51, 51, 51));
        Separator7.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator7.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator7.setPreferredSize(new java.awt.Dimension(261, 24));

        javax.swing.GroupLayout StudentInfoLayout = new javax.swing.GroupLayout(StudentInfo);
        StudentInfo.setLayout(StudentInfoLayout);
        StudentInfoLayout.setHorizontalGroup(
            StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentInfoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(StudentInfoLayout.createSequentialGroup()
                        .addComponent(lblUserInformation)
                        .addGap(323, 323, 323)
                        .addComponent(BackPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StudentInfoLayout.createSequentialGroup()
                        .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(StudentInfoLayout.createSequentialGroup()
                                .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_enrolledCourse2)
                                    .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Separator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EnrollCourse)
                                        .addComponent(Separator7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StudentInfoLayout.createSequentialGroup()
                                .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_FullName)
                                    .addComponent(lbl_UniversityID1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StudentInfoLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btn_upadteStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(btn_DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StudentInfoLayout.setVerticalGroup(
            StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentInfoLayout.createSequentialGroup()
                .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(StudentInfoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblUserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_UniversityID1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(Separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(Separator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_enrolledCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnrollCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(StudentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_upadteStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(StudentInfoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDKeyPressed

    private void FullNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FullNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameKeyPressed

    private void StudentInformationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentInformationKeyPressed

        // get the model from the jtable
        
    }//GEN-LAST:event_StudentInformationKeyPressed

    private void StudentInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentInformationMouseClicked
        // TODO add your handling code here:
        
         // get the model from the jtable
        DefaultTableModel model = (DefaultTableModel)StudentInformation.getModel();

        // get the selected row index
        int selectedRowIndex = StudentInformation.getSelectedRow();

        // set the selected row data into jtextfields
        SID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        FullName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        //Category.setText(model.getValueAt(selectedRowIndex, 1).toString());
        Email.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Password.setText(model.getValueAt(selectedRowIndex, 3).toString());
        EnrollCourse.setText(model.getValueAt(selectedRowIndex, 4).toString());
        

     
    }//GEN-LAST:event_StudentInformationMouseClicked

    private void btn_upadteStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upadteStudentsActionPerformed
      
        
        UpdateStudent();
        StudentInformation();
    }//GEN-LAST:event_btn_upadteStudentsActionPerformed

    private void EmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailKeyPressed

    private void btn_DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteUserActionPerformed

           String StudentID=SID.getText();
        conn = OracleDatabase.ConnectDb();

     
        try{
            String deleteOracle = "DELETE FROM SessionManagement WHERE UniversityID=?";
                    
          //UPDATE Student SET Password=? WHERE UniversityID=?"
            
            pst = (OraclePreparedStatement) conn.prepareStatement(deleteOracle);
            
             pst.setString(1, StudentID);

            rs =(OracleResultSet) pst.executeQuery();
      
           

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        DeleteSElectedUserEnrollCourse();
    DeleteSElectedUserBooking();
        StudentDelete();
       
        StudentInformation();
        
        
        
        
        
        
       
    }//GEN-LAST:event_btn_DeleteUserActionPerformed

    private void minimize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize2MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_minimize2MouseClicked

    private void EnrollCourseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnrollCourseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnrollCourseKeyPressed

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordKeyPressed

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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel2;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField EnrollCourse;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField SID;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator7;
    private javax.swing.JPanel StudentInfo;
    private javax.swing.JTable StudentInformation;
    private javax.swing.JButton btn_DeleteUser;
    private javax.swing.JButton btn_upadteStudents;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUserInformation;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_FullName;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_UniversityID1;
    private javax.swing.JLabel lbl_enrolledCourse2;
    private javax.swing.JLabel minimize2;
    // End of variables declaration//GEN-END:variables
}
