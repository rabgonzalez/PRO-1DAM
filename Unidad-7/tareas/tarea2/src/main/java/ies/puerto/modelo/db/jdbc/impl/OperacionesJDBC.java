package ies.puerto.modelo.db.jdbc.impl;


import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import ies.puerto.modelo.db.jdbc.conexion.Conexion;
import ies.puerto.modelo.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.impl.Personajes;

public class OperacionesJDBC extends Conexion {

    public OperacionesJDBC() throws PersonajeExcepcion {
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
                Personajes personaje = new Personajes(id, nombre, genero, null, null);
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
        String qry = "SELECT p.id, p.nombre, p.genero FROM Personajes AS p";
        return obtenerPersonajes(qry);
    }

    public Personajes obtenerPersonaje(Personajes personaje) throws PersonajeExcepcion{
        String qry = "SELECT id, nombre, genero FROM Personajes WHERE id="+personaje.getId()+"";
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
