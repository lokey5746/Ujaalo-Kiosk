/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujaalo;

import static Ujaalo.Login.txt_email;
import static Ujaalo.Login.txt_pass;
import static Ujaalo.Login.txt_unID;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author User
 */
public class Student {
    
        
    
    
    public static void login(){
    
//        Connection conn=null;
//        OraclePreparedStatement pst=null;
//        OracleResultSet rs = null;
//        conn = OracleDatabase.ConnectDb();
//        String userID = txt_unID.getText();
//        String email = txt_email.getText();
//        String pass = txt_pass.getText();
       
        
     
Connection conn=null;
        OraclePreparedStatement pst=null;
        OracleResultSet rs = null;
        //conn = OracleDatabase.ConnectDb();
        String userID = txt_unID.getText();
        String email = txt_email.getText();
        String pass = txt_pass.getText();

  

       
       try{
           
           String sql = "SELECT * FROM Student WHERE UniversityID=? AND StdEmail=? AND Password=?";
           pst = (OraclePreparedStatement) conn.prepareStatement(sql);
           pst.setString(1,userID);
           pst.setString(2,email);
           pst.setString(3,pass);
           
           
           rs =(OracleResultSet) pst.executeQuery();
           
           if (rs.next())
           {
               JOptionPane.showMessageDialog(null,"Login Successful.Now you will be redirected to your Home Page");
               
                
               StudentDashboard sgf= new StudentDashboard();
                sgf.setVisible(true);
              
                
                
                
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Login Unsuccessful.Try again with correct credentials.");
           }
           
       }
       catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
       
       
    }
    
}
