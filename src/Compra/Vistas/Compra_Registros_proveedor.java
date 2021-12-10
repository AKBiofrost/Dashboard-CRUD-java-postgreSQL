/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Vistas;

import Compra.Controladores.PuertoData.Proveedor.ActualizarCompra;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
import Compra.Controladores.PuertoData.Proveedor.CrearCompra;
import Compra.Controladores.PuertoData.Proveedor.EliminarCompra;
import Compra.Controladores.PuertoData.Proveedor.LeerCompra;
import Compra.Controladores.UsesCases.HintTextField;
import Conection.ConexionBBDD;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author Administrador
 */
public class Compra_Registros_proveedor extends javax.swing.JFrame {
    
      //private final CrearCompra CrearCompra;
      
      private final CrearCompra proveedor= new CrearCompra(); 
      private final CrearCompra Combo = new CrearCompra(); 
      private final LeerCompra  provConsulta= new LeerCompra();
      private final EliminarCompra provEliminar= new EliminarCompra(); 
      private final ActualizarCompra provActualizar= new ActualizarCompra(); 
      public boolean SeModifico=false; 
      public boolean DarClick=false; 
      public boolean Eliminar= false; 
         
      
      public  String RIF; 
      public  String Nombre; 
      public  String Direccion; 
      public String Email; 
      public String tlfno; 
      public String web;
      public String codigo; 
      public ConexionBBDD con;
    

    /**
     * Creates new form Compra_proveedores
     */
    public Compra_Registros_proveedor() {
        
        initComponents();
         this.setTitle("Registrar Proveedores");
         

       // agregarCodigos(); //agrega codigos al combo numeros
         
         
       
   
    
    }
    
    private void agregarCodigosModificar(){
    
    //ComboCodigosNumeros.removeAllItems(); 
ComboCodigosNumeros.addItem("0212");
ComboCodigosNumeros.addItem("0416");
ComboCodigosNumeros.addItem("0426");
ComboCodigosNumeros.addItem("0414");
ComboCodigosNumeros.addItem("0424");
ComboCodigosNumeros.addItem("0412");
/*----------------------------------------------------------------------------*/
ComboCodigosNumeros.addItem("0248");
ComboCodigosNumeros.addItem("0281");
ComboCodigosNumeros.addItem("0282");
ComboCodigosNumeros.addItem("0283");
ComboCodigosNumeros.addItem("0285");
ComboCodigosNumeros.addItem("0292");
ComboCodigosNumeros.addItem("0240");
ComboCodigosNumeros.addItem("0247");
ComboCodigosNumeros.addItem("0278");
ComboCodigosNumeros.addItem("0243");
ComboCodigosNumeros.addItem("0244");
ComboCodigosNumeros.addItem("0246");
ComboCodigosNumeros.addItem("0273");
ComboCodigosNumeros.addItem("0278");
ComboCodigosNumeros.addItem("0284");
ComboCodigosNumeros.addItem("0285");
ComboCodigosNumeros.addItem("0286");
ComboCodigosNumeros.addItem("0288");
ComboCodigosNumeros.addItem("0289");
ComboCodigosNumeros.addItem("0241");
ComboCodigosNumeros.addItem("0242");
ComboCodigosNumeros.addItem("0243");
ComboCodigosNumeros.addItem("0245");
ComboCodigosNumeros.addItem("0249");
ComboCodigosNumeros.addItem("0258");
ComboCodigosNumeros.addItem("0287");
ComboCodigosNumeros.addItem("0259");
ComboCodigosNumeros.addItem("0268");
ComboCodigosNumeros.addItem("0269");
ComboCodigosNumeros.addItem("0279");
ComboCodigosNumeros.addItem("0235");
ComboCodigosNumeros.addItem("0238");
ComboCodigosNumeros.addItem("0246");
ComboCodigosNumeros.addItem("0247");
ComboCodigosNumeros.addItem("0251");
ComboCodigosNumeros.addItem("0252");
ComboCodigosNumeros.addItem("0253");
ComboCodigosNumeros.addItem("0271");
ComboCodigosNumeros.addItem("0274");
ComboCodigosNumeros.addItem("0275");
ComboCodigosNumeros.addItem("0234");
ComboCodigosNumeros.addItem("0239");
ComboCodigosNumeros.addItem("0287");
ComboCodigosNumeros.addItem("0291");
ComboCodigosNumeros.addItem("0292");
ComboCodigosNumeros.addItem("0295");
ComboCodigosNumeros.addItem("0255");
ComboCodigosNumeros.addItem("0256");
ComboCodigosNumeros.addItem("0257");
ComboCodigosNumeros.addItem("0272");
ComboCodigosNumeros.addItem("0293");
ComboCodigosNumeros.addItem("0294");
ComboCodigosNumeros.addItem("0275");
ComboCodigosNumeros.addItem("0276");
ComboCodigosNumeros.addItem("0277");
ComboCodigosNumeros.addItem("0278");
ComboCodigosNumeros.addItem("0271");
ComboCodigosNumeros.addItem("0272");
ComboCodigosNumeros.addItem("0251");
ComboCodigosNumeros.addItem("0253");
ComboCodigosNumeros.addItem("0254");
ComboCodigosNumeros.addItem("0261");
ComboCodigosNumeros.addItem("0262");
ComboCodigosNumeros.addItem("0263");
ComboCodigosNumeros.addItem("0264");
ComboCodigosNumeros.addItem("0265");
ComboCodigosNumeros.addItem("0265");
ComboCodigosNumeros.addItem("0266");
ComboCodigosNumeros.addItem("0267");
ComboCodigosNumeros.addItem("0271");
ComboCodigosNumeros.addItem("0275");
       


    
    
    }
    /**************************************************************************/
   
    
    
    private void agregarCodigos(){
    
    ComboCodigosNumeros.removeAllItems(); 
ComboCodigosNumeros.addItem("0212");
ComboCodigosNumeros.addItem("0416");
ComboCodigosNumeros.addItem("0426");
ComboCodigosNumeros.addItem("0414");
ComboCodigosNumeros.addItem("0424");
ComboCodigosNumeros.addItem("0412");
/*----------------------------------------------------------------------------*/
ComboCodigosNumeros.addItem("0248");
ComboCodigosNumeros.addItem("0281");
ComboCodigosNumeros.addItem("0282");
ComboCodigosNumeros.addItem("0283");
ComboCodigosNumeros.addItem("0285");
ComboCodigosNumeros.addItem("0292");
ComboCodigosNumeros.addItem("0240");
ComboCodigosNumeros.addItem("0247");
ComboCodigosNumeros.addItem("0278");
ComboCodigosNumeros.addItem("0243");
ComboCodigosNumeros.addItem("0244");
ComboCodigosNumeros.addItem("0246");
ComboCodigosNumeros.addItem("0273");
ComboCodigosNumeros.addItem("0278");
ComboCodigosNumeros.addItem("0284");
ComboCodigosNumeros.addItem("0285");
ComboCodigosNumeros.addItem("0286");
ComboCodigosNumeros.addItem("0288");
ComboCodigosNumeros.addItem("0289");
ComboCodigosNumeros.addItem("0241");
ComboCodigosNumeros.addItem("0242");
ComboCodigosNumeros.addItem("0243");
ComboCodigosNumeros.addItem("0245");
ComboCodigosNumeros.addItem("0249");
ComboCodigosNumeros.addItem("0258");
ComboCodigosNumeros.addItem("0287");
ComboCodigosNumeros.addItem("0259");
ComboCodigosNumeros.addItem("0268");
ComboCodigosNumeros.addItem("0269");
ComboCodigosNumeros.addItem("0279");
ComboCodigosNumeros.addItem("0235");
ComboCodigosNumeros.addItem("0238");
ComboCodigosNumeros.addItem("0246");
ComboCodigosNumeros.addItem("0247");
ComboCodigosNumeros.addItem("0251");
ComboCodigosNumeros.addItem("0252");
ComboCodigosNumeros.addItem("0253");
ComboCodigosNumeros.addItem("0271");
ComboCodigosNumeros.addItem("0274");
ComboCodigosNumeros.addItem("0275");
ComboCodigosNumeros.addItem("0234");
ComboCodigosNumeros.addItem("0239");
ComboCodigosNumeros.addItem("0287");
ComboCodigosNumeros.addItem("0291");
ComboCodigosNumeros.addItem("0292");
ComboCodigosNumeros.addItem("0295");
ComboCodigosNumeros.addItem("0255");
ComboCodigosNumeros.addItem("0256");
ComboCodigosNumeros.addItem("0257");
ComboCodigosNumeros.addItem("0272");
ComboCodigosNumeros.addItem("0293");
ComboCodigosNumeros.addItem("0294");
ComboCodigosNumeros.addItem("0275");
ComboCodigosNumeros.addItem("0276");
ComboCodigosNumeros.addItem("0277");
ComboCodigosNumeros.addItem("0278");
ComboCodigosNumeros.addItem("0271");
ComboCodigosNumeros.addItem("0272");
ComboCodigosNumeros.addItem("0251");
ComboCodigosNumeros.addItem("0253");
ComboCodigosNumeros.addItem("0254");
ComboCodigosNumeros.addItem("0261");
ComboCodigosNumeros.addItem("0262");
ComboCodigosNumeros.addItem("0263");
ComboCodigosNumeros.addItem("0264");
ComboCodigosNumeros.addItem("0265");
ComboCodigosNumeros.addItem("0265");
ComboCodigosNumeros.addItem("0266");
ComboCodigosNumeros.addItem("0267");
ComboCodigosNumeros.addItem("0271");
ComboCodigosNumeros.addItem("0275");
       


    
    
    }
    /**************************************************************************/
    
    // validamos la estructura del Email por una expresion regular
    public Boolean ValidarEmail(String email){
    
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        
    // El email a validar
        Matcher mather = pattern.matcher(email);
        boolean validado=false; 
 
        if (mather.find() == true) {
           
            validado=true; 
            //System.out.println("El email ingresado es válido.");
            
        } else {
           
           validado=false;  
           // System.out.println("El email ingresado es inválido.");
        }
        
   
    return(validado); 
    
    }
    //registramos los datos ingresados al proveedor
      @SuppressWarnings("empty-statement")
    public void RegistrarProveedor( ) throws ClassNotFoundException, SQLException, ParseException{
        
        
        boolean existe =false; 
         System.out.println("el valor de SeModifico al entrar en registrarProveedor es:");
         System.out.println(SeModifico);
      
    Nombre=(EntradaNombreProveedor.getText().trim());
    RIF=(EntradaRifProveedor.getText().trim()); 
    Direccion=(EntradaDireccionProveedor.getText().trim()); 
    Email=(EntradaEmailProveedor.getText().trim()); 
    codigo= ComboCodigosNumeros.getSelectedItem().toString(); 
    tlfno= codigo + (EntradaTlfnoProveedor.getText().trim());
    web=(EntradaWebProveedor.getText().trim()); 

    existe= provConsulta.ExisteProveedor(Nombre); 

    if ((existe==true) && (SeModifico==false)){
    
        JOptionPane.showMessageDialog(this, "El Proveedor ya esta registrado");
    } 

    else{
     if ((existe == true) && (SeModifico == true)) {
        
                    
                        int IdProveedor= provConsulta.BuscarProveedor(Nombre); 
                        
                        provActualizar.Updateproveedor(IdProveedor, RIF, Nombre, Direccion, Email, tlfno, web);
                         JOptionPane.showMessageDialog(this, "El Registro ha sido actualizado");
                         btn_ConsultarProveedor.setEnabled(false);
                   }
                    
                    else {
                    
                    proveedor.NuevoProveedor(RIF,Nombre, Direccion, Email, tlfno,web);
                    JOptionPane.showMessageDialog(this, "El Registro ha sido guardado");
                        btn_ConsultarProveedor.setEnabled(false);
                        

                    
                    
                   }
}
               
    
    }
    
    /*------------------------------------------------------------------------*/  
    
    // guardamos los datos a agregar del proveedor
    public void GuardarProveedor() throws ClassNotFoundException, SQLException, ParseException{
    
      boolean email=ValidarEmail(EntradaEmailProveedor.getText().trim()); 
        
      if(email){
        RegistrarProveedor( ); 
        //JOptionPane.showMessageDialog(this, "Datos Guardados exitosamente");
    }
        else{
        JOptionPane.showMessageDialog(this, "email debe tener el formato: departamento@empresa.com");
        
        }
    
    
    
    
    }
    /*------------------------------------------------------------------------*/  
    private void Menu_Registrar_proveedor(){
    
         
          
        
    
    }
    /*------------------------------------------------------------------------*/  
    private void NuevaEntrada() {
        EntradaRifProveedor.setText("");
        EntradaNombreProveedor.setText("");
        EntradaTlfnoProveedor.setText("");
        EntradaEmailProveedor.setText("");
        EntradaWebProveedor.setText("");
        EntradaDireccionProveedor.setText("");
             
    }
    /*------------------------------------------------------------------------*/  
    private void habilitar_btnAgregar(){
          
          btn_AgregarProveedor.setEnabled(false);
          btn_ModificarProveedor.setEnabled(true);
          btn_ConsultarProveedor.setEnabled(true);
          btn_EliminarProveedor.setEnabled(true);
          btn_Guardar.setEnabled(true);
 
          EntradaRifProveedor.setText("J");
          EntradaNombreProveedor.setEnabled(true);
          EntradaRifProveedor.setEnabled(true);
          EntradaDireccionProveedor.setEnabled(true);
          EntradaTlfnoProveedor.setEnabled(true);
          ComboCodigosNumeros.setEnabled(true); 
          EntradaEmailProveedor.setEnabled(true); 
          EntradaWebProveedor.setEnabled(true); 
          
                }
    /*-------------------------------------------------------------------------*/  
    private void habilitar_btnConsulta(){
          
          btn_AgregarProveedor.setEnabled(false);
          btn_ModificarProveedor.setEnabled(true);
          btn_ConsultarProveedor.setEnabled(true);
          btn_EliminarProveedor.setEnabled(true);
          
          
          EntradaNombreProveedor.setEnabled(true);
          EntradaRifProveedor.setEnabled(true);
          EntradaDireccionProveedor.setEnabled(true);
          EntradaTlfnoProveedor.setEnabled(true);
          ComboCodigosNumeros.setEnabled(true); 
          EntradaEmailProveedor.setEnabled(true); 
          EntradaWebProveedor.setEnabled(true);
//          btn_Buscar.setEnabled(true);
          
          btn_Guardar.setEnabled(false);
      }
    /*------------------------------------------------------------------------*/  
    private void habilitar_btnGuardar(){
    
    
            EntradaNombreProveedor.setEnabled(false);
            EntradaRifProveedor.setEnabled(false);
            EntradaDireccionProveedor.setEnabled(false);
            EntradaTlfnoProveedor.setEnabled(false);
            EntradaEmailProveedor.setEnabled(false);
            EntradaWebProveedor.setEnabled(false);
            ComboCodigosNumeros.setEnabled(false); 
            btn_AgregarProveedor.setEnabled(true);
            btn_ModificarProveedor.setEnabled(true);
            btn_EliminarProveedor.setEnabled(true);
            btn_ConsultarProveedor.setEnabled(true);
        
    
    
    }
    /*------------------------------------------------------------------------*/  
    private void habilitar_btnModificar(){
    
            EntradaNombreProveedor.setEnabled(true);
            EntradaRifProveedor.setEnabled(true);
            EntradaDireccionProveedor.setEnabled(true);
            EntradaTlfnoProveedor.setEnabled(true);
            EntradaEmailProveedor.setEnabled(true);
            EntradaWebProveedor.setEnabled(true);
            ComboCodigosNumeros.setEnabled(true);
            btn_Guardar.setEnabled(true); 
        
    
    
    }
    /*------------------------------------------------------------------------*/  
    private void habilitar_btnCancelar(){
    
          EntradaNombreProveedor.setEnabled(false);
          btn_ModificarProveedor.setEnabled(true);
          btn_EliminarProveedor.setEnabled(true);
          btn_Guardar.setEnabled(false);
          //btn_Buscar.setEnabled(false);
          btn_AgregarProveedor.setEnabled(true);
    
    
    }
    /*------------------------------------------------------------------------*/  
    private void  habilitar_btnBuscar(){
    
    
            btn_ModificarProveedor.setEnabled(true);
            btn_EliminarProveedor.setEnabled(true);
            EntradaNombreProveedor.setEnabled(false);
        
    } //BuscarNombreProveedor
    /*------------------------------------------------------------------------*/  
    private void btn_consultar(){
    
    if (EntradaNombreProveedor.getText().trim().equals(""))
                        JOptionPane.showMessageDialog(this, "Debe introducir el nombre del Proveedor");
                else{
               /*************inicia condicion de proceso**********************/
               
               /**************************************************************/
            
                       
                        int ID_proveedor = 0;
                try {
                    ID_proveedor = provConsulta.BuscarProveedor(EntradaNombreProveedor.getText().trim());
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compra_Registros_proveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            if (ID_proveedor == 0){
                
                /**************************************************************/
               JOptionPane.showMessageDialog(this, "El Proveedor no existe"); 
                EntradaNombreProveedor.setText("");
                EntradaNombreProveedor.setEnabled(false);
               /**************************************************************/
                 
            }           
            else{
               /**************************************************************/
                 habilitar_btnConsulta();
               /**************************************************************/
               Object[] obj = null;
                
                try {
                    obj = provConsulta.getDatos1(ID_proveedor);
                    
                    if (obj == null)
                        JOptionPane.showMessageDialog(this, "El Proveedor no existe");
                    
                    else {
                        
                    EntradaRifProveedor.setText(obj[1].toString());
                    EntradaNombreProveedor.setText(obj[2].toString());
                    EntradaDireccionProveedor.setText(obj[3].toString());
                    EntradaEmailProveedor.setText(obj[4].toString());
                    
                    char Numero;
                    String NumeroSinCodigo=" ";
                    String Codigo=""; 
                    for (int x=0;x< obj[5].toString().length() ;x++) {
                         
                        Numero = obj[5].toString().charAt(x); 
                        if(x<4){
                        
                        Codigo=Codigo+Numero; 
                        
                        }
                        if(x>4){
                        
                        NumeroSinCodigo=(NumeroSinCodigo+Numero);
                        
                        }
                    
                    }
                    EntradaTlfnoProveedor.setText(NumeroSinCodigo);
                    ComboCodigosNumeros.removeAllItems();
                    ComboCodigosNumeros.addItem(Codigo);
                    
                    //EntradaTlfnoProveedor.setText(obj[5].toString());
                    EntradaWebProveedor.setText(obj[6].toString());
                    }
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compra_Registros_proveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            /******************************************************************/
    }
  
    
    }
    /*------------------------------------------------------------------------*/
    private void btn_guardar(){
    
           System.out.println("el valor de SeModifico al entrar en boton guardar es:");
           System.out.println(SeModifico);
        
        if(SeModifico==false){

                       System.out.println(" semodifico es false");

            
            
        if ( EntradaNombreProveedor.getText().trim().equals("") && DarClick){ // en caso de consultar
            JOptionPane.showMessageDialog(this, "Debe introducir el nombre del Proveedor");
            NuevaEntrada(); 
            habilitar_btnGuardar(); 
            

        } else{
          try {
              GuardarProveedor();
              NuevaEntrada();
              ComboCodigosNumeros.removeAllItems();
          } catch (ClassNotFoundException | SQLException | ParseException ex) {
              Logger.getLogger(Compra_Registros_proveedor.class.getName()).log(Level.SEVERE, null, ex);
          }
              
            habilitar_btnGuardar(); 
        
                }
        
        }     if(SeModifico==true){
        System.out.println(" semodifico es true");

            
            Nombre=(EntradaNombreProveedor.getText().trim());
            RIF=(EntradaRifProveedor.getText().trim()); 
            Direccion=(EntradaDireccionProveedor.getText().trim()); 
            Email=(EntradaEmailProveedor.getText().trim()); 
            codigo= ComboCodigosNumeros.getSelectedItem().toString(); 
            tlfno= codigo + (EntradaTlfnoProveedor.getText().trim());
            web=(EntradaWebProveedor.getText().trim()); 

            try {
              // guardamos los datos del formulario con un solo metodo
              
              int IdProveedor= provConsulta.BuscarProveedor(Nombre); 
                        
                        provActualizar.Updateproveedor(IdProveedor, RIF, Nombre, Direccion, Email, tlfno, web);
                         JOptionPane.showMessageDialog(this, "El Registro ha sido actualizado");
                         ComboCodigosNumeros.removeAllItems();
              
              
              NuevaEntrada();  
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Compra_Registros_proveedor.class.getName()).log(Level.SEVERE, null, ex);
          }
              
            habilitar_btnGuardar(); 
        
            
            
        
        }
    
        
        
        
    }
    /*------------------------------------------------------------------------*/ 
    private void btn_modificar(){
    
        
                if (EntradaNombreProveedor.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Debe introducir el nombre del Proveedor");
            btn_ModificarProveedor.setEnabled(true);}
                
        else {

            ///////////////////////
            int ID_proveedor = 0;
            try {
                ID_proveedor = provConsulta.BuscarProveedor(EntradaNombreProveedor.getText().trim());
            
                    System.out.println(ID_proveedor);
                    
            if (ID_proveedor != 0){
                
                Object[] obj = null;
                
                     obj = provConsulta.getDatos1(ID_proveedor);
                             
                 
                if (obj == null){
                    JOptionPane.showMessageDialog(this, "El Proveedor no existe");

                }
                else {
                    
                    habilitar_btnModificar();
                    
                    
                    EntradaRifProveedor.setText(obj[1].toString());
                    EntradaNombreProveedor.setText(obj[2].toString());
                    EntradaDireccionProveedor.setText(obj[3].toString());
                    EntradaEmailProveedor.setText(obj[4].toString());
                    
                          char Numero;
                    String NumeroSinCodigo=" ";
                    String Codigo=" "; 
                    for (int x=0;x< obj[5].toString().length() ;x++) {
                         
                        Numero = obj[5].toString().charAt(x); 
                        if(x<4){
                        
                        Codigo=Codigo+Numero; 
                        
                        }
                        if(x>4){
                        
                        NumeroSinCodigo=(NumeroSinCodigo+Numero);
                        
                        }
                    
                    }
                    EntradaTlfnoProveedor.setText(NumeroSinCodigo);
                    ComboCodigosNumeros.removeAllItems();
                    ComboCodigosNumeros.addItem(Codigo);
                    ComboCodigosNumeros.addItem(" ");
                    agregarCodigosModificar(); 
                    
                    
                    //EntradaTlfnoProveedor.setText(obj[5].toString());
                    EntradaWebProveedor.setText(obj[6].toString());
                    
         
            }
                }
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(Compra_Registros_proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
}
               
    }
    /*------------------------------------------------------------------------*/
    private void EliminarProveedor(){
    
     if (EntradaNombreProveedor.getText().trim().equals(""))
            JOptionPane.showMessageDialog(this, "Debe introducir el nombre del proveedor ");
        else{
        
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Está seguro de que quiere eliminar el proveedor?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
            }
            try { 
                int IdProveedor= provConsulta.BuscarProveedor(EntradaNombreProveedor.getText().trim());
                
                if (IdProveedor != 0){
                    
                    JOptionPane.showMessageDialog(this, "El proveedor fue eliminado con éxito");
                    provEliminar.eliminar(IdProveedor);
                   
                    NuevaEntrada();
                    
                    btn_ModificarProveedor.setEnabled(true);
                    btn_EliminarProveedor.setEnabled(true);
                    btn_Guardar.setEnabled(false);
                    btn_AgregarProveedor.setEnabled(true);
                    
                    EntradaNombreProveedor.setEnabled(false);
                    EntradaRifProveedor.setEnabled(false);
                    EntradaDireccionProveedor.setEnabled(false);
                    EntradaTlfnoProveedor.setEnabled(false);
                    EntradaEmailProveedor.setEnabled(false);
                    EntradaWebProveedor.setEnabled(false);
                    ComboCodigosNumeros.setEnabled(false);
            
            
                    
                    
                }
                else
                JOptionPane.showMessageDialog(this, "El proveedor no existe");
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Compra_Registros_proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
            
        
        }
            
        
        
        
       
    
    
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btn_AgregarProveedor = new javax.swing.JButton();
        btn_ModificarProveedor = new javax.swing.JButton();
        btn_ConsultarProveedor = new javax.swing.JButton();
        btn_EliminarProveedor = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        ContenedorFormulario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        EntradaRifProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EntradaTlfnoProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EntradaEmailProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EntradaNombreProveedor = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        EntradaWebProveedor = new javax.swing.JTextField();
        Direcion = new javax.swing.JLabel();
        EntradaDireccionProveedor = new javax.swing.JTextField();
        ComboCodigosNumeros = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton_salir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btn_AgregarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_AgregarProveedor.setForeground(new java.awt.Color(0, 43, 135));
        btn_AgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        btn_AgregarProveedor.setText("Agregar");
        btn_AgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarProveedorActionPerformed(evt);
            }
        });

        btn_ModificarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ModificarProveedor.setForeground(new java.awt.Color(0, 43, 135));
        btn_ModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave-con-sistema-de-ajuste-para-diferentes-tamanos-de-tuercas.png"))); // NOI18N
        btn_ModificarProveedor.setText("Modificar");
        btn_ModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarProveedorActionPerformed(evt);
            }
        });

        btn_ConsultarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ConsultarProveedor.setForeground(new java.awt.Color(0, 43, 135));
        btn_ConsultarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_ConsultarProveedor.setText("Consultar");
        btn_ConsultarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarProveedorActionPerformed(evt);
            }
        });

        btn_EliminarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_EliminarProveedor.setForeground(new java.awt.Color(0, 43, 135));
        btn_EliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_EliminarProveedor.setText("Eliminar");
        btn_EliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarProveedorActionPerformed(evt);
            }
        });

        btn_Cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(0, 43, 135));
        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btn_AgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ConsultarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EliminarProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_ModificarProveedor)
                .addComponent(btn_ConsultarProveedor)
                .addComponent(btn_EliminarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_AgregarProveedor))
        );

        ContenedorFormulario.setBackground(new java.awt.Color(204, 204, 255));
        ContenedorFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 43, 135))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 43, 135));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nombre");

        EntradaRifProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EntradaRifProveedor.setEnabled(false);
        EntradaRifProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaRifProveedorActionPerformed(evt);
            }
        });
        EntradaRifProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaRifProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaRifProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaRifProveedorKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 43, 135));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Teléfono");

        EntradaTlfnoProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EntradaTlfnoProveedor.setEnabled(false);
        EntradaTlfnoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaTlfnoProveedorActionPerformed(evt);
            }
        });
        EntradaTlfnoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaTlfnoProveedorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaTlfnoProveedorKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 43, 135));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Email");

        EntradaEmailProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EntradaEmailProveedor.setText("departamento@empresa.com");
        EntradaEmailProveedor.setEnabled(false);
        EntradaEmailProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EntradaEmailProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EntradaEmailProveedorFocusLost(evt);
            }
        });
        EntradaEmailProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaEmailProveedorActionPerformed(evt);
            }
        });
        EntradaEmailProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaEmailProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaEmailProveedorKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 43, 135));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Rif");

        EntradaNombreProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EntradaNombreProveedor.setEnabled(false);
        EntradaNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNombreProveedorActionPerformed(evt);
            }
        });
        EntradaNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaNombreProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaNombreProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaNombreProveedorKeyTyped(evt);
            }
        });

        btn_Guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Guardar.setForeground(new java.awt.Color(0, 43, 135));
        btn_Guardar.setText("Guardar");
        btn_Guardar.setEnabled(false);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        btn_Guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_GuardarKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 43, 135));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Web");

        EntradaWebProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EntradaWebProveedor.setEnabled(false);
        EntradaWebProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaWebProveedorActionPerformed(evt);
            }
        });
        EntradaWebProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaWebProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaWebProveedorKeyReleased(evt);
            }
        });

        Direcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Direcion.setForeground(new java.awt.Color(0, 43, 135));
        Direcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Direcion.setText("Direción");

        EntradaDireccionProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EntradaDireccionProveedor.setEnabled(false);
        EntradaDireccionProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaDireccionProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaDireccionProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaDireccionProveedorKeyTyped(evt);
            }
        });

        ComboCodigosNumeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboCodigosNumeros.setEnabled(false);
        ComboCodigosNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCodigosNumerosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor_1.png"))); // NOI18N

        javax.swing.GroupLayout ContenedorFormularioLayout = new javax.swing.GroupLayout(ContenedorFormulario);
        ContenedorFormulario.setLayout(ContenedorFormularioLayout);
        ContenedorFormularioLayout.setHorizontalGroup(
            ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorFormularioLayout.createSequentialGroup()
                .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                        .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Direcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                                .addComponent(ComboCodigosNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EntradaTlfnoProveedor))
                            .addComponent(EntradaNombreProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(EntradaRifProveedor)
                            .addComponent(EntradaDireccionProveedor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContenedorFormularioLayout.createSequentialGroup()
                        .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)
                        .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaEmailProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(EntradaWebProveedor))))
                .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        ContenedorFormularioLayout.setVerticalGroup(
            ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                        .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(EntradaRifProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Direcion)
                            .addComponent(EntradaDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboCodigosNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EntradaTlfnoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1))
                            .addGroup(ContenedorFormularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EntradaEmailProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(ContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(EntradaWebProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        boton_salir2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_salir2.setForeground(new java.awt.Color(0, 43, 135));
        boton_salir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        boton_salir2.setText("Salir");
        boton_salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ContenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_salir2)
                .addGap(21, 21, 21))
        );

        ContenedorFormulario.getAccessibleContext().setAccessibleName("Proveedores");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarProveedorActionPerformed
        // TODO add your handling code here:
        //es el primer boton disponible al entrar
        
        
        habilitar_btnAgregar(); 
        agregarCodigos(); 
        EntradaNombreProveedor.requestFocus();
        
       
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_AgregarProveedorActionPerformed

    private void btn_ModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarProveedorActionPerformed
        // TODO add your handling code here:
        
        EntradaNombreProveedor.setEnabled(true);
        EntradaNombreProveedor.requestFocus();
        
        SeModifico= true; 

    
        
// fin del boton
    }//GEN-LAST:event_btn_ModificarProveedorActionPerformed

    private void btn_ConsultarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarProveedorActionPerformed
        // TODO add your handling code here:
        
            EntradaNombreProveedor.requestFocus();
        
            DarClick= true; 
            SeModifico= false; 
            btn_ModificarProveedor.setEnabled(false);
            btn_EliminarProveedor.setEnabled(false);
            btn_Guardar.setEnabled(false);
           // btn_Guardar.setEnabled(false);
            
            habilitar_btnConsulta();
            
            EntradaRifProveedor.setEnabled(false);
            EntradaDireccionProveedor.setEnabled(false);
            EntradaTlfnoProveedor.setEnabled(false);
            EntradaEmailProveedor.setEnabled(false);
            EntradaWebProveedor.setEnabled(false);
            ComboCodigosNumeros.setEnabled(false);
            
            
            
    }//GEN-LAST:event_btn_ConsultarProveedorActionPerformed

    private void btn_EliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarProveedorActionPerformed
        // TODO add your handling code here:
        
        Eliminar= true; 
        EntradaNombreProveedor.setEnabled(true);
        EntradaNombreProveedor.requestFocus();
        
        
        
        
    }//GEN-LAST:event_btn_EliminarProveedorActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:
        
            habilitar_btnCancelar(); 
            Menu_Registrar_proveedor(); 
            NuevaEntrada(); 
            //EntradaNombreProveedor.setEnabled(false);
            EntradaRifProveedor.setEnabled(false);
            EntradaDireccionProveedor.setEnabled(false);
            EntradaTlfnoProveedor.setEnabled(false);
            EntradaEmailProveedor.setEnabled(false);
            EntradaWebProveedor.setEnabled(false);
            ComboCodigosNumeros.setEnabled(false);
             ComboCodigosNumeros.removeAllItems();
        
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void EntradaRifProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaRifProveedorKeyReleased

        EntradaRifProveedor.setText(EntradaRifProveedor.getText().toUpperCase());
        
        
        
    }//GEN-LAST:event_EntradaRifProveedorKeyReleased

    private void EntradaRifProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaRifProveedorKeyTyped

    }//GEN-LAST:event_EntradaRifProveedorKeyTyped

    private void EntradaTlfnoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaTlfnoProveedorKeyTyped

        
        char validar= evt.getKeyChar(); 
        
        if(Character.isLetter(validar)){
        
        getToolkit().beep();
        evt.consume();
        
        JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
        
        
        
    }//GEN-LAST:event_EntradaTlfnoProveedorKeyTyped

    private void EntradaNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNombreProveedorActionPerformed
        // TODO add your handling code here:
        
        
        
 
    }//GEN-LAST:event_EntradaNombreProveedorActionPerformed

    private void EntradaNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaNombreProveedorKeyTyped

        /*  
        char validar= evt.getKeyChar(); 
        
        if(Character.isDigit(validar)){
        
        getToolkit().beep();
        evt.consume();
        
        JOptionPane.showMessageDialog(rootPane, "Ingrese solo texto");
        }
        
       */ 
        
        
    }//GEN-LAST:event_EntradaNombreProveedorKeyTyped

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        
        btn_guardar(); 
        
    
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void boton_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salir2ActionPerformed

         JOptionPane.showMessageDialog(this, "Salio del Registro de proveedores");
        dispose();

    }//GEN-LAST:event_boton_salir2ActionPerformed

    private void EntradaRifProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaRifProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaRifProveedorActionPerformed

    private void EntradaTlfnoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaTlfnoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaTlfnoProveedorActionPerformed

    private void EntradaWebProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaWebProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaWebProveedorActionPerformed

    private void EntradaDireccionProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaDireccionProveedorKeyTyped
        // TODO add your handling code here:
        
        char validar= evt.getKeyChar(); 
        
        if(Character.isDigit(validar)){
        
        getToolkit().beep();
        evt.consume();
        
        JOptionPane.showMessageDialog(rootPane, "Ingrese solo texto");
        }
        
    }//GEN-LAST:event_EntradaDireccionProveedorKeyTyped

    private void ComboCodigosNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCodigosNumerosActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_ComboCodigosNumerosActionPerformed

    private void EntradaNombreProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaNombreProveedorKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(DarClick){
                //habilitar_btnConsulta();
                btn_consultar();
                DarClick= false;
              
            }
            if(SeModifico){
            
                btn_modificar();
            
            //SeModifico=false; 
            }
            
            if(Eliminar){
                
                btn_consultar();
                EliminarProveedor(); 
                Eliminar=false; 
            
            }
            
            
        EntradaRifProveedor.requestFocus();
        
        }
        
        
        
    }//GEN-LAST:event_EntradaNombreProveedorKeyPressed

    private void EntradaRifProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaRifProveedorKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        EntradaDireccionProveedor.requestFocus();}
        
        
    }//GEN-LAST:event_EntradaRifProveedorKeyPressed

    private void EntradaDireccionProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaDireccionProveedorKeyPressed

        // TODO add your handling code here:
        
        
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        EntradaTlfnoProveedor.requestFocus();}
    }//GEN-LAST:event_EntradaDireccionProveedorKeyPressed

    private void EntradaTlfnoProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaTlfnoProveedorKeyPressed

        // TODO add your handling code here:
      
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        EntradaEmailProveedor.requestFocus();}
    }//GEN-LAST:event_EntradaTlfnoProveedorKeyPressed

    private void EntradaWebProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaWebProveedorKeyPressed

        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       btn_Guardar.requestFocus();}
        
        
    }//GEN-LAST:event_EntradaWebProveedorKeyPressed

    private void EntradaEmailProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaEmailProveedorKeyPressed
 // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            
            if(ValidarEmail(EntradaEmailProveedor.getText().trim())== false){
            
            JOptionPane.showMessageDialog(rootPane, "formato de correo invalido");
                        EntradaEmailProveedor.requestFocus();
                        
                        
        EntradaEmailProveedor.setForeground(Color.RED);
        } else {
        
        EntradaWebProveedor.requestFocus();
        
        EntradaEmailProveedor.setForeground(Color.BLACK);
        
        
        }
        
            
            
            
}
        
        
        
    }//GEN-LAST:event_EntradaEmailProveedorKeyPressed

    private void btn_GuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_GuardarKeyPressed

        // TODO add your handling code here:
        
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        btn_AgregarProveedor.requestFocus();
        btn_guardar(); 
       
        
        
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_GuardarKeyPressed

    private void EntradaNombreProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaNombreProveedorKeyReleased
        // TODO add your handling code here:
        
        EntradaNombreProveedor.setText(EntradaNombreProveedor.getText().toUpperCase());
        

        
    }//GEN-LAST:event_EntradaNombreProveedorKeyReleased

    private void EntradaDireccionProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaDireccionProveedorKeyReleased
        // TODO add your handling code here:
        
        EntradaDireccionProveedor.setText(EntradaDireccionProveedor.getText().toUpperCase());
        
    }//GEN-LAST:event_EntradaDireccionProveedorKeyReleased

    private void EntradaEmailProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaEmailProveedorKeyReleased
        // TODO add your handling code here:
        
        EntradaEmailProveedor.setText(EntradaEmailProveedor.getText().toLowerCase());

        
    }//GEN-LAST:event_EntradaEmailProveedorKeyReleased

    private void EntradaWebProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaWebProveedorKeyReleased
        // TODO add your handling code here:
        
                EntradaWebProveedor.setText(EntradaWebProveedor.getText().toUpperCase());

        
    }//GEN-LAST:event_EntradaWebProveedorKeyReleased

    private void EntradaEmailProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EntradaEmailProveedorFocusGained
        // TODO add your handling code here:
        
        if(EntradaEmailProveedor.getText().equals("departamento@empresa.com")){
        
        EntradaEmailProveedor.setText("");
        
        }
        
        
    }//GEN-LAST:event_EntradaEmailProveedorFocusGained

    private void EntradaEmailProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaEmailProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaEmailProveedorActionPerformed

    private void EntradaEmailProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EntradaEmailProveedorFocusLost
        // TODO add your handling code here:
        
        
        if(EntradaEmailProveedor.getText().equals("")  ){
        
        EntradaEmailProveedor.setText("departamento@empresa.com");
        }
        
        
        
    }//GEN-LAST:event_EntradaEmailProveedorFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra_Registros_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
          //</editor-fold>
          //</editor-fold>
          
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override            public void run() {
                new Compra_Registros_proveedor().setVisible(true);
                
     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCodigosNumeros;
    private javax.swing.JPanel ContenedorFormulario;
    private javax.swing.JLabel Direcion;
    private javax.swing.JTextField EntradaDireccionProveedor;
    private javax.swing.JTextField EntradaEmailProveedor;
    private javax.swing.JTextField EntradaNombreProveedor;
    private javax.swing.JTextField EntradaRifProveedor;
    private javax.swing.JTextField EntradaTlfnoProveedor;
    private javax.swing.JTextField EntradaWebProveedor;
    private javax.swing.JButton boton_salir2;
    private javax.swing.JButton btn_AgregarProveedor;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_ConsultarProveedor;
    private javax.swing.JButton btn_EliminarProveedor;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_ModificarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
