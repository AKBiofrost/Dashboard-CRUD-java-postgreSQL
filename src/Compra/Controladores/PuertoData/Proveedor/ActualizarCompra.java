/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.PuertoData.Proveedor;

import Conection.ConexionBBDD;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ActualizarCompra {
    
        String codigo; 
    
    
   //-------- campos de tabla proveedores------
    
   //private int ID_proveedor;  
    private String RIF_prov;
    private String Nombre_prov; 
    private String Direccion_prov; 
    private String Email_prov;
    private String Telefono_prov; 
    private String website_prov; 
        //--------------GETTER-------------------

     ConexionBBDD conexion = new  ConexionBBDD(); 


    public String getRIF_prov() {
        return RIF_prov;
    }

    public String getNombre_prov() {
        return Nombre_prov;
    }

    public String getDireccion_prov() {
        return Direccion_prov;
    }

    public String getEmail_prov() {
        return Email_prov;
    }

    public String getTelefono_prov() {
        return Telefono_prov;
    }

    public String getWebsite_prov() {
        return website_prov;
    }

  //--------------------------------------
    
  //--------------SETTER-------------------  



    public void setRIF_prov(String RIF_prov) {
        this.RIF_prov = RIF_prov;
    }

    public void setNombre_prov(String Nombre_prov) {
        this.Nombre_prov = Nombre_prov;
    }

    public void setDireccion_prov(String Direccion_prov) {
        this.Direccion_prov = Direccion_prov;
    }

    public void setEmail_prov(String Email_prov) {
        this.Email_prov = Email_prov;
    }

    public void setTelefono_prov(String Telefono_prov) {
        this.Telefono_prov = Telefono_prov;
    }

    public void setWebsite_prov(String website_prov) {
        this.website_prov = website_prov;
    }
    
    
    //--------------------------------------

   

    
    public void Updateproveedor(int idproveedor, String rif_prov, String nombre_prov, 
            String direccion_prov,  String email_prov, String telefono_prov, String website_prov) throws ClassNotFoundException{
       
        String SQL_UPDATE="  "; 
        
        
        
        try {            
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement("update bddkmall.\"proveedor\" " +         
            "set rif_prov = ? ," +
            "nombre_prov = ? ," +
            "direccion_prov = ? ," +       
            "email_prov = ? , " + 
            "telefono_prov = ?,  " + 
            "website_prov=? "     +
            "where idproveedor = ? "); 
            
            pstm.setString(1, rif_prov);
            pstm.setString(2, nombre_prov);
            pstm.setString(3, direccion_prov); 
            pstm.setString(4, email_prov);     
            pstm.setString(5, telefono_prov);
            pstm.setString(6, website_prov);
            pstm.setInt(7, idproveedor);
            
            
            pstm.execute();
            pstm.close();  
             System.out.println(pstm);
         }catch(SQLException e){
             System.out.println("update proveedor");
         System.out.println(e);
      }
       
   }   
   
    
}
