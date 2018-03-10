package com.pereira.encomiendas.beans;

import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Jose Luis
 * @param <T>
 */
public abstract class Facade<T> {

    private Class<T> entityClass;

    public Facade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().persist(entity);
            getEntityManager().getTransaction().commit();
            JOptionPane.showMessageDialog(new JFrame(),
                    "Registro realizado exitosamente!",
                    "ENCOM",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(new JFrame(),
                    "Ha ocurrido un error inesperado...",
                    "ENCOM",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void edit(T entity) {
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().merge(entity);
            getEntityManager().getTransaction().commit();
            JOptionPane.showMessageDialog(new JFrame(),
                    "Registro realizado exitosamente!",
                    "ENCOM",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(new JFrame(),
                    "Ha ocurrido un error inesperado...",
                    "ENCOM",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void remove(T entity) {
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().remove(getEntityManager().merge(entity));
            getEntityManager().getTransaction().commit();
            JOptionPane.showMessageDialog(new JFrame(),
                    "Registro eliminado exitosamente!",
                    "ENCOM",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(new JFrame(),
                    "Ha ocurrido un error inesperado...",
                    "ENCOM",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
}
