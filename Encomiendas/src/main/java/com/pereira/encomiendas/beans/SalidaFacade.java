package com.pereira.encomiendas.beans;

import com.pereira.encomiendas.model.Salida;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class SalidaFacade extends Facade<Salida> {

    @Override
    protected EntityManager getEntityManager() {
        return SingletonPersistence.getSingleton().getEntityManager();
    }

    public SalidaFacade() {
        super(Salida.class);
    }

    public List<Salida> getRecientes() {
        return this.getEntityManager().createNamedQuery("Salida.findReciente", Salida.class)
                .setParameter("fecha", new Date()).getResultList();
    }

    public void test(Salida salida) {
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("reportes\\ingresos.jasper");
            Map valores = new HashMap();
            valores.put("salida", salida.getIdsalida());
            valores.put("fecha", new SimpleDateFormat("dd/MM/yyyy").format(salida.getFecha()));
            valores.put("destino", salida.getDestino());
            this.getEntityManager().getTransaction().begin();
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, valores, this.getEntityManager().unwrap(java.sql.Connection.class));
            this.getEntityManager().getTransaction().commit();
            //JasperPrintManager.printReport(jasperPrint, false);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setTitle("Reporte de Costos");
            //viewer.setDefaultCloseOperation();
            viewer.setSize(800, 600);
            viewer.setLocationRelativeTo(null);
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(SalidaFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void reporteEntrega(Salida salida){
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("reportes\\lista_clientes.jasper");
            Map valores = new HashMap();
            valores.put("salida", salida.getIdsalida());
            valores.put("fecha", new SimpleDateFormat("dd/MM/yyyy").format(salida.getFecha()));
            valores.put("destino", salida.getDestino());
            this.getEntityManager().getTransaction().begin();
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, valores, this.getEntityManager().unwrap(java.sql.Connection.class));
            this.getEntityManager().getTransaction().commit();
            //JasperPrintManager.printReport(jasperPrint, false);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setTitle("Reporte de Costos");
            //viewer.setDefaultCloseOperation();
            viewer.setSize(800, 600);
            viewer.setLocationRelativeTo(null);
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(SalidaFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
