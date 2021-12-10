/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Vistas;


import Compra.Controladores.PuertoData.Materiales.ActualizarMaterial;
import Compra.Controladores.PuertoData.Materiales.CrearMaterial;
import Compra.Controladores.PuertoData.Materiales.EliminarMaterial;
import Compra.Controladores.PuertoData.Materiales.LeerMaterial;
import Compra.Controladores.PuertoData.Proveedor.LeerCompra;
import Conection.ConexionBBDD;
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Administrador
 */



public class Compra_Registros_Materiales extends javax.swing.JFrame {

    LeerCompra proveedor = new LeerCompra();
    LeerMaterial ConsultaMaterial = new LeerMaterial();
    ActualizarMaterial ActualizarMaterial = new  ActualizarMaterial();
    CrearMaterial material= new CrearMaterial (); 
    EliminarMaterial EliminarMaterial = new EliminarMaterial();
    
    
      public boolean SeModifico= false; 
      public boolean DarClick = false;
      public boolean ClickNuevoProveedor = false;
      public boolean ClickEliminar= false; 
      public String presentacion[]={"","unidad", "caja ", "saco ", "bolsa ", "metro " }; 
      public String categoria[]={"","construccion", "pintura ", "remodelacion ", "decoracion ", "perecederos " }; 
      
        
      public ConexionBBDD con;
    
    /**
     * Creates new form Compras_Materiales
     */
    public Compra_Registros_Materiales() throws ClassNotFoundException {
        initComponents();
         this.setTitle("Registrar Materiales");
         
         ComboProveedor.removeAllItems();
         ComboProveedor.addItem(" ");
         
        // if(Click_nuevoProveedor(ClickNuevoProveedor) ){
       // JOptionPane.showMessageDialog(this, "tocaste nuevo proveedor"); 
   // }
        
         
         Timer timer = new Timer (5000, (ActionEvent e) -> {
            // Aquí el código que queramos ejecutar.
            if(ClickNuevoProveedor){
           // JOptionPane.showMessageDialog(this, "entro al timer");
            
            ComboProveedor.removeAllItems();
         ComboProveedor.addItem(" ");
         
         JComboBox  ProveedorDelCombo= ComboProveedor;
            
            try { 
                ConsultaMaterial.ComboBoxProveedores(ProveedorDelCombo);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });

timer.start();
          
     
         
       //  }    
           
        
         
         
        
    }
    
    private void habilitar_btnAgregar() throws ClassNotFoundException{
          
          btn_AgregarMaterial.setEnabled(false);
          btn_ModificarMaterial.setEnabled(true);
          btn_ConsultarMaterial.setEnabled(true);
          btn_EliminarMaterial.setEnabled(true);
          btn_GuardarMaterial.setEnabled(true);
          btn_NuevaProveedor.setEnabled(true); 
          
          EntradaCodigo.setEnabled(true);
          EntradaNombreMateriales.setEnabled(true);
          EntradaPresentacionMaterial.setEnabled(true);
          EntradaStockExistente.setEnabled(false);
          EntradaStockMinimo.setEnabled(false);
          EntradaCategoria.setEnabled(true); 
          ComboProveedor.setEnabled(true); 
          EntradaDescripcionMaterial.setEnabled(true); 
          
          
           llenarComboPresentacion(); 
           llenarComboCategoria(); 
          ConsultaMaterial.ComboBoxProveedores(ComboProveedor);

           
 
          
          
}
 
    /**************************************************************************/
    private void habilitar_btnModificar(){}
    /**
     * @param click************************************************************************/    
    public boolean Click_nuevoProveedor(boolean click){
    
               if(click){ 
        
        JOptionPane.showMessageDialog(this, "es verdadero"); 

               } else{ JOptionPane.showMessageDialog(this, "aja"); }
        
    return click; 

    }
    /**************************************************************************/
    private void habilitar_btnConsultar(){
    
          btn_AgregarMaterial.setEnabled(false);
          btn_ModificarMaterial.setEnabled(true);
          btn_ConsultarMaterial.setEnabled(true);
          btn_EliminarMaterial.setEnabled(true);
          
          
          EntradaCodigo.setEnabled(true);
          EntradaNombreMateriales.setEnabled(true);
          EntradaPresentacionMaterial.setEnabled(true);
          EntradaStockExistente.setEnabled(false);
          EntradaStockMinimo.setEnabled(false);
          EntradaCategoria.setEnabled(true); 
          ComboProveedor.setEnabled(true); 
          EntradaDescripcionMaterial.setEnabled(true);
//          btn_Buscar.setEnabled(true);
          
          btn_GuardarMaterial.setEnabled(false);
    
    
    
    
    
    }
    /**************************************************************************/
    private void habilitar_btnEliminar(){}
    /**************************************************************************/
    private void habilitar_btnGuardar(){
    
          EntradaCodigo.setEnabled(false);
          EntradaNombreMateriales.setEnabled(false);
          EntradaPresentacionMaterial.setEnabled(false);
          EntradaStockExistente.setEnabled(false);
          EntradaStockMinimo.setEnabled(false);
          EntradaCategoria.setEnabled(false); 
          ComboProveedor.setEnabled(false); 
          EntradaDescripcionMaterial.setEnabled(false); 
          /**********************************************************************/
          btn_AgregarMaterial.setEnabled(true);
          btn_ModificarMaterial.setEnabled(true);
          btn_EliminarMaterial.setEnabled(true);
          btn_ConsultarMaterial.setEnabled(true);
          
          
          
        
    
    
    }
    /**************************************************************************/
    
    public void llenarComboPresentacion(){
      
        EntradaPresentacionMaterial.removeAllItems(); 
        EntradaPresentacionMaterial.addItem(presentacion[0]);
        EntradaPresentacionMaterial.addItem(presentacion[1]);
        EntradaPresentacionMaterial.addItem(presentacion[2]);
        EntradaPresentacionMaterial.addItem(presentacion[3]);    
        EntradaPresentacionMaterial.addItem(presentacion[4]);    
        EntradaPresentacionMaterial.addItem(presentacion[5]);
    
    }
    /*------------------------------------------------------------------------*/
    
    private void llenarComboCategoria(){
    
    EntradaCategoria.removeAllItems();        
    EntradaCategoria.addItem(categoria[0]);
    EntradaCategoria.addItem(categoria[1]);
    EntradaCategoria.addItem(categoria[2]);
    EntradaCategoria.addItem(categoria[3]);    
    EntradaCategoria.addItem(categoria[4]);    
    EntradaCategoria.addItem(categoria[5]);
   
    }
    /*------------------------------------------------------------------------*/
    
    private void AsignarComboPresentacion( String valorBBDD){
    
    
    EntradaPresentacionMaterial.removeAllItems(); 
    EntradaPresentacionMaterial.addItem(valorBBDD);
    
    
    if(SeModifico){
    
    for( int i=1; i<6; i++){
    
        System.out.println(presentacion[i]+valorBBDD);

        if(presentacion[i].equals(valorBBDD)){
        System.out.println(presentacion[i]+valorBBDD);

    }
        else{
    EntradaPresentacionMaterial.addItem(presentacion[i]);
        }
    
    }
    }
    }
    /*******************************************************************/
    private void AsignarComboProveedor( String valorBBDD) throws ClassNotFoundException{
    
    
    ComboProveedor.removeAllItems();
    
    ComboProveedor.addItem(proveedor.BuscarNombreProveedor(Integer.valueOf(valorBBDD)));// insertar en combo el nombre del proveedor segun el valor
                  
    //ComboProveedor.addItem(valorBBDD);
    if(SeModifico){
        ComboProveedor.addItem(" "); 
    ConsultaMaterial.ComboBoxProveedores(ComboProveedor);
    }
    
    
    }
    /***************************************************************************/
    private void AsignarComboCategoria( String valorBBDD){
        
    EntradaCategoria.removeAllItems(); 
    EntradaCategoria.addItem(valorBBDD);
    
    if(SeModifico){
    for( int i=1; i<6; i++){
    
        System.out.println(presentacion[i]+valorBBDD);

        if(categoria[i].equals(valorBBDD)){
        System.out.println(categoria[i]+valorBBDD);

    }
        else{
    EntradaCategoria.addItem(categoria[i]);
        }
    
    }
    
    }
    }
    /***************************************************************************/
    private void NuevaEntrada() {
        EntradaCodigo.setText(""); 
        EntradaNombreMateriales.setText("");
        EntradaPresentacionMaterial.removeAllItems(); 
        EntradaStockExistente.setText("");
        EntradaStockMinimo.setText("");
        EntradaCategoria.removeAllItems(); 
        EntradaDescripcionMaterial.setText("");
        ComboProveedor.removeAllItems();
        /********************************/
         EntradaCodigo.setEnabled(false); 
        EntradaNombreMateriales.setEnabled(false);
        EntradaPresentacionMaterial.setEnabled(false);       
        EntradaStockExistente.setEnabled(false);  
        EntradaCategoria.setEnabled(false);
        EntradaDescripcionMaterial.setEnabled(false);
        ComboProveedor.setEnabled(false);
                
    }
    /**************************************************************************/
    private void habilitar_btnConsulta(){
        
        
        
        
        }
    /**************************************************************************/
   /**
     * @throws java.lang.ClassNotFoundException*
     * @throws java.sql.SQLException************************************************************************/
    public void GuardarMaterial() throws ClassNotFoundException, SQLException{
    
    
    
        boolean existe =false;   
      
    String nombre_mtrl=(EntradaNombreMateriales.getText().trim());
    String presentacion_mtrl=(EntradaPresentacionMaterial.getSelectedItem().toString()); 
    String StockExistente=("0"); 
    String StockMinimo="0"; 
    String Categoria= EntradaCategoria.getSelectedItem().toString(); 
    String NombreProveedor= (ComboProveedor.getSelectedItem().toString());
    String descripcion_mtrl=(EntradaDescripcionMaterial.getText().trim());
    String codigo=(EntradaCodigo.getText().trim());                                          

    existe= ConsultaMaterial.ExisteMaterial(nombre_mtrl); 
    
     int IdMaterial= ConsultaMaterial.BuscarIdMaterial(nombre_mtrl);
     int id_proveedor=proveedor.BuscarProveedor(NombreProveedor); 
     int stock_min=Integer.parseInt(StockMinimo); 
     int stock_existente=Integer.parseInt(StockExistente); 
                        
    

if ((existe==true) && (SeModifico==false)){
    
    JOptionPane.showMessageDialog(this, "El Material ya esta registrado");
} 

else{
    if ((existe == true) && (SeModifico == true)) {
                    
                       
                        
                        ActualizarMaterial.UpdateMaterial(IdMaterial, nombre_mtrl, descripcion_mtrl, presentacion_mtrl, id_proveedor, stock_min, stock_existente,Categoria,codigo);
                         JOptionPane.showMessageDialog(this, "El Registro ha sido actualizado");
                         btn_ConsultarMaterial.setEnabled(false);
                          SeModifico=false; 
                   }
                    
                    else {
                    
                    material.CrearMaterial(nombre_mtrl, descripcion_mtrl,presentacion_mtrl,id_proveedor ,stock_min ,stock_existente , Categoria,codigo);
                    
                    JOptionPane.showMessageDialog(this, "El Registro ha sido guardado");
                        btn_ConsultarMaterial.setEnabled(false);
                        

                    
                    
                   }
}
    }
    /**************************************************************************/           
    public void btn_guardar(){
     
if ( EntradaNombreMateriales.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Debe introducir el nombre del material");
            //NuevaEntrada(); 
            habilitar_btnGuardar(); 
            

} else{
          try {
              // guardamos los datos del formulario con un solo metodo
              
              
              GuardarMaterial();
              //NuevaEntrada();  
          } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
          }
            NuevaEntrada(); 
            habilitar_btnGuardar(); 
        
        
        
}
   
    
    
    }
    /**************************************************************************/
    public void EliminarMaterial(){
        
        
        
        if (EntradaNombreMateriales.getText().trim().equals(""))
            JOptionPane.showMessageDialog(this, "Debe introducir el nombre del Material ");
        else{
        
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Está seguro de que quiere eliminar el material?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
            }
            try { 
                int IdMaterial= ConsultaMaterial.BuscarIdMaterial(EntradaNombreMateriales.getText().trim());
                
                if (IdMaterial != 0){
                    
                    JOptionPane.showMessageDialog(this, "El material fue eliminado con éxito");
                    EliminarMaterial.eliminar(IdMaterial);
                   
                    NuevaEntrada();
                    
                    btn_ModificarMaterial.setEnabled(false);
                    btn_EliminarMaterial.setEnabled(false);
                    btn_GuardarMaterial.setEnabled(false);
                    btn_AgregarMaterial.setEnabled(true);
                    
                    EntradaNombreMateriales.setEnabled(false);
                    EntradaPresentacionMaterial.setEnabled(false);
                    EntradaStockExistente.setEnabled(false);
                    EntradaStockMinimo.setEnabled(false);
                    EntradaCategoria.setEnabled(false);
                    ComboProveedor.setEnabled(false);
                    EntradaDescripcionMaterial.setEnabled(false);
            
            
            
                    
                    
                }
                else
                JOptionPane.showMessageDialog(this, "El material no existe");
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Compra_Registros_proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
            
        
        }
            
        
       
    
    
    
    
    }
    /**************************************************************************/
    public void ModificarMaterial(){
    
    /**************************************************************************/
  
    
    /**************************************************************************/
    if (EntradaNombreMateriales.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Debe introducir el nombre del Material");
            btn_ModificarMaterial.setEnabled(true);}
        else {

    /**************************************************************************/
            int ID_material = 0;
            try {
                ID_material = ConsultaMaterial.BuscarIdMaterial(EntradaNombreMateriales.getText().trim());

            if (ID_material != 0){
                
                Object[] obj = null;
                
                     obj = ConsultaMaterial.getDatos1(ID_material);
                 
                if (obj == null){
                    JOptionPane.showMessageDialog(this, "El Material no existe");

                }
                else {
                    EntradaNombreMateriales.setText(obj[1].toString());
                    EntradaDescripcionMaterial.setText(obj[2].toString());
                    /**/
                    AsignarComboPresentacion(obj[3].toString());
                    
                    AsignarComboProveedor(obj[4].toString()); 
                    EntradaStockMinimo.setText(obj[5].toString());
                    EntradaStockExistente.setText(obj[6].toString());
                   /**/
                    AsignarComboCategoria(obj[7].toString());
                    EntradaCodigo.setText(obj[8].toString());
          
            }
                }
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
            }
} 
    
           EntradaCodigo.setEnabled(true);     
          EntradaNombreMateriales.setEnabled(true);
          EntradaPresentacionMaterial.setEnabled(true);
          EntradaStockExistente.setEnabled(false);
          EntradaStockMinimo.setEnabled(false);
          EntradaCategoria.setEnabled(true); 
          ComboProveedor.setEnabled(true); 
          EntradaDescripcionMaterial.setEnabled(true);
//          btn_Buscar.setEnabled(true);
          
          btn_GuardarMaterial.setEnabled(true);       
                
                
                
        
    
    
    
    }
    /****************************************************************************/
    public void btn_consultar() throws ClassNotFoundException{
      ComboProveedor.removeAllItems(); 
      String proveedorComboBox = null; 
    
        if (EntradaNombreMateriales.getText().trim().equals(""))
                        JOptionPane.showMessageDialog(this, "Debe introducir el nombre del Material");
                else{
            
                        habilitar_btnConsultar(); 
                        int ID_material = 0;
                
                        ID_material = ConsultaMaterial.BuscarIdMaterial(EntradaNombreMateriales.getText().trim());
                    
                    
            if (ID_material == 0){
                
                JOptionPane.showMessageDialog(this, "El Material no existe"); 
                EntradaNombreMateriales.setText("");
                
            }           
            else{
                
                Object[] obj = null;
                
                try {
                    obj = ConsultaMaterial.getDatos1(ID_material);
                    
                    if (obj == null)
                        JOptionPane.showMessageDialog(this, "El Material no existe");
                    
                    else {
                    EntradaNombreMateriales.setText(obj[1].toString());
                    EntradaDescripcionMaterial.setText(obj[2].toString());
                    AsignarComboPresentacion(obj[3].toString());
                    //ConsultaMaterial.ComboBoxProveedores(ComboProveedor);
                    AsignarComboProveedor(obj[4].toString()); 
                    //ComboProveedor.addItem(proveedor.BuscarNombreProveedor(Integer.valueOf(obj[4].toString())));// insertar en combo el valor
                    EntradaStockMinimo.setText(obj[5].toString());
                    EntradaStockExistente.setText(obj[6].toString());
                    AsignarComboCategoria(obj[7].toString());
                    EntradaCodigo.setText(obj[8].toString());
                    }
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
                }
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        EntradaStockMinimo = new javax.swing.JTextField();
        btn_NuevaProveedor = new javax.swing.JButton();
        EntradaDescripcionMaterial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        EntradaNombreMateriales = new javax.swing.JTextField();
        EntradaStockExistente = new javax.swing.JTextField();
        btn_GuardarMaterial = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        EntradaCategoria = new javax.swing.JComboBox<>();
        EntradaPresentacionMaterial = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_AgregarMaterial = new javax.swing.JButton();
        btn_ModificarMaterial = new javax.swing.JButton();
        btn_ConsultarMaterial = new javax.swing.JButton();
        btn_EliminarMaterial = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 43, 135));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 43, 135));
        jLabel7.setText("Descripción");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 43, 135));
        jLabel9.setText("Stop minimo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 43, 135));
        jLabel10.setText("Stop minimo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(223, 226, 227));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materiales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 43, 135))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 43, 135));
        jLabel2.setText("Presentación");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 43, 135));
        jLabel5.setText("Descripción");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 43, 135));
        jLabel3.setText("Proveedor");

        ComboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboProveedor.setEnabled(false);
        ComboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProveedorActionPerformed(evt);
            }
        });
        ComboProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ComboProveedorKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 43, 135));
        jLabel4.setText("Nombre");

        EntradaStockMinimo.setEnabled(false);
        EntradaStockMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaStockMinimoKeyPressed(evt);
            }
        });

        btn_NuevaProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_NuevaProveedor.setForeground(new java.awt.Color(0, 43, 135));
        btn_NuevaProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        btn_NuevaProveedor.setText("Nuevo Proveedor");
        btn_NuevaProveedor.setEnabled(false);
        btn_NuevaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevaProveedorActionPerformed(evt);
            }
        });

        EntradaDescripcionMaterial.setEnabled(false);
        EntradaDescripcionMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDescripcionMaterialActionPerformed(evt);
            }
        });
        EntradaDescripcionMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaDescripcionMaterialKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaDescripcionMaterialKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 43, 135));
        jLabel8.setText("Stock Minimo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 43, 135));
        jLabel11.setText("Stock Existente");

        EntradaNombreMateriales.setEnabled(false);
        EntradaNombreMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNombreMaterialesActionPerformed(evt);
            }
        });
        EntradaNombreMateriales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaNombreMaterialesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaNombreMaterialesKeyReleased(evt);
            }
        });

        EntradaStockExistente.setEnabled(false);
        EntradaStockExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaStockExistenteActionPerformed(evt);
            }
        });
        EntradaStockExistente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaStockExistenteKeyPressed(evt);
            }
        });

        btn_GuardarMaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_GuardarMaterial.setForeground(new java.awt.Color(0, 43, 135));
        btn_GuardarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquete.png"))); // NOI18N
        btn_GuardarMaterial.setText("Guardar");
        btn_GuardarMaterial.setEnabled(false);
        btn_GuardarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarMaterialActionPerformed(evt);
            }
        });
        btn_GuardarMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_GuardarMaterialKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 43, 135));
        jLabel12.setText("Categoria");

        EntradaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EntradaCategoria.setDoubleBuffered(true);
        EntradaCategoria.setEnabled(false);
        EntradaCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaCategoriaKeyPressed(evt);
            }
        });

        EntradaPresentacionMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EntradaPresentacionMaterial.setEnabled(false);
        EntradaPresentacionMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaPresentacionMaterialKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 43, 135));
        jLabel13.setText("Codigo");

        EntradaCodigo.setEnabled(false);
        EntradaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCodigoActionPerformed(evt);
            }
        });
        EntradaCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaCodigoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaDescripcionMaterial)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EntradaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EntradaStockExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EntradaStockMinimo)
                                    .addComponent(ComboProveedor, 0, 186, Short.MAX_VALUE)
                                    .addComponent(EntradaPresentacionMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(EntradaNombreMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_GuardarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NuevaProveedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EntradaNombreMateriales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_GuardarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaPresentacionMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(EntradaStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntradaStockExistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addComponent(ComboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_NuevaProveedor)
                            .addComponent(EntradaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaDescripcionMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26))
        );

        btn_AgregarMaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_AgregarMaterial.setForeground(new java.awt.Color(0, 43, 135));
        btn_AgregarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        btn_AgregarMaterial.setText("Agregar");
        btn_AgregarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarMaterialActionPerformed(evt);
            }
        });

        btn_ModificarMaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ModificarMaterial.setForeground(new java.awt.Color(0, 43, 135));
        btn_ModificarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave-con-sistema-de-ajuste-para-diferentes-tamanos-de-tuercas.png"))); // NOI18N
        btn_ModificarMaterial.setText("Modificar");
        btn_ModificarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarMaterialActionPerformed(evt);
            }
        });

        btn_ConsultarMaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ConsultarMaterial.setForeground(new java.awt.Color(0, 43, 135));
        btn_ConsultarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_ConsultarMaterial.setText("Consultar");
        btn_ConsultarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarMaterialActionPerformed(evt);
            }
        });

        btn_EliminarMaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_EliminarMaterial.setForeground(new java.awt.Color(0, 43, 135));
        btn_EliminarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_EliminarMaterial.setText("Eliminar");
        btn_EliminarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarMaterialActionPerformed(evt);
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
                .addComponent(btn_AgregarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ModificarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ConsultarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EliminarMaterial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_ModificarMaterial)
                .addComponent(btn_ConsultarMaterial)
                .addComponent(btn_EliminarMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_AgregarMaterial))
        );

        boton_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_salir.setForeground(new java.awt.Color(0, 43, 135));
        boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        boton_salir.setText("Salir");
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_salir)
                .addGap(46, 46, 46))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Datos Materiales");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboProveedorActionPerformed

    private void btn_NuevaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevaProveedorActionPerformed
        // TODO add your handling code here:

        ClickNuevoProveedor=true; 
        
        Compra_Registros_proveedor abrir= new Compra_Registros_proveedor(); 
        
        abrir.setVisible(true); 
        
        
        
       
     

    }//GEN-LAST:event_btn_NuevaProveedorActionPerformed

    private void btn_AgregarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarMaterialActionPerformed

     EntradaNombreMateriales.requestFocus();

        try {
            // TODO add your handling code here:
            
             
            habilitar_btnAgregar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_AgregarMaterialActionPerformed

    private void btn_ModificarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarMaterialActionPerformed
        // TODO add your handling code here:
         
        SeModifico= true; 
        EntradaNombreMateriales.setEnabled(true);
        //EntradaCodigo.requestFocus();
        EntradaNombreMateriales.requestFocus();
       
        
        
    }//GEN-LAST:event_btn_ModificarMaterialActionPerformed

    private void btn_ConsultarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarMaterialActionPerformed
        // TODO add your handling code here:
        DarClick= true; 
        SeModifico= false;
        
            btn_ModificarMaterial.setEnabled(false);
            btn_EliminarMaterial.setEnabled(false);
            btn_GuardarMaterial.setEnabled(false);
            EntradaNombreMateriales.requestFocus();
        
         habilitar_btnConsultar();
            EntradaCodigo.setEnabled(false);
            EntradaPresentacionMaterial.setEnabled(false);
            EntradaStockExistente.setEnabled(false);
            EntradaStockMinimo.setEnabled(false);
            EntradaCategoria.setEnabled(false);
            ComboProveedor.setEnabled(false);
            EntradaDescripcionMaterial.setEnabled(false);
        
        
        
        
        
    }//GEN-LAST:event_btn_ConsultarMaterialActionPerformed

    private void btn_EliminarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarMaterialActionPerformed
        // TODO add your handling code here:
       ClickEliminar=true; 
       EntradaNombreMateriales.setEnabled(true);
       EntradaNombreMateriales.requestFocus();
       //ClickEliminar=false;
         
    }//GEN-LAST:event_btn_EliminarMaterialActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:
        
        
        NuevaEntrada(); 
          btn_AgregarMaterial.setEnabled(true);
          btn_ModificarMaterial.setEnabled(true);
          btn_ConsultarMaterial.setEnabled(true);
          btn_EliminarMaterial.setEnabled(true);
          btn_GuardarMaterial.setEnabled(false);
          btn_NuevaProveedor.setEnabled(false); 
          
          
    SeModifico= false; 
    DarClick = false;
    ClickNuevoProveedor = false;
    ClickEliminar= false; 
            
 
        
        
        
        
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed

        JOptionPane.showMessageDialog(this, "Salio del Registro de materiales");
        dispose();
    }//GEN-LAST:event_boton_salirActionPerformed

    private void btn_GuardarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarMaterialActionPerformed

        // TODO add your handling code here:

       btn_guardar(); 
       
      
       ClickNuevoProveedor=false; 
    
        
        
        
        
        
        
    }//GEN-LAST:event_btn_GuardarMaterialActionPerformed

    private void EntradaNombreMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNombreMaterialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNombreMaterialesActionPerformed

    private void EntradaStockExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaStockExistenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaStockExistenteActionPerformed

    private void EntradaDescripcionMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaDescripcionMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaDescripcionMaterialActionPerformed

    private void EntradaNombreMaterialesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaNombreMaterialesKeyPressed

        // TODO add your handling code here:
       
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             
             if(DarClick){
            
            
                 try { 
                     btn_consultar();
                 } catch (ClassNotFoundException ex) {
                     Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
                 }
            
            DarClick=false; 
            } if(ClickEliminar){
                 try {
                     btn_consultar();
                 } catch (ClassNotFoundException ex) {
                     Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
                 }
                EliminarMaterial();
            ClickEliminar=false;
            
            } if(SeModifico) {

                ModificarMaterial();
        
            }
             
       
        //EntradaPresentacionMaterial.requestFocus();
        EntradaCodigo.requestFocus();
        }
    }//GEN-LAST:event_EntradaNombreMaterialesKeyPressed

    private void EntradaStockMinimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaStockMinimoKeyPressed

        // TODO add your handling code here:
         
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
        EntradaCategoria.requestFocus();
        
        }
        
    }//GEN-LAST:event_EntradaStockMinimoKeyPressed

    private void EntradaStockExistenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaStockExistenteKeyPressed

        // TODO add your handling code here:
        
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
        EntradaStockMinimo.requestFocus();
        
        }
        
    }//GEN-LAST:event_EntradaStockExistenteKeyPressed

    private void EntradaDescripcionMaterialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaDescripcionMaterialKeyPressed

        // TODO add your handling code here:
        
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
         btn_GuardarMaterial.requestFocus();
        
        }
       
    }//GEN-LAST:event_EntradaDescripcionMaterialKeyPressed

    private void btn_GuardarMaterialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_GuardarMaterialKeyPressed

       btn_guardar(); 
    }//GEN-LAST:event_btn_GuardarMaterialKeyPressed

    private void ComboProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboProveedorKeyPressed

        // TODO add your handling code here:
        
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
         EntradaDescripcionMaterial.requestFocus();
        
        }
        
    }//GEN-LAST:event_ComboProveedorKeyPressed

    private void EntradaPresentacionMaterialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaPresentacionMaterialKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
         EntradaCategoria.requestFocus();
        
        }
        
        
        
    }//GEN-LAST:event_EntradaPresentacionMaterialKeyPressed

    private void EntradaCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaCategoriaKeyPressed
        // TODO add your handling code here:
          
        
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
         ComboProveedor.requestFocus();
        
        }
        
        
        
    }//GEN-LAST:event_EntradaCategoriaKeyPressed

    private void EntradaNombreMaterialesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaNombreMaterialesKeyReleased


        // TODO add your handling code here:
        
        
         EntradaNombreMateriales.setText(EntradaNombreMateriales.getText().toUpperCase());
    }//GEN-LAST:event_EntradaNombreMaterialesKeyReleased

    private void EntradaDescripcionMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaDescripcionMaterialKeyReleased

        // TODO add your handling code here:
        
        
         EntradaDescripcionMaterial.setText(EntradaDescripcionMaterial.getText().toUpperCase());
    }//GEN-LAST:event_EntradaDescripcionMaterialKeyReleased

    private void EntradaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCodigoActionPerformed

    private void EntradaCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaCodigoKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       EntradaPresentacionMaterial.requestFocus();
         }
    }//GEN-LAST:event_EntradaCodigoKeyPressed

    private void EntradaCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCodigoKeyReleased

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Compra_Registros_Materiales().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compra_Registros_Materiales.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboProveedor;
    private javax.swing.JComboBox<String> EntradaCategoria;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaDescripcionMaterial;
    private javax.swing.JTextField EntradaNombreMateriales;
    private javax.swing.JComboBox<String> EntradaPresentacionMaterial;
    private javax.swing.JTextField EntradaStockExistente;
    private javax.swing.JTextField EntradaStockMinimo;
    private javax.swing.JButton boton_salir;
    private javax.swing.JButton btn_AgregarMaterial;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_ConsultarMaterial;
    private javax.swing.JButton btn_EliminarMaterial;
    private javax.swing.JButton btn_GuardarMaterial;
    private javax.swing.JButton btn_ModificarMaterial;
    private javax.swing.JButton btn_NuevaProveedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
