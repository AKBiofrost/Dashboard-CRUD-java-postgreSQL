/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.PuertoData.Materiales;

import Compra.Controladores.PuertoData.Proveedor.CrearCompra;
import Conection.ConexionBBDD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CrearMaterial {
    
    
    Material mtrl = new  Material(); 
   
   
 
    public void CrearMaterial( String nombre_mtrl, String descripcion_mtrl,
            String presentacion_mtrl, int id_proveedor, int stock_min, 
            int stock_existente, String categoria_mtrl, String codigo_mtrl  ) throws ClassNotFoundException, SQLException{
        
        
        ConexionBBDD conexion = new  ConexionBBDD();
        ResultSet resultSet = null;
        Statement statement = null;
        java.sql.Connection conn = null;
        
        
        String SQL_INSERT="INSERT INTO bddkmall.\"material\" "
                   + "(nombre_mtrl, descripcion_mtrl,presentacion_mtrl ,id_proveedor,stock_min,stock_existente,categoria_mtrl,codigo_mtrl)"
                   + " values(?,?,?,?,?,?,?,?) ";  
   
        try {
           PreparedStatement pstm;  
           conn=conexion.CrearConexion(); 
           pstm = conn.prepareStatement(SQL_INSERT);  
           
           
           pstm.setString(1, nombre_mtrl);
           pstm.setString(2, descripcion_mtrl);
           pstm.setString(3, presentacion_mtrl);
           pstm.setInt(4, id_proveedor);
           pstm.setInt(5, stock_min);
           pstm.setInt(6, stock_existente);
           pstm.setString(7, categoria_mtrl);             
           pstm.setString(8, codigo_mtrl);  
           
           pstm.execute();
           
            pstm.close();
            
           
        }catch (SQLException e) {
         System.err.println( e.getClass().getName()+":  "+ e.getMessage() );
          //JOptionPane.showMessageDialog(this,e.getMessage() );
         System.exit(0);
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println("TODO BIEN");
       
        
 
}

    
    
    
    
    
}
       
    
    


