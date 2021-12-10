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
public class EliminarMaterial {
    
    ConexionBBDD conexion = new  ConexionBBDD(); 
 
    
    
    
    
      public void eliminar(int cod) throws ClassNotFoundException{  
          
          String SQL_DELETE="DELETE FROM bddkmall.\"material\" where id_material = ?"; 
          
            try {                
                PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_DELETE);            
                pstm.setInt(1, cod);                   
                pstm.execute();
                pstm.close();            
            }catch(SQLException e){
            System.out.println(e);
            }            



}
    
    
    
    
    
}
