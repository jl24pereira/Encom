package com.pereira.encomiendas.controller;

import com.pereira.encomiendas.beans.EmisorFacade;
import com.pereira.encomiendas.beans.SalidaFacade;
import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.model.Salida;
import java.util.List;

public class SalidaController {

    private static final SalidaController CONTROLLER = new SalidaController();
    private SalidaFacade facade;
    private List<Salida> items=null;
    private Salida seleccionado=null;

    private SalidaController() {
        facade = new SalidaFacade();
    }

    public Salida prepareCreate() {
        seleccionado = new Salida();
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
        seleccionado=null;
    }

    public static enum PersistAction {
        CREATE,
        DELETE,
        UPDATE
    }

    public SalidaFacade getFacade() {
        return facade;
    }

    public void setFacade(SalidaFacade facade) {
        this.facade = facade;
    }

    public List<Salida> getItems() {
        return getFacade().findAll();
    }

    public void setItems(List<Salida> items) {
        this.items = items;
    }

    public Salida getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Salida seleccionado) {
        this.seleccionado = seleccionado;
    }

    public static SalidaController getCONTROLLER() {
        return CONTROLLER;
    }    
    
    public List<Salida> getRecientes(){
        return getFacade().getRecientes();
    }
    
    public void test(Salida salida){
        this.getFacade().test(seleccionado);
    }
    
    public void reporteEntregas(Salida salida){
        this.getFacade().reporteEntrega(seleccionado);
    }
}
