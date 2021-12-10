/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.PuertoData.Proveedor;

import Conection.ConexionBBDD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class LeerCompra {
    
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

    
  // METODOS BUSCAR PARA TABLA PROVEEDOR
    
    
    public String BuscarRifProveedor(String nombre) throws ClassNotFoundException{
         
          String rif = "";
          String SQL_SELECT= "SELECT rif_prov FROM bddkmall.\"proveedor\" WHERE nombre_prov = '"+ nombre +"'"; 
          try{  
              
            System.out.println(nombre);
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT); 
                    
                    
            ResultSet res = pstm.executeQuery();
            if (res.next()){
                rif=res.getString("rif_prov");
            res.close();  } 
            }catch(SQLException e){
            System.out.println(e);
            } System.out.println("TODO BIEN");
          return rif;
          
     }  
    /*-----------------------------------------------------------------------*/ 
    public int BuscarProveedor(String nombre) throws ClassNotFoundException{
         
          int cod = 0;
          String SQL_SELECT="SELECT idproveedor FROM bddkmall.\"proveedor\" WHERE nombre_prov= '"+ nombre +"'"; 
          try{        
              System.out.println(nombre);
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
            ResultSet res = pstm.executeQuery();
            if (res.next()){
                cod=res.getInt("idproveedor");
            res.close();  } 
            }catch(SQLException e){
            System.out.println(e);
            } 
          
          
          System.out.println(cod);
          return cod;
          
     }  
    /*-----------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------*/
    public String  BuscarNombreProveedor(int codprov) throws ClassNotFoundException{
         
          String nombre = "";
          String SQL_SELECT= "SELECT nombre_prov FROM bddkmall.\"proveedor\" WHERE idproveedor= '"+ codprov +"'"; 
          try{        
              System.out.println(codprov);
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
            ResultSet res = pstm.executeQuery();
            if (res.next()){
                nombre=res.getString("nombre_prov");
            res.close();  } 
            }catch(SQLException e){
            System.out.println(e);
            } 
          return nombre;
          
     }
    /*-----------------------------------------------------------------------*/
    public boolean ExisteProveedor(String nombre) throws ClassNotFoundException{
         
          boolean encontro;
          encontro=false;
          String SQL_SELECT="SELECT idproveedor FROM bddkmall.\"proveedor\" WHERE nombre_prov= '"+ nombre +"'"; 
          try{                
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
              try (ResultSet res = pstm.executeQuery()) {
                  encontro=res.next();
              }
                
            }catch(SQLException e){
            System.out.println(e);
            } 
        
          return encontro;
     }
    /*-----------------------------------------------------------------------*/
    public Object [][] getDatos() throws ClassNotFoundException{
      int registros = 0;
      String SQL_SELECT= "SELECT count(1) as total FROM bddkmall.\"proveedor\"";
      String SQL_SELECT2="SELECT " +
            " codigo, rif, nombre, telefono, email, direccion" +
            " FROM bddkmall.\"proveedor\"" +
            " ORDER BY codigo"; 
      //obtenemos la cantidad de registros existentes en la tabla
      try{         
         PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
          try (ResultSet res = pstm.executeQuery()) {
              res.next();
              registros = res.getInt("total");
          }
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][6];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
       
         PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT2);
          try (ResultSet res = pstm.executeQuery()) {
              int i = 0;
              while(res.next()){
                  String estcodigo = res.getString("codigo");
                  String estrif = res.getString("rif");
                  String estnombre = res.getString("nombre");
                  String esttelefono = res.getString("telefono");
                  String estemail = res.getString("email");
                  String estedirec = res.getString("direccion");
                  
                  data[i][0] = estcodigo;
                  data[i][1] = estrif;
                  data[i][2] = estnombre;
                  data[i][3] = esttelefono;
                  data[i][4] = estemail;
                  data[i][5] = estedirec;
                  
                  i++;
              }}
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
    /*-----------------------------------------------------------------------*/
     public Object[] getDatos1(int cod) throws ClassNotFoundException{
    Object data[] = null; 
    int i = 0;
    String SQL_SELECT= "SELECT *FROM bddkmall.\"proveedor\"" +
            " where idproveedor = '"+ cod+"'"; 
    //System.out.println("getdatos1");
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
            
        try (ResultSet res = pstm.executeQuery()) {
            data = new Object[7];
            while(res.next()){
                
                data[0] = res.getInt("idproveedor");
                data[1] = res.getString("rif_prov");
                data[2] = res.getString("nombre_prov");
                data[3] = res.getString("direccion_prov");
                data[4] = res.getString("email_prov");
                data[5] = res.getString("telefono_prov");
                data[6] = res.getString("website_prov");
                
                i++;
            }
        }
          }catch(SQLException e){
         System.out.println();
    }
    return data;
  }
    /*-----------------------------------------------------------------------*/
    
    
    
    
    
    
    
    
    
    
    
}
