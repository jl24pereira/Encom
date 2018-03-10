package com.pereira.encomiendas.beans;

import com.pereira.encomiendas.model.Receptor;
import javax.persistence.EntityManager;

public class ReceptorFacade extends Facade<Receptor> {

    @Override
    protected EntityManager getEntityManager() {
        return SingletonPersistence.getSingleton().getEntityManager();
    }

    public ReceptorFacade() {
        super(Receptor.class);
    }

}
