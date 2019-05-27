/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujaalo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Kshitij
 */
public class OracleDatabase {
    
    public static Connection ConnectDb()
    {
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con1= DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","SYSTEM","Xitiz123456");
            
            // you can replace this with your Ip address where you have hosted online database and  database name and password.
            
            return con1;
        }
        catch(Exception e){
    
        JOptionPane.showMessageDialog(null,e);
    }
        return null;
        
    }
        
    }

