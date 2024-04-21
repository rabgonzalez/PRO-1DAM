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

    public String qryPersonajes(){
        return "SELECT p.id, p.nombre, p.genero FROM Personajes AS p INNER JOIN Personajes_Poderes AS pp ON p.id=pp.personaje_id INNER JOIN Poderes AS po ON po.id=pp.poder_id";
    }

    public Set<Poderes> obtenerPoderes(String qry) throws PersonajeExcepcion{
        Set<Poderes> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                Integer id = rs.getInt("id");
                String nombre = rs.getString("poder");
                Poderes poder = new Poderes(id, nombre, null);
                lista.add(poder);
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
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
        return lista;
    }

    public Set<Alias> obtenerAlias(String qry) throws PersonajeExcepcion{
        Set<Alias> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                Integer id = rs.getInt("id");
                Integer personaje_id = rs.getInt("personaje_id");
                String nombre = rs.getString("alias");
                Alias alias = new Alias(id, personaje_id, nombre);
                lista.add(alias);
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
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
        return lista;
    }

    public String qryPoderes(){
        return "SELECT p.id, p.poder FROM Poderes AS p INNER JOIN Personajes_Poderes AS pp ON p.id=pp.poder_id INNER JOIN Personajes AS pe ON pe.id=pp.personaje_id";
    }

    public String qryAlias(){
        return "SELECT a.id, a.personaje_id, a.alias FROM Alias AS a INNER JOIN Personajes AS p ON a.personaje_id=p.id";
    }

    public Set<Personajes> obtenerPersonajes(String qry) throws PersonajeExcepcion{
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
                Personajes personaje = new Personajes(id, nombre, genero, obtenerPoderes(qryPoderes()+" WHERE pe.id="+id+""), obtenerAlias(qryAlias()+" WHERE p.id="+id+"").iterator().next());
                lista.add(personaje);
            }
        } catch(SQLException exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
        } finally {
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
            try{
                if(statement !=null && !statement.isClosed()){
                    statement.close();
                }
                if(!conexion().isClosed()){
                    conexion().close();
                }
            } catch(SQLException e){
                throw new PersonajeExcepcion(e.getMessage(), e);
            }
        }
    }

    public Set<Personajes> obtenerTodosPersonajes() throws PersonajeExcepcion{
        String qry = "SELECT p.id, p.nombre, p.genero, po.poder, a.alias FROM Personajes AS p"
                    +" INNER JOIN Personajes_Poderes AS pp ON p.id=pp.personaje_id"
                    +" INNER JOIN Poderes AS po ON pp.poder_id=po.id"
                    +" INNER JOIN Alias AS a ON p.personaje_id=a.personaje_id";
        return obtenerPersonajes(qry);
    }

    public Personajes obtenerPersonaje(Personajes personaje) throws PersonajeExcepcion{
        String qry = "SELECT p.id, p.nombre, p.genero, po.poder, a.alias FROM Personajes AS p"
                    +" INNER JOIN Personajes_Poderes AS pp ON p.id=pp.personaje_id"
                    +" INNER JOIN Poderes AS po ON pp.poder_id=po.id"
                    +" INNER JOIN Alias AS a ON p.id=a.personaje_id"
                    +" WHERE p.id="+personaje.getId()+"";
        Set<Personajes> resultado = obtenerPersonajes(qry);
        return resultado.iterator().next();
    }

    public void insertarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        String qry = "INSERT INTO Personajes (nombre, genero) VALUES ('"+personaje.getNombre()+"', '"+personaje.getGenero()+"')";
        actualizar(qry);
    }

    public void actualizarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        String qry = "UPDATE Personajes SET nombre='"+personaje.getNombre()+"', genero='"+personaje.getGenero()+"' WHERE id="+personaje.getId()+"";
        actualizar(qry);
    }

    public void eliminarPersonaje(Personajes personaje) throws PersonajeExcepcion{
        String qry = "DELETE FROM Personajes WHERE id="+personaje.getId()+"";
        actualizar(qry);
    }
}