/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra.Controladores.UsesCases;

import Conection.ConexionBBDD;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    
public class ReportesProveedor {
   
    
    public ConexionBBDD conexion = new  ConexionBBDD();
 
    
    
    public void reportes_un_parametro( String NombreReporte, String DatoConsulta, String CampoTabla)
            throws JRException, ClassNotFoundException{
     
        
        Map parametro = new HashMap();
        
        
        parametro.put(CampoTabla, DatoConsulta);
        String rutaReporte=System.getProperty("user.dir")+"/src/Reportes/"+NombreReporte;
           
        JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile(rutaReporte);
        JasperPrint print = null;
       
        
        try {
            
        print = JasperFillManager.fillReport(jasperReport,parametro, conexion.CrearConexion() );
        JasperViewer view = new JasperViewer(print,false);
        view.setVisible(true);
    
        } catch (SQLException ex) {
            Logger.getLogger(ReportesProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
    }
    
    
  
    public void reportes_dos_parametro(String NombreReporte, String DatoConsulta1, String DatoConsulta2, String CampoTabla) 
            throws ClassNotFoundException, JRException {
     
        
        Map parametro = new HashMap();
        
        
        parametro.put(CampoTabla, DatoConsulta1);
        parametro.put(CampoTabla, DatoConsulta2 ); 
        
        String rutaReporte=System.getProperty("user.dir")+"/src/Reportes/"+NombreReporte;
        JasperReport jasperReport = null;
        try {
            
        jasperReport = (JasperReport)JRLoader.loadObjectFromFile(rutaReporte);
        JasperPrint print = null;
       
        
        print = JasperFillManager.fillReport(jasperReport,parametro, conexion.CrearConexion() );
        JasperViewer view = new JasperViewer(print,false);
        view.setVisible(true);
      
        } catch (SQLException ex) {
            Logger.getLogger(ReportesProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
    }
    
    
    
     public void reportes_tres_parametro(String NombreReporte, String DatoConsulta1, String DatoConsulta2,String DatoConsulta3,  String CampoTabla) 
            throws ClassNotFoundException, JRException {
     
        
        Map parametro = new HashMap();
        
        
        parametro.put(CampoTabla, DatoConsulta1);
        parametro.put(CampoTabla, DatoConsulta2 ); 
        parametro.put(CampoTabla, DatoConsulta3 );
        
        String rutaReporte=System.getProperty("user.dir")+"/src/Reportes/"+NombreReporte;
        JasperReport jasperReport = null;
        try {
            
        jasperReport = (JasperReport)JRLoader.loadObjectFromFile(rutaReporte);
        JasperPrint print = null;
       
        
        print = JasperFillManager.fillReport(jasperReport,parametro, conexion.CrearConexion() );
        JasperViewer view = new JasperViewer(print,false);
        view.setVisible(true);
      
        } catch (SQLException ex) {
            Logger.getLogger(ReportesProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
    }
    
    
    
}
