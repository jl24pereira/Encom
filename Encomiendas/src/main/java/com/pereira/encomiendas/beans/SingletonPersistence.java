package com.pereira.encomiendas.beans;

import com.pereira.encomiendas.main.Main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.config.PersistenceUnitProperties;

public class SingletonPersistence {

    private static final SingletonPersistence SINGLETON_PERSIST = new SingletonPersistence();
    private EntityManagerFactory emf;
    private EntityManager em;

    private SingletonPersistence() {
        Properties persistenceProperties = new Properties();
        try {
            persistenceProperties.load(new FileInputStream("propiedades\\persistence.properties"));
            Map props = new HashMap();
            props.put(PersistenceUnitProperties.JDBC_DRIVER, persistenceProperties.getProperty("driver"));
            props.put(PersistenceUnitProperties.JDBC_URL, persistenceProperties.getProperty("url"));
            props.put(PersistenceUnitProperties.JDBC_USER, persistenceProperties.getProperty("user"));
            props.put(PersistenceUnitProperties.JDBC_PASSWORD, persistenceProperties.getProperty("password"));
            emf = Persistence.createEntityManagerFactory("encom-pu", props);
            em = emf.createEntityManager();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SingletonPersistence getSingleton() {
        return SINGLETON_PERSIST;
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
