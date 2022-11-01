/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGrafica;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dervi
 */
public class Conexion {
    Connection cn;  
    public Connection conexion(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
     cn= DriverManager.getConnection("jdbc:mysql://localhost/mydb?autoReconnect=true&useSSL=false","root", "holAmundO2001");
        System.out.println("Conexion Establecida");
    } catch(Exception e){
        System.out.println(e.getMessage());
    }
    return cn;
    }
            }
