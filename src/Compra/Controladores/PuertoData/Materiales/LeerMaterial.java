/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.PuertoData.Materiales;

import Compra.Controladores.PuertoData.Proveedor.LeerCompra;
import Conection.ConexionBBDD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class LeerMaterial {
    
    ConexionBBDD conexion = new  ConexionBBDD(); 
    LeerCompra proveedor = new LeerCompra(); 
     
    
    
    
    // METODO PARA BUSCAR NOMBRE DE LOS PROVEEDORES
    public void ComboBoxProveedores(JComboBox ComboBoxProveedores) throws ClassNotFoundException{
// carga el nombre de los proveedores existente y devuelve su ID unico para usarse en otro metodos
        
        try {
            PreparedStatement pstm = conexion.getConnection().prepareStatement("SELECT * FROM bddkmall.proveedor");
            ResultSet result = pstm.executeQuery();
            
           //LLenamos nuestro ComboBox
           //ComboBoxProveedores.addItem("Seleccione una opción");

           while(result.next()){

               ComboBoxProveedores.addItem(result.getString("nombre_prov"));
           }
           result.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
 
    
    }
    
    
    public void ComboBoxMateriales(JComboBox ComboBoxProveedores) throws ClassNotFoundException{
// carga el nombre de los proveedores existente y devuelve su ID unico para usarse en otro metodos
        
        try {
            PreparedStatement pstm = conexion.getConnection().prepareStatement("SELECT * FROM bddkmall.material");
            ResultSet result = pstm.executeQuery();
            
           //LLenamos nuestro ComboBox
           ComboBoxProveedores.addItem("Seleccione una opción");

           while(result.next()){

               ComboBoxProveedores.addItem(result.getString("nombre_mtrl"));
           }
           result.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
 
    
    }
    
    
    
    
    
    
    
    // METODOS BUSCAR PARA TABLA MATERIALES
    
    
    public int Buscar_Stock_existente_Material(String nombre) throws ClassNotFoundException{ 

//BUSCA EL STOCK EXISTENTE DE UN MATERIAL POR SU NOMBRE
         
          int Stock = 0;
          String SQL_SELECT= "SELECT stock_existente FROM bddkmall.\"material\" WHERE nombre_mtrl = '"+ nombre +"'"; 
          try{  
              
            System.out.println(nombre);
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT); 
                    
                    
            ResultSet res = pstm.executeQuery();
            if (res.next()){
                Stock=res.getInt("stock_existente");
            res.close();  } 
            }catch(SQLException e){
            System.out.println(e);
            } System.out.println("TODO BIEN");
          
            
            return Stock;// RETORNA UN ENTERO "OJO"
          
     }  
    /*-----------------------------------------------------------------------*/ 
    public int BuscarIdMaterial(String nombre) throws ClassNotFoundException{

// BUSCA EL ID POR NOMBRE DEL MATERIAL
         
          int cod = 0;
          String SQL_SELECT="SELECT id_material FROM bddkmall.\"material\" WHERE nombre_mtrl= '"+ nombre +"'"; 
          try{        
              System.out.println(nombre);
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
            ResultSet res = pstm.executeQuery();
            if (res.next()){
                cod=res.getInt("id_material");
            res.close();  } 
            }catch(SQLException e){
            System.out.println(e);
            } 
          
          
          System.out.println(cod);
          return cod;   // RETORNA EL INT CON EL ID DEL MATERIAL
          
     }  
    /*-----------------------------------------------------------------------*/
    public String  BuscarNombreMaterial(int codprov) throws ClassNotFoundException{

// BUSCA EL NOMBRE DEL MATERIAL POR SU ID

          String nombre = "";
          String SQL_SELECT= "SELECT nombre_mtrl FROM bddkmall.\"material\" WHERE id_material= '"+ codprov +"'"; 
          try{        
              System.out.println(codprov);
            PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
            ResultSet res = pstm.executeQuery();
            if (res.next()){
                nombre=res.getString("nombre_mtrl");
            res.close();  } 
            }catch(SQLException e){
            System.out.println(e);
            } 
          return nombre; //RETORNA STRING
          
     }
    /*-----------------------------------------------------------------------*/
    public boolean ExisteMaterial(String nombre) throws ClassNotFoundException{// EDITAR CONSULTA Y NOMRE
         
          boolean encontro;
          encontro=false;
          String SQL_SELECT="SELECT id_material FROM bddkmall.\"material\" WHERE nombre_mtrl= '"+ nombre +"'"; 
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
    public Object [][] getDatos() throws ClassNotFoundException{// REVISAR A DETALLES
      int registros = 0;
      String SQL_SELECT= "SELECT count(1) as total FROM bddkmall.\"material\"";
      String SQL_SELECT2="SELECT " +
            " id_material,nombre_mtrl, descripcion_mtrl, presentacion_mtrl, id_proveedor, stock_min, stock_existente, categoria_mtrl,codigo_mtrl  " +
            " FROM bddkmall.\"materiales\"" +
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
      
    Object[][] data = new String[registros][9];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
       
         PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT2);
          try (ResultSet res = pstm.executeQuery()) {
              int i = 0;
              while(res.next()){
                  String esID = res.getString("id_material");
                  String esNombre = res.getString("nombre_mtrl");
                  String esDescripcion = res.getString("descripcion_mtrl");
                  String esPresentacion = res.getString("presentacion_mtrl");
                  int esIdProveedor = res.getInt("id_proveedor");
                  int esStockMin = res.getInt("stock_min");
                  int esStockExistente = res.getInt("stock_existente");
                  String esCategoria = res.getString("categoria_mtrl");
                  String esCodigo = res.getString("codigo_mtrl");
                  data[i][0] = esID;
                  data[i][1] = esNombre;
                  data[i][2] = esDescripcion;
                  data[i][3] = esPresentacion;
                  data[i][4] = esIdProveedor;
                  data[i][5] = esStockMin;
                  data[i][6] = esStockExistente;
                  data[i][7] = esCategoria;
                  data[i][8] = esCodigo;
                  i++;
              }}
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
    /*-----------------------------------------------------------------------*/
     public Object[] getDatos1(int cod) throws ClassNotFoundException{// REVISAR A DETALLE
    Object data[] = null; 
    int i = 0;
    String SQL_SELECT= "SELECT *FROM bddkmall.\"material\"" +
            " where id_material = '"+ cod+"'"; 
    //System.out.println("getdatos1");
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = conexion.CrearConexion().prepareStatement(SQL_SELECT);
            
        try (ResultSet res = pstm.executeQuery()) {
            data = new Object[9];
            while(res.next()){
                
                data[0] = res.getInt("id_material");
                data[1] = res.getString("nombre_mtrl");
                data[2] = res.getString("descripcion_mtrl");
                data[3] = res.getString("presentacion_mtrl");
                data[4] = res.getInt("id_proveedor");
                data[5] = res.getInt("stock_min");
                data[6] = res.getInt("stock_existente");
                data[7] = res.getString("categoria_mtrl");
                data[8] = res.getString("codigo_mtrl");
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
