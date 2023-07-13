/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.*;
/**
 *
 * @author shiba
 */
public class EstablecerConexionDB {
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/prueba","root","12345");
            return cn;
        }catch(SQLException e){
            System.err.println("Fallo al conectar: "+e);
        }
        return null;
    }
}
