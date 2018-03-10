package com.pereira.encomiendas.beans;

import com.pereira.encomiendas.model.Emisor;
import javax.persistence.EntityManager;

public class EmisorFacade extends Facade<Emisor> {

    @Override
    protected EntityManager getEntityManager() {
        return SingletonPersistence.getSingleton().getEntityManager();
    }

    public EmisorFacade() {
        super(Emisor.class);
    }

}
