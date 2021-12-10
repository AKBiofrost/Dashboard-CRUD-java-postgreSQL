/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.PuertoData.Materiales;

/**
 *
 * @author Administrador
 */
public class Material {
    
        //-------- campos de tabla materiles------
    //private int ID_Material; 
    private String Nombre_mtrl;
    private String Description_mtrl; 
    private String Presentacion_mtrl; 
    private int ID_prov;
    private int Stock_min; 
    private int Stock_existente; 
    
   //----------------------------------------
    //--------------getter
    
    
    public String getNombre_mtrl() {
        return Nombre_mtrl;
    }

    public String getDescription_mtrl() {
        return Description_mtrl;
    }

    public String getPresentacion_mtrl() {
        return Presentacion_mtrl;
    }

    public int getID_prov() {
        return ID_prov;
    }

    public int getStock_min() {
        return Stock_min;
    }

    public int getStock_existente() {
        return Stock_existente;
    }
//--------------------------------setter---------------
    
    public void setNombre_mtrl(String Nombre_mtrl) {
        this.Nombre_mtrl = Nombre_mtrl;
    }

    public void setDescription_mtrl(String Description_mtrl) {
        this.Description_mtrl = Description_mtrl;
    }

    public void setPresentacion_mtrl(String Presentacion_mtrl) {
        this.Presentacion_mtrl = Presentacion_mtrl;
    }

    public void setID_prov(int ID_prov) {
        this.ID_prov = ID_prov;
    }

    public void setStock_min(int Stock_min) {
        this.Stock_min = Stock_min;
    }

    public void setStock_existente(int Stock_existente) {
        this.Stock_existente = Stock_existente;
    }

    
    
    
    
    
    
    
    
}
