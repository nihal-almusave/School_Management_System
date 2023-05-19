
package GUI;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Connect {
    
    Connection con=null;
   
        public static Connection ConnectDB(){
            
          String dbURL = "jdbc:ucanaccess://E://Project//School Management System_86_87_89/Student.accdb";
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection(dbURL); 
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
    
        }
}