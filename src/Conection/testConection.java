/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Administrador
 */
public class testConection extends javax.swing.JFrame {
    
    public ConexionBBDD con;

    /**
     * Creates new form testConection
     */
    public testConection() {
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

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("probar conexion");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String bd = "bdsagaidi";
            String user = "postgres";
            String password = "abcd";
            String url = "jdbc:postgresql://localhost:5432/"+bd;
            java.sql.Connection connection = null;
            ResultSet resultSet = null;
            Statement statement = null;
            java.sql.Connection conn = null;
            
            String SQL_INSERT="INSERT INTO bdsagaidi.\"Proveedor\"(rif, nombre, telefono, email) values(?,?,?,?) "; 
           
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
        
            Statement stmt= null; 
            stmt=conn.createStatement(); 
        
        
            //String sql="insert into proveedor(RIF_prov,Nombre_prov,Direcion_prov,Email_prov,Telefono_prov, website_prov)"
                  // +"VALUES('RIF_prov','Nombre_prov','Direcion_prov','Email_prov','Telefono_prov', 'website_prov');";  
           
                  //PreparedStatement pstm = conn.prepareStatement("insert into " + 
                    //"bdsagaidi.\"Proveedor\"(rif, nombre, telefono, email) " +
                    //" values(?,?,?,?)");  
                  
                    PreparedStatement pstm = conn.prepareStatement(SQL_INSERT); 
                    
                    
                  String rif="a"; 
                  String nombre="a"; 
                  String telefono="a"; 
                  String email="a"; 
                  String direccion="a"; 
                  
            pstm.setString(1, rif);
            pstm.setString(2, nombre);
            pstm.setString(3, telefono);
            pstm.setString(4, email);    
            //pstm.setString(5, direccion);   
            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(testConection.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        System.out.println("TODO BIEN");
     


        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(testConection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testConection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testConection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testConection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testConection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
