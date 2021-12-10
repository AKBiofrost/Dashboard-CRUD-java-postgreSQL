/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Administrador
 */
public class testConexion {
    
        public ConexionBBDD con;
    
    //DATOS PARA LA CONEXION
   
   //Constructor de clase que se conecta a la base de datoS
    public testConexion()
    {
      
    }
    
    
    
   
    public static void main(String[] args){
  
        
            /*
            String bd = "BBDD_DkMall";
            String user = "postgres";
            String password = "abcd";
            String url = "jdbc:postgresql://localhost:5432/"+bd;
            java.sql.Connection connection = null;
            ResultSet resultSet = null;
            Statement statement = null;
            java.sql.Connection conn = null;
            try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a la base de datos [ " + bd + "]");
            }catch(ClassNotFoundException | SQLException e){
            System.err.println("Error: "+e.getMessage());
            }
             */
          
        
        
    }
    
}
