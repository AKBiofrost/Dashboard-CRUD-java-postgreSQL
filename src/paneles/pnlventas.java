/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import Frames_formularios.Ventas_Consultar_Clientes;
import Frames_formularios.Ventas_Consultar_Vendedor;
import Frames_formularios.Ventas_Registrar_Clientes;
import Frames_formularios.Ventas_NotaDeEntraga;
import Frames_formularios.Ventas_Pagos;
import Frames_formularios.Ventas_Registrar_Vendedores;
import Frames_formularios.Ventas_consultar_pagos;

/**
 *
 * @author RojeruSan
 */
public class pnlventas extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    public pnlventas() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_consultas_consulta = new javax.swing.JButton();
        boton_registrar_clientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boton_consultas_vendedores = new javax.swing.JButton();
        boton_registrar_vendedores = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton_registrar_pagos = new javax.swing.JButton();
        boton_consultas_pagos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boton_notadeEntrega = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 226, 227));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 43, 135));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ventas");

        jPanel1.setBackground(new java.awt.Color(223, 226, 227));

        boton_consultas_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_consultas_consulta.setForeground(new java.awt.Color(0, 43, 135));
        boton_consultas_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        boton_consultas_consulta.setText("Consulta");
        boton_consultas_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultas_consultaActionPerformed(evt);
            }
        });

        boton_registrar_clientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_registrar_clientes.setForeground(new java.awt.Color(0, 43, 135));
        boton_registrar_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        boton_registrar_clientes.setText("Registros");
        boton_registrar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_clientesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 43, 135));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cotizaciones/clientes");

        boton_consultas_vendedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_consultas_vendedores.setForeground(new java.awt.Color(0, 43, 135));
        boton_consultas_vendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        boton_consultas_vendedores.setText("Consulta");
        boton_consultas_vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultas_vendedoresActionPerformed(evt);
            }
        });

        boton_registrar_vendedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_registrar_vendedores.setForeground(new java.awt.Color(0, 43, 135));
        boton_registrar_vendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        boton_registrar_vendedores.setText("Registros");
        boton_registrar_vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_vendedoresActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 43, 135));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vendedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_registrar_vendedores)
                .addGap(18, 18, 18)
                .addComponent(boton_consultas_vendedores))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_registrar_clientes)
                        .addGap(18, 18, 18)
                        .addComponent(boton_consultas_consulta))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_consultas_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_consultas_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(223, 226, 227));

        boton_registrar_pagos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_registrar_pagos.setForeground(new java.awt.Color(0, 43, 135));
        boton_registrar_pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        boton_registrar_pagos.setText("Registros");
        boton_registrar_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_pagosActionPerformed(evt);
            }
        });

        boton_consultas_pagos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_consultas_pagos.setForeground(new java.awt.Color(0, 43, 135));
        boton_consultas_pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        boton_consultas_pagos.setText("Consulta");
        boton_consultas_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultas_pagosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 43, 135));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pagos/facturas");

        boton_notadeEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notas (2).png"))); // NOI18N
        boton_notadeEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_notadeEntregaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 43, 135));
        jLabel4.setText("Nota de entrega");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(boton_registrar_pagos)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(boton_consultas_pagos)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(boton_notadeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_consultas_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_notadeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_notadeEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_notadeEntregaActionPerformed
        
Ventas_NotaDeEntraga abrir= new  Ventas_NotaDeEntraga(); 
        
        abrir.setVisible(true); 

// TODO add your handling code here:
    }//GEN-LAST:event_boton_notadeEntregaActionPerformed

    private void boton_registrar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_clientesActionPerformed
       Ventas_Registrar_Clientes abrir= new Ventas_Registrar_Clientes();

        abrir.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_boton_registrar_clientesActionPerformed

    private void boton_consultas_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultas_consultaActionPerformed

        Ventas_Consultar_Clientes abrir= new Ventas_Consultar_Clientes();

        abrir.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_boton_consultas_consultaActionPerformed

    private void boton_registrar_vendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_vendedoresActionPerformed

Ventas_Registrar_Vendedores abrir = new Ventas_Registrar_Vendedores(); 

 abrir.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_registrar_vendedoresActionPerformed

    private void boton_consultas_vendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultas_vendedoresActionPerformed
       
        Ventas_Consultar_Vendedor abrir = new Ventas_Consultar_Vendedor(); 

            abrir.setVisible(true);


// TODO add your handling code here:
    }//GEN-LAST:event_boton_consultas_vendedoresActionPerformed

    private void boton_registrar_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_pagosActionPerformed
Ventas_Pagos abrir = new Ventas_Pagos(); 

abrir.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_boton_registrar_pagosActionPerformed

    private void boton_consultas_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultas_pagosActionPerformed

        Ventas_consultar_pagos abrir = new Ventas_consultar_pagos(); 
        abrir.setVisible(true);
   
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_consultas_pagosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_consultas_consulta;
    private javax.swing.JButton boton_consultas_pagos;
    private javax.swing.JButton boton_consultas_vendedores;
    private javax.swing.JButton boton_notadeEntrega;
    private javax.swing.JButton boton_registrar_clientes;
    private javax.swing.JButton boton_registrar_pagos;
    private javax.swing.JButton boton_registrar_vendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
