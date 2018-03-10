package com.pereira.encomiendas.beans;

import com.pereira.encomiendas.model.Paquete;
import javax.persistence.EntityManager;

public class PaqueteFacade extends Facade<Paquete>{

    @Override
    protected EntityManager getEntityManager() {
        return SingletonPersistence.getSingleton().getEntityManager();
    }
    
    public PaqueteFacade() {
        super(Paquete.class);
    }

}
