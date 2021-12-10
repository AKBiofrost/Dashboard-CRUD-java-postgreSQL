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
 * @author A.Biofrost
 */




public class ConexionBBDD {
    
    //DATOS PARA LA CONEXION
  private   String bd = "bddkmall";
  private   String user = "postgres";
  private   String password = "abcd";
  private   String url = "jdbc:postgresql://localhost:5432/"+bd;

   private Connection connection = null;
   private ResultSet resultSet = null;
   private Statement statement = null;
   
   Connection conn = null; 
   
   //Constructor de clase que se conecta a la base de datoS
    public ConexionBBDD()
    {
      try{
         Class.forName("org.postgresql.Driver");         
         conn = DriverManager.getConnection(url, user, password);
         System.out.println("Conectado a la base de datos [ " + this.bd + "]");
      }catch(ClassNotFoundException | SQLException e){
         System.err.println("Error: "+e.getMessage());
      }
    }
   
   
    
    public Connection CrearConexion() throws ClassNotFoundException, SQLException{
    
    
            java.sql.Connection connection = null;
            ResultSet resultSet = null;
            Statement statement = null;
            java.sql.Connection conexion = null;
            
            
            Class.forName("org.postgresql.Driver");
           conexion = DriverManager.getConnection(url, user, password);
    
    return(conexion); 
    }
    
    public Connection getConnection(){ 
      return conn; 
   } 
 
   public void desconectar(){ 
      conn = null; 
   }  
    


}
 
