/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrental;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kavishka
 */
public class DB {
    public static Connection mycon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/return","root","");
            return con;
        }catch(Exception e){
            return null;
        }
        
    }
    
}
