package com.pereira.encomiendas.controller;

import com.pereira.encomiendas.beans.EmisorFacade;
import com.pereira.encomiendas.model.Emisor;
import java.util.List;

public class EmisorController {

    private static final EmisorController CONTROLLER = new EmisorController();
    private EmisorFacade facade;
    private List<Emisor> items=null;
    private Emisor seleccionado=null;

    private EmisorController() {
        facade = new EmisorFacade();
    }

    public Emisor prepareCreate() {
        seleccionado = new Emisor();
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

    public EmisorFacade getFacade() {
        return facade;
    }

    public void setFacade(EmisorFacade facade) {
        this.facade = facade;
    }

    public List<Emisor> getItems() {
        setItems(getFacade().findAll());
        return items;
    }

    public void setItems(List<Emisor> items) {
        this.items = items;
    }

    public Emisor getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Emisor seleccionado) {
        this.seleccionado = seleccionado;
    }

    public static EmisorController getCONTROLLER() {
        return CONTROLLER;
    }    

}
