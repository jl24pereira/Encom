
package com.pereira.encomiendas.controller;

import com.pereira.encomiendas.beans.ReceptorFacade;
import com.pereira.encomiendas.model.Receptor;
import java.util.List;

public class ReceptorController {
    private static final ReceptorController CONTROLLER = new ReceptorController();
    private ReceptorFacade facade;
    private List<Receptor> items=null;
    private Receptor seleccionado=null;
    
    private ReceptorController(){
        facade = new ReceptorFacade();
    }
    
    public Receptor prepareCreate() {
        seleccionado = new Receptor();
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

    public ReceptorFacade getFacade() {
        return facade;
    }

    public void setFacade(ReceptorFacade facade) {
        this.facade = facade;
    }

    public List<Receptor> getItems() {
        setItems(getFacade().findAll());
        return items;
    }

    public void setItems(List<Receptor> items) {
        this.items = items;
    }

    public Receptor getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Receptor seleccionado) {
        this.seleccionado = seleccionado;
    }

    public static ReceptorController getCONTROLLER() {
        return CONTROLLER;
    }
}
