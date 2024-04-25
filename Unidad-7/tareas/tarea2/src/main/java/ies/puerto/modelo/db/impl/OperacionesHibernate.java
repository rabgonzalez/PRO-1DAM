package ies.puerto.modelo.db.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import ies.puerto.modelo.db.abstractas.EntityManagerAbstract;
import ies.puerto.modelo.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.impl.Personajes;

public class OperacionesHibernate extends EntityManagerAbstract {

    public OperacionesHibernate(EntityManagerFactory emf){
        super(emf);
    }

    public void cerrar(){
        if(getEm() != null && getEm().isOpen()){
            getEm().close();
        }
    }

    public Set<Personajes> obtenerPersonajes(){
        List<Personajes> lista = getEm().createQuery("SELECT p FROM Personajes as p").getResultList();
        Set<Personajes> personajes = new HashSet<>();
        for(Personajes personajeObtenido : lista){
            personajes.add(personajeObtenido);
        }
        cerrar();
        return personajes;
    }

    public Personajes obtenerPersonaje(Personajes personaje){
        Personajes personajeEncontrado = getEm().find(Personajes.class, personaje.getId());
        cerrar();
        return personajeEncontrado;
    }

    public boolean actualizarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        try{
            getEm().getTransaction().begin();
            getEm().merge(personaje);
            getEm().getTransaction().commit();
            return true;
        } catch(Exception e){
            throw new PersonajeExcepcion(e.getMessage(), e);
        } finally{
            cerrar();
        }
    }

    public boolean insertarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        try{
            getEm().getTransaction().begin();
            getEm().persist(personaje);
            getEm().getTransaction().commit();
            return true;
        } catch(Exception e){
            throw new PersonajeExcepcion(e.getMessage(), e);
        } finally{
            cerrar();
        }
    }

    public boolean eliminarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        try{
            getEm().getTransaction().begin();
            getEm().remove(personaje);
            getEm().getTransaction().commit();
            return true;
        } catch(Exception e){
            throw new PersonajeExcepcion(e.getMessage(), e);
        } finally{
            cerrar();
        }
    }
}
