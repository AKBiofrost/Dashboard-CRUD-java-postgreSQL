/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;


import Compra.Vistas.Compra_Proveedores_Consulta;
import Frames_formularios.Compra_consultas_materiales;
import Compra.Vistas.Compra_Registros_Materiales;
import Compra.Vistas.Compra_Registros_proveedor;
import Frames_formularios.Compra_Reportes;
import Frames_formularios.Compra_cotizaciones;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import paneles.CambiaPanel;

/**
 *
 * @author RojeruSan
 */
public class pnlcompras extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    public pnlcompras() {
        initComponents();
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_consulta_materiales = new javax.swing.JButton();
        boton_consultas_proveedores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boton_registrar_materiales = new javax.swing.JButton();
        boton_registrar_proveedores = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton_reportes_compras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        boton_cotizaciones = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        jButton7.setText("Consulta");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        jButton2.setText("Registros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(223, 226, 227));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 43, 135));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compras");

        jPanel1.setBackground(new java.awt.Color(223, 226, 227));

        boton_consulta_materiales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_consulta_materiales.setForeground(new java.awt.Color(0, 43, 135));
        boton_consulta_materiales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        boton_consulta_materiales.setText("Consulta");
        boton_consulta_materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consulta_materialesActionPerformed(evt);
            }
        });

        boton_consultas_proveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_consultas_proveedores.setForeground(new java.awt.Color(0, 43, 135));
        boton_consultas_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        boton_consultas_proveedores.setText("Consulta");
        boton_consultas_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultas_proveedoresActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 43, 135));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Materiales");

        boton_registrar_materiales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_registrar_materiales.setForeground(new java.awt.Color(0, 43, 135));
        boton_registrar_materiales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        boton_registrar_materiales.setText("Registros");
        boton_registrar_materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_materialesActionPerformed(evt);
            }
        });

        boton_registrar_proveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_registrar_proveedores.setForeground(new java.awt.Color(0, 43, 135));
        boton_registrar_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        boton_registrar_proveedores.setText("Registros");
        boton_registrar_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_proveedoresActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 43, 135));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Proveedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boton_registrar_proveedores)
                                .addGap(18, 18, 18)
                                .addComponent(boton_consultas_proveedores))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boton_registrar_materiales)
                                .addGap(18, 18, 18)
                                .addComponent(boton_consulta_materiales))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_consultas_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_consulta_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_registrar_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(223, 226, 227));

        boton_reportes_compras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_reportes_compras.setForeground(new java.awt.Color(0, 43, 135));
        boton_reportes_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafico-circular_1.png"))); // NOI18N
        boton_reportes_compras.setText("Compra");
        boton_reportes_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reportes_comprasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 43, 135));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reportes");

        boton_cotizaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_cotizaciones.setForeground(new java.awt.Color(0, 43, 135));
        boton_cotizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pago (2).png"))); // NOI18N
        boton_cotizaciones.setText("Orden Compra");
        boton_cotizaciones.setToolTipText("");
        boton_cotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cotizacionesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 43, 135));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cotizacion/Orden Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton_reportes_compras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton_cotizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(boton_cotizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_reportes_compras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_reportes_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reportes_comprasActionPerformed
        
 Compra_Reportes abrir= new Compra_Reportes(); 
        
        abrir.setVisible(true);
        

// TODO add your handling code here:
    }//GEN-LAST:event_boton_reportes_comprasActionPerformed

    private void boton_cotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cotizacionesActionPerformed

 Compra_cotizaciones abrir= new Compra_cotizaciones(); 
        
        abrir.setVisible(true);
        
         


        // TODO add your handling code here:
    }//GEN-LAST:event_boton_cotizacionesActionPerformed

    private void boton_registrar_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_proveedoresActionPerformed
Compra_Registros_proveedor abrir= new Compra_Registros_proveedor(); 
        
        abrir.setVisible(true); 
       

        // TODO add your handling code here:
    }//GEN-LAST:event_boton_registrar_proveedoresActionPerformed

    private void boton_consultas_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultas_proveedoresActionPerformed

Compra_Proveedores_Consulta abrir = null; 
        try {
            abrir = new Compra_Proveedores_Consulta();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pnlcompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        abrir.setVisible(true); 



        // TODO add your handling code here:
    }//GEN-LAST:event_boton_consultas_proveedoresActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void boton_consulta_materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consulta_materialesActionPerformed
Compra_consultas_materiales abrir= new Compra_consultas_materiales(); 
        
        abrir.setVisible(true);   


        // TODO add your handling code here:
    }//GEN-LAST:event_boton_consulta_materialesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton_registrar_materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_materialesActionPerformed
   
 Compra_Registros_Materiales abrir = null; 
        try {
            abrir = new Compra_Registros_Materiales();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pnlcompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        abrir.setVisible(true);        

// TODO add your handling code here:
    }//GEN-LAST:event_boton_registrar_materialesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_consulta_materiales;
    private javax.swing.JButton boton_consultas_proveedores;
    private javax.swing.JButton boton_cotizaciones;
    private javax.swing.JButton boton_registrar_materiales;
    private javax.swing.JButton boton_registrar_proveedores;
    private javax.swing.JButton boton_reportes_compras;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
