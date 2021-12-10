/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.PuertoData.Proveedor;

import Conection.ConexionBBDD;
import Conection.TESTCONN;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Administrador
 */




public class CrearCompra {
    //metodo principal donde se registran todos los datos de las tablas compras
    

    public ConexionBBDD con;
    
    Proveedor prov= new Proveedor(); 
  
        String codigo; 
    
    
   /*Añade un nuevo registro*/
   public void NuevoProveedor( String RIF_prov, String Nombre_prov, 
           String Direccion_prov, String Email_prov, String Telefono_prov,  
           String website_prov) throws ClassNotFoundException, SQLException {
       
            ConexionBBDD conexion = new  ConexionBBDD(); 
        
            ResultSet resultSet = null;
            Statement statement = null;
            java.sql.Connection conn = null;
            
           String SQL_INSERT="INSERT INTO bddkmall.\"proveedor\" "
                   + "(rif_prov, nombre_prov, direccion_prov ,email_prov,telefono_prov, website_prov)"
                   + " values(?,?,?,?,?,?) "; 
           
       try {
            
          
           PreparedStatement pstm;  
           conn=conexion.CrearConexion(); 
           pstm = conn.prepareStatement(SQL_INSERT);   
          
               pstm.setString(1, RIF_prov);
               pstm.setString(2, Nombre_prov);
               pstm.setString(3, Direccion_prov);
               pstm.setString(4, Email_prov);
               pstm.setString(5, Telefono_prov);
               pstm.setString(6, website_prov);  
               
               pstm.execute();
               pstm.close();  
            
     }catch (SQLException e) {
         System.err.println( e.getClass().getName()+":  "+ e.getMessage() );
         System.exit(0);
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println("TODO BIEN");
   
   }





}
    
   
   
    

