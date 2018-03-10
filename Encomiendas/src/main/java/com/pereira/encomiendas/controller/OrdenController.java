package com.pereira.encomiendas.controller;

import com.pereira.encomiendas.beans.EmisorFacade;
import com.pereira.encomiendas.beans.OrdenFacade;
import com.pereira.encomiendas.main.Main;
import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.model.Orden;
import com.pereira.encomiendas.model.Salida;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

public class OrdenController {

    private static final OrdenController CONTROLLER = new OrdenController();
    private OrdenFacade facade;
    private List<Orden> items = null;
    private Orden seleccionado = null;

    private OrdenController() {
        facade = new OrdenFacade();
    }

    public Orden prepareCreate() {
        seleccionado = new Orden();
        return seleccionado;
    }

    public void create() {
        persist(PersistAction.CREATE);
    }

    public void update() {
        persist(PersistAction.UPDATE);
    }

    public void delete() {
        persist(PersistAction.DELETE);
    }

    public void persist(PersistAction persistAction) {
        if (getSeleccionado() != null) {
            switch (persistAction) {
                case CREATE:
                    seleccionado.setNorden(generarNumero(seleccionado.getSalida()));
                    getFacade().create(seleccionado);
                    break;
                case UPDATE:
                    getFacade().edit(seleccionado);
                    break;
                case DELETE:
                    getFacade().remove(seleccionado);
                    break;
            }
        }
        //seleccionado=null;
    }

    public Integer generarNumero(Salida salida) {
        int numero = 1;
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("propiedades\\propiedades.properties"));
            int contador = Integer.parseInt(properties.getProperty("contador"));
            if (getFacade().obtenerUltima(salida) == null) {
                numero = numero + contador;
            } else {
                int ultima = getFacade().obtenerUltima(salida).getNorden();
                if (contador > 0) {
                    numero=ultima+numero;
                } else {
                    numero = ultima+contador+numero;
                }                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;
    }

    public static enum PersistAction {
        CREATE,
        DELETE,
        UPDATE
    }

    public OrdenFacade getFacade() {
        return facade;
    }

    public void setFacade(OrdenFacade facade) {
        this.facade = facade;
    }

    public List<Orden> getItems() {
        setItems(getFacade().findAll());
        return items;
    }

    public void setItems(List<Orden> items) {
        this.items = items;
    }

    public Orden getSeleccionado() {
        return seleccionado;
    }
    
    public List<Orden> getOrdenPorViaje(Salida salida){
        return getFacade().obtenerPorViaje(salida);
    }

    public void setSeleccionado(Orden seleccionado) {
        this.seleccionado = seleccionado;
    }

    public static OrdenController getCONTROLLER() {
        return CONTROLLER;
    }

    public void printOrden() throws JRException, IOException {
        System.out.println(seleccionado.getEmisor().getNombres() + " " + seleccionado.getEmisor().getApellidos());
        String filename = "nombres.pdf";
        String jasperPath = "/resources/reports/ordenReport.jasper";
        Map<String, Object> params = new HashMap();
        params.put("emisor", seleccionado.getEmisor().getNombres() + " " + seleccionado.getEmisor().getApellidos());
        params.put("direccionEmisor", seleccionado.getEmisor().getDireccion());
        params.put("ciudadEmisor", seleccionado.getEmisor().getMunicipio());
        params.put("telefonoEmisor", seleccionado.getEmisor().getTelefono());
        params.put("numOrden", seleccionado.getNorden());
        params.put("fRecibido", seleccionado.getFrecibido());
        params.put("receptor", seleccionado.getReceptor().getNombres() + " " + seleccionado.getReceptor().getApellidos());
        params.put("direccionReceptor", seleccionado.getReceptor().getDireccion());
        params.put("ciudadReceptor", seleccionado.getReceptor().getCiudad());
        params.put("telefonoReceptor", seleccionado.getReceptor().getTelefono());
        params.put("zipcodeReceptor", seleccionado.getReceptor().getEstado()+" "+seleccionado.getReceptor().getZipcode());
        params.put("numPaquetes", seleccionado.getPaqueteList().size());
        params.put("peso", seleccionado.getPeso());
        params.put("total", seleccionado.getCosto());
        print(params, jasperPath, seleccionado.getPaqueteList(), filename);
    }

    public void print(Map<String, Object> params, String jasperPath, List<?> dataSource, String fileName) throws JRException {
        System.out.println("intentado impresion....");
        JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("reportes\\ordenReport.jasper");
        JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(dataSource, false);
        JasperPrint print = JasperFillManager.fillReport(reporte, params, source);
        JasperPrintManager.printReport(print, false);
    }

}
