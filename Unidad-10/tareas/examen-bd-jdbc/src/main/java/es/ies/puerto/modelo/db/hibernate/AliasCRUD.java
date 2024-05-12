package es.ies.puerto.modelo.db.hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.abstractas.EntityManagerAbstract;
import es.ies.puerto.modelo.db.entidades.Alias;

public class AliasCRUD extends EntityManagerAbstract {

    public AliasCRUD(EntityManagerFactory emf){
        super(emf);
    }
    
    public Set<Alias> obtenerAllAlias(){
        List<Alias> lista = getEm().createQuery("SELECT a FROM Alias as a").getResultList();
        Set<Alias> resultado = new HashSet<>();
        for(Alias alias : lista){
            resultado.add(alias);
        }
        cerrar();
        return resultado;
    }

    public Alias obtenerAlias(Alias alias){
        Alias aliasEncontrado = getEm().find(Alias.class, alias.getId());
        cerrar();
        return aliasEncontrado;
    }

    public boolean actualizarAlias(Alias alias) throws MarvelException{
        try{
            getEm().getTransaction().begin();
            getEm().merge(alias);
            getEm().getTransaction().commit();
            return true;
        } catch(Exception e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar();
        }
    }

    public boolean insertarAlias(Alias alias) throws MarvelException{
        try{
            getEm().getTransaction().begin();
            getEm().persist(alias);
            getEm().getTransaction().commit();
            return true;
        } catch(Exception e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar();
        }
    }

    public boolean eliminarAlias(Alias alias) throws MarvelException{
        try{
            getEm().getTransaction().begin();
            getEm().remove(getEm().contains(alias) ? alias : getEm().merge(alias));
            getEm().getTransaction().commit();
            return true;
        } catch(Exception e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar();
        }
    }
}
