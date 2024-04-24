package ies.puerto.modelo.db.impl;


import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import ies.puerto.modelo.db.conexion.Conexion;
import ies.puerto.modelo.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.impl.Alias;
import ies.puerto.modelo.impl.Personajes;
import ies.puerto.modelo.impl.Poderes;

public class OperacionesJDBC extends Conexion {

    public OperacionesJDBC() throws PersonajeExcepcion {
    }

    private void cerrar(ResultSet rs, Statement statement) throws PersonajeExcepcion {
        try{
            if(rs != null && !rs.isClosed()){
                rs.close();
            }
            if(statement != null && !statement.isClosed()){
                statement.close();
            }
            if(!conexion().isClosed()){
                conexion().close();
            }
        } catch(SQLException e){
            throw new PersonajeExcepcion(e.getMessage(), e);
        }
    }

    public Set<Poderes> qryPoderes(String qry) throws PersonajeExcepcion{
        Set<Poderes> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                Integer id = rs.getInt("id");
                String nombre = rs.getString("poder");
                Poderes poder = new Poderes(id, nombre);
                lista.add(poder);
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
            cerrar(rs, statement);
        }
        return lista;
    }

    public Set<Alias> qryAlias(String qry) throws PersonajeExcepcion{
        Set<Alias> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                Integer id = rs.getInt("id");
                Integer personajeId = rs.getInt("personaje_id");
                String nombre = rs.getString("alias");
                Alias alias = new Alias(id, personajeId, nombre);
                lista.add(alias);
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
            cerrar(rs, statement);
        }
        return lista;
    }

    public Set<Personajes> qryPersonaje(String qry) throws PersonajeExcepcion{
        Set<Personajes> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");
                Personajes personaje = new Personajes(id, nombre, genero);
                lista.add(personaje);
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
            cerrar(rs, statement);
        }
        return lista;
    }

    public Integer qryId(String qry) throws PersonajeExcepcion{
        Integer id = 0;
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                id = rs.getInt("id");
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
            cerrar(rs, statement);
        }
        return id;
    }

    public String qryPoderes(){
        return "SELECT p.id, p.poder FROM Poderes AS p INNER JOIN Personajes_Poderes AS pp ON p.id=pp.poder_id INNER JOIN Personajes AS pe ON pe.id=pp.personaje_id";
    }

    public String qryAlias(){
        return "SELECT a.id, a.personaje_id, a.alias FROM Alias AS a INNER JOIN Personajes AS p ON a.personaje_id=p.id";
    }

    public Set<Personajes> qryPersonajes(String qry) throws PersonajeExcepcion{
        Set<Personajes> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");
                Personajes personaje = new Personajes(id, nombre, genero, qryPoderes(qryPoderes()+" WHERE pe.id="+id+""), qryAlias(qryAlias()+" WHERE p.id="+id+"").iterator().next());
                lista.add(personaje);
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
            cerrar(rs, statement);
        }
        return lista;
    }

    public void actualizar(String qry) throws PersonajeExcepcion{
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            statement.executeUpdate(qry);
        } catch(SQLException e){
            throw new PersonajeExcepcion(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }

    public Set<Personajes> obtenerPersonajes() throws PersonajeExcepcion{
        String qry = "SELECT p.id, p.nombre, p.genero FROM Personajes AS p";
        return qryPersonajes(qry);
    }

    public Personajes obtenerPersonaje(Personajes personaje) throws PersonajeExcepcion{
        String qry = "SELECT p.id, p.nombre, p.genero FROM Personajes AS p WHERE p.nombre='"+personaje.getNombre()+"'";
        Set<Personajes> resultado = qryPersonajes(qry);
        return resultado.iterator().next();
    }

    public Integer obtenerIdPersonaje(Personajes personaje) throws PersonajeExcepcion{
        return qryId("SELECT id FROM Personajes WHERE nombre='"+personaje.getNombre()+"'");
    }

    public Integer obtenerIdPoder(Poderes poder) throws PersonajeExcepcion{
        return  qryId("SELECT id FROM Poderes WHERE poder='"+poder.getPoder()+"'");
    }

    public void insertarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        if(obtenerPersonajes().contains(personaje)){
            return;
        }

        String qryPersonaje = "INSERT INTO Personajes (nombre, genero) VALUES ('"+personaje.getNombre()+"', '"+personaje.getGenero()+"')";
        actualizar(qryPersonaje);

        String qryAlias = "INSERT INTO Alias (personaje_id, alias) VALUES ("+obtenerIdPersonaje(personaje)+", '"+personaje.getAlias().getAlias()+"')";
        actualizar(qryAlias);

        Set<Poderes> poderes = qryPoderes(qryPoderes());
        Set<Poderes> PersonajePoderes = personaje.getPoderes();


        for(Poderes poder : PersonajePoderes){
            if(!poderes.contains(poder)){
                String qryPoder = "INSERT INTO Poderes (poder) VALUES ('"+poder.getPoder()+"')";
                actualizar(qryPoder);

                String qryPersonajePoder = "INSERT INTO Personajes_Poderes VALUES ("+obtenerIdPersonaje(personaje)+", "+obtenerIdPoder(poder)+")";
                actualizar(qryPersonajePoder);
            }
        }
    }

    public void actualizarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        personaje.setId(obtenerIdPersonaje(personaje));
        String qry = "UPDATE Personajes SET nombre='"+personaje.getNombre()+"', genero='"+personaje.getGenero()+"' WHERE id="+personaje.getId()+"";
        actualizar(qry);

        String qryAlias = "UPDATE Alias SET alias='"+personaje.getAlias().getAlias()+"' WHERE personaje_id="+obtenerIdPersonaje(personaje)+"";
        actualizar(qryAlias);

        Set<Poderes> poderes = qryPoderes(qryPoderes());
        Set<Poderes> personajePoderes = personaje.getPoderes();

        for(Poderes poder : personajePoderes){
            if(poderes.contains(poder)){
                String qryPoder = "UPDATE Poderes SET poder='"+poder.getPoder()+"' WHERE personaje_id="+obtenerIdPersonaje(personaje)+""; 
                actualizar(qryPoder);
            }
        }
    }

    public void eliminarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        if(!obtenerPersonajes().contains(personaje)){
            return;
        }

        String qryPersonaje = "DELETE FROM Personajes WHERE id="+obtenerIdPersonaje(personaje)+"";
        actualizar(qryPersonaje);

        String qryAlias = "DELETE FROM Alias WHERE id="+personaje.getAlias().getId()+"";
        actualizar(qryAlias);

        String qryPersonajePoder = "DELETE FROM Personajes_Poderes WHERE personaje_id="+obtenerIdPersonaje(personaje)+"";
        actualizar(qryPersonajePoder);
    }
}