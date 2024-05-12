package es.ies.puerto.modelo.db.abstractas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class EntityManagerAbstract {
    EntityManager em;
    EntityManagerFactory emf;

    public EntityManagerAbstract(EntityManagerFactory emf){
        this.emf = emf;
    }

    public EntityManager getEm(){
        if(em == null || !em.isOpen()){
            em = emf.createEntityManager();
        }
        return em;
    }

    public void cerrar(){
        if(getEm() != null && getEm().isOpen()){
            getEm().close();
        }
    }
}
