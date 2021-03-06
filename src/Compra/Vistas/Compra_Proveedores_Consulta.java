/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Vistas;

import Compra.Controladores.PuertoData.Materiales.LeerMaterial;
import Compra.Controladores.UsesCases.ReportesProveedor;
import Conection.ConexionBBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Principal;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class Compra_Proveedores_Consulta extends javax.swing.JFrame {
    
    
    
    
    LeerMaterial ConsultarMaterial = new LeerMaterial(); 
    public ConexionBBDD conexion = new  ConexionBBDD();
    ReportesProveedor reportes = new ReportesProveedor(); 
    
     //public ConexionBBDD con;

    /**
     * Creates new form Compra_Proveedores_Consulta
     */
    public Compra_Proveedores_Consulta() throws ClassNotFoundException {
        initComponents();
        this.setTitle("Consultar Proveedores");
        
        
        ComboNombreMaterial.removeAllItems();
        
        
        ConsultarMaterial.ComboBoxMateriales(ComboNombreMaterial);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImprimirPDF = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        ComboNombreMaterial = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 43, 135));
        jLabel2.setText("Consultar Proveedores");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 43, 135))); // NOI18N

        ImprimirPDF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ImprimirPDF.setForeground(new java.awt.Color(0, 43, 135));
        ImprimirPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        ImprimirPDF.setText("Imprimir en PDF");
        ImprimirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirPDFActionPerformed(evt);
            }
        });

        boton_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_salir.setForeground(new java.awt.Color(0, 43, 135));
        boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        boton_salir.setText("Salir");
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        ComboNombreMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 43, 135));
        jLabel1.setText("Material");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboNombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImprimirPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ImprimirPDF)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboNombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
  
      
        dispose();


    }//GEN-LAST:event_boton_salirActionPerformed

    private void ImprimirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirPDFActionPerformed
        //try {
            // TODO add your handling code here:
            
            String  NombreReporte= "NombreProveedores_NombreMateriales.jasper"; 
            String  DatoConsulta=" ";
            String CampoTabla= "nombreMaterial"; 
            
            
        try {
            DatoConsulta=(String) ComboNombreMaterial.getSelectedItem();
            reportes.reportes_un_parametro(NombreReporte, DatoConsulta, CampoTabla);
          
            /*
            
            
            Map parametro = new HashMap();
            //Connection conexion;
            //ConexionBBDD conexion = new  ConexionBBDD();
            String NombreMaterial = (String) ComboNombreMaterial.getSelectedItem(); 
            
           
            parametro.put("nombreMaterial", NombreMaterial);
            String rutaReporte=System.getProperty("user.dir")+"/src/Reportes/NombreProveedores_NombreMateriales.jasper";
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile(rutaReporte);
            
            
            // Class.forName("org.postgresql.Driver");
            //conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bddkmall","postgres", "abcd");
            
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametro, conexion.CrearConexion() );
            JasperViewer view = new JasperViewer(print,false);
            view.setVisible(true);
            //conexion.close();
            
            
            } catch (ClassNotFoundException | SQLException | JRException e) {
            System.err.println("Error al generar el reporte -> "+e.getMessage());
            
            
            }
            
            
            */
        } catch (JRException | ClassNotFoundException ex) {
            Logger.getLogger(Compra_Proveedores_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImprimirPDFActionPerformed

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
            java.util.logging.Logger.getLogger(Compra_Proveedores_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra_Proveedores_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra_Proveedores_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra_Proveedores_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Compra_Proveedores_Consulta().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compra_Proveedores_Consulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboNombreMaterial;
    private javax.swing.JButton ImprimirPDF;
    private javax.swing.JButton boton_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
