package com.pereira.encomiendas.beans;

import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.model.Receptor;
import com.pereira.encomiendas.model.Reciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class RecienteFacade extends Facade<Reciente> {

    @Override
    protected EntityManager getEntityManager() {
        return SingletonPersistence.getSingleton().getEntityManager();
    }

    public RecienteFacade() {
        super(Reciente.class);
    }
    
    public List<Reciente> verPorEmisor(Emisor emisor) {
        TypedQuery<Reciente> query = this.getEntityManager().createNamedQuery("Reciente.findByEmisor", Reciente.class);
        query.setParameter("idemisor", emisor.getIdemisor());
        return query.getResultList();
    }
    
    public Reciente nuevoReciente(Emisor emisor, Receptor receptor){
        try {
            Reciente reciente = getEntityManager().createQuery("SELECT o FROM Reciente o WHERE o.emisor = :emisor and o.receptor=:receptor ORDER BY o.idreciente DESC", Reciente.class)
                    .setParameter("emisor", emisor)
                    .setParameter("receptor", receptor)
                    .setMaxResults(1)
                    .getSingleResult();
            return reciente;
        } catch (Exception e) {
            return null;
        }
    }

}
