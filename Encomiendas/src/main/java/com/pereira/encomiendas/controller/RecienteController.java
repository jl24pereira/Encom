package com.pereira.encomiendas.controller;

import com.pereira.encomiendas.beans.EmisorFacade;
import com.pereira.encomiendas.beans.RecienteFacade;
import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.model.Receptor;
import com.pereira.encomiendas.model.Reciente;
import java.util.List;

public class RecienteController {

    private static final RecienteController CONTROLLER = new RecienteController();
    private RecienteFacade facade;
    private List<Reciente> items=null;
    private Reciente seleccionado=null;

    private RecienteController() {
        facade = new RecienteFacade();
    }

    public Reciente prepareCreate() {
        seleccionado = new Reciente();
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

    public RecienteFacade getFacade() {
        return facade;
    }

    public void setFacade(RecienteFacade facade) {
        this.facade = facade;
    }

    public List<Reciente> getItems() {
        setItems(getFacade().findAll());
        return items;
    }

    public void setItems(List<Reciente> items) {
        this.items = items;
    }

    public Reciente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Reciente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    public List<Reciente> getByEmisor(Emisor emisor){
        return this.getFacade().verPorEmisor(emisor);
    }
    
    public boolean isReciente(Emisor emisor, Receptor receptor){
        return this.getFacade().nuevoReciente(emisor, receptor) != null;
    }

    public static RecienteController getCONTROLLER() {
        return CONTROLLER;
    }       

}
