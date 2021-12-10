/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.PuertoData.Materiales;

import Conection.ConexionBBDD;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ActualizarMaterial {
    
    ConexionBBDD conexion = new  ConexionBBDD(); 

    
    
     public void UpdateMaterial(int id_material, String nombre_mtrl, String descripcion_mtrl, 
            String presentacion_mtrl,  int id_proveedor, int stock_min, int stock_existente, String categoria_mtrl,String codigo_mtrl) 
             
             throws ClassNotFoundException{
       
        String SQL_UPDATE="  "; 
        
        
        
        try {            
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement("update bddkmall.\"material\" " +         
            "set nombre_mtrl = ? ," +
            "descripcion_mtrl = ? ," +
            "presentacion_mtrl = ? ," +       
            "id_proveedor = ? , " + 
            "stock_min = ?,  " + 
            "stock_existente=? , "     +
            "categoria_mtrl=? , "     +
            "codigo_mtrl=?  "     +
            "where id_material = ? "); 
            
            pstm.setString(1, nombre_mtrl);
            pstm.setString(2, descripcion_mtrl); 
            pstm.setString(3, presentacion_mtrl);     
            pstm.setInt(4, id_proveedor);
            pstm.setInt(5, stock_min);
            pstm.setInt(6, stock_existente);
            pstm.setString(7, categoria_mtrl);
            pstm.setString(8, codigo_mtrl);
            pstm.setInt(9, id_material);
            
            pstm.execute();
            pstm.close();  
             System.out.println(pstm);
         }catch(SQLException e){
             System.out.println("update proveedor");
         System.out.println(e);
      }
       
   }   
   
   
    
    
    
    
}
