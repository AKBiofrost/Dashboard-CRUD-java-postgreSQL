package Frames_formularios;

import principal.Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Ventas_Datos_clientes extends javax.swing.JFrame {

    /**
     * Creates new form Ventas_Datos_clientes
     */
    public Ventas_Datos_clientes() {
        initComponents();
         this.setTitle("Datos Clientes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextNombre1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextTelefono1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextEmail1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextRifProv1 = new javax.swing.JTextField();
        jNuevaBusqueda1 = new javax.swing.JButton();
        jNuevaBusqueda2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonAgregar2 = new javax.swing.JButton();
        jButtonModificar1 = new javax.swing.JButton();
        jButtonConsultar1 = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jButtonCancelar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 43, 135))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 43, 135));
        jLabel6.setText("Nombre");

        jTextNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombre1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombre1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 43, 135));
        jLabel7.setText("Tel??fono");

        jTextTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefono1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 43, 135));
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 43, 135));
        jLabel9.setText("Cedula o Rif");

        jTextRifProv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRifProv1ActionPerformed(evt);
            }
        });
        jTextRifProv1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRifProv1KeyTyped(evt);
            }
        });

        jNuevaBusqueda1.setForeground(new java.awt.Color(0, 43, 135));
        jNuevaBusqueda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jNuevaBusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevaBusqueda1ActionPerformed(evt);
            }
        });

        jNuevaBusqueda2.setForeground(new java.awt.Color(0, 43, 135));
        jNuevaBusqueda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        jNuevaBusqueda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevaBusqueda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextRifProv1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addComponent(jTextTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addComponent(jTextEmail1)
                    .addComponent(jTextNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNuevaBusqueda1)
                .addGap(18, 18, 18)
                .addComponent(jNuevaBusqueda2)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jNuevaBusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jNuevaBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRifProv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jButtonAgregar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgregar2.setForeground(new java.awt.Color(0, 43, 135));
        jButtonAgregar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        jButtonAgregar2.setText("Agregar");
        jButtonAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar2ActionPerformed(evt);
            }
        });

        jButtonModificar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonModificar1.setForeground(new java.awt.Color(0, 43, 135));
        jButtonModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave-con-sistema-de-ajuste-para-diferentes-tamanos-de-tuercas.png"))); // NOI18N
        jButtonModificar1.setText("Modificar");
        jButtonModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificar1ActionPerformed(evt);
            }
        });

        jButtonConsultar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonConsultar1.setForeground(new java.awt.Color(0, 43, 135));
        jButtonConsultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButtonConsultar1.setText("Consultar");
        jButtonConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultar1ActionPerformed(evt);
            }
        });

        jButtonEliminar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEliminar1.setForeground(new java.awt.Color(0, 43, 135));
        jButtonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButtonEliminar1.setText("Eliminar");
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar1ActionPerformed(evt);
            }
        });

        jButtonCancelar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(0, 43, 135));
        jButtonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jButtonCancelar1.setText("Cancelar");
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jButtonAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonModificar1)
                .addComponent(jButtonConsultar1)
                .addComponent(jButtonEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregar2))
        );

        jButtonCancelar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar3.setForeground(new java.awt.Color(0, 43, 135));
        jButtonCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButtonCancelar3.setText("Salir");
        jButtonCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombre1KeyReleased

    }//GEN-LAST:event_jTextNombre1KeyReleased

    private void jTextNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombre1KeyTyped

    }//GEN-LAST:event_jTextNombre1KeyTyped

    private void jTextTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefono1KeyTyped

    }//GEN-LAST:event_jTextTelefono1KeyTyped

    private void jTextRifProv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRifProv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRifProv1ActionPerformed

    private void jTextRifProv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRifProv1KeyTyped

    }//GEN-LAST:event_jTextRifProv1KeyTyped

    private void jNuevaBusqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevaBusqueda1ActionPerformed

    }//GEN-LAST:event_jNuevaBusqueda1ActionPerformed

    private void jNuevaBusqueda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevaBusqueda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNuevaBusqueda2ActionPerformed

    private void jButtonAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregar2ActionPerformed

    private void jButtonModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificar1ActionPerformed

    private void jButtonConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultar1ActionPerformed

    private void jButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminar1ActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jButtonCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar3ActionPerformed

 
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas_Datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas_Datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas_Datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas_Datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas_Datos_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar2;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonCancelar3;
    private javax.swing.JButton jButtonConsultar1;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonModificar1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jNuevaBusqueda1;
    private javax.swing.JButton jNuevaBusqueda2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextEmail1;
    private javax.swing.JTextField jTextNombre1;
    private javax.swing.JTextField jTextRifProv1;
    private javax.swing.JTextField jTextTelefono1;
    // End of variables declaration//GEN-END:variables
}
