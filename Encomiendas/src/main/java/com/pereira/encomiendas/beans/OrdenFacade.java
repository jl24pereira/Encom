package com.pereira.encomiendas.beans;

import com.pereira.encomiendas.model.Orden;
import com.pereira.encomiendas.model.Reciente;
import com.pereira.encomiendas.model.Salida;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class OrdenFacade extends Facade<Orden> {

    @Override
    protected EntityManager getEntityManager() {
        return SingletonPersistence.getSingleton().getEntityManager();
    }

    public OrdenFacade() {
        super(Orden.class);
    }

    public Orden obtenerUltima(Salida salida) {
        try {
            Orden orden = getEntityManager().createQuery("SELECT o FROM Orden o WHERE o.salida = :salida ORDER BY o.idorden DESC", Orden.class)
                    .setParameter("salida", salida)
                    .setMaxResults(1)
                    .getSingleResult();
            return orden;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Orden> obtenerPorViaje(Salida salida){
        TypedQuery<Orden> query = this.getEntityManager().createNamedQuery("Orden.findBySalida", Orden.class);
        query.setParameter("salida", salida);
        return query.getResultList();
    }

}
