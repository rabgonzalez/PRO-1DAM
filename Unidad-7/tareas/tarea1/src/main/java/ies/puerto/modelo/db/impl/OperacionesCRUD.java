package ies.puerto.modelo.db.impl;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import ies.puerto.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.db.abstractas.Conexion;
import ies.puerto.modelo.impl.Personaje;

public class OperacionesCRUD extends Conexion{
    public OperacionesCRUD() throws PersonajeExcepcion{
    }

    public Set<String> obtenerPoderes(int idPersonaje) throws PersonajeExcepcion{
        Set<String> poderes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery("SELECT p.poder FROM Poderes AS p INNER JOIN PersonajePoder AS pp ON p.id=pp.idPoder WHERE pp.idPersonaje="+idPersonaje+"");

            while(rs.next()){
                String nombre = rs.getString("poder");
                poderes.add(nombre);
            }
        } catch(Exception excepcion){
            throw new PersonajeExcepcion(excepcion.getMessage(), excepcion);
        } finally {
            try{
                if(statement != null && !statement.isClosed()){
                    statement.close();
                }
                if(rs != null && !rs.isClosed()){
                    rs.close();
                }
                if(!conexion().isClosed()){
                    conexion().close();
                }
            } catch(SQLException e){
                throw new PersonajeExcepcion(e.getMessage(), e);
            }
        }
        return poderes;
    }

    public Set<Personaje> obtener(String qry) throws PersonajeExcepcion{
        Set<Personaje> personajes = new HashSet<>();
        Set<String> poderes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String alias = rs.getString("alias");
                String genero = rs.getString("genero");
                poderes = obtenerPoderes(id);
                Personaje personaje = new Personaje(id, nombre, alias, genero, poderes);
                personajes.add(personaje);
            }
        } catch(SQLException excepcion){
            throw new PersonajeExcepcion(excepcion.getMessage(), excepcion);
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
        return personajes;
    }

    public void actualizar(String qry) throws PersonajeExcepcion{
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate(qry);
        } catch(Exception exception){
            throw new PersonajeExcepcion(exception.getMessage(), exception);
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

    public Set<Personaje> obtenerPersonajes() throws PersonajeExcepcion{
        String qry = "SELECT id, nombre, alias, genero FROM Personajes";
        return obtener(qry);
    }

    public Personaje obtenerPersonaje(Personaje personaje)throws PersonajeExcepcion{
        String qry = "SELECT id, nombre, alias, genero FROM Personajes WHERE id="+personaje.getId()+"";
        Set<Personaje> lista = obtener(qry);

        if(lista.isEmpty()){
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personaje personaje) throws PersonajeExcepcion{
        String qryPersonaje = "INSERT INTO Personajes (nombre, alias, genero) VALUES ('"+personaje.getNombre()+"', '"+personaje.getAlias()+"', '"+personaje.getGenero()+"')";
        actualizar(qryPersonaje);

        Set<String> poderes = personaje.getPoderes();
        String qryPoderes = "";

        for(String poder : poderes){
            if(!obtenerPersonaje(personaje).getPoderes().contains(poder)){
                qryPoderes = "INSERT INTO Poderes (poder) VALUES ('"+poder+"')";
            }
            String qryPersonajePoder = "INSERT INTO PersonajePoder VALUES ("+personaje.getId()+", "+poder+")";

            actualizar(qryPoderes);
            actualizar(qryPersonajePoder);
        }
    }

    public void eliminarPersonaje(Personaje personaje) throws PersonajeExcepcion{
        String qry = "DELETE FROM Personajes WHERE id="+personaje.getId()+"";
        actualizar(qry);

        Set<String> poderes = personaje.getPoderes();
        String qryPoderes = "";

        for(String poder : poderes){
            if(obtenerPersonaje(personaje).getPoderes().contains(poder)){
                qryPoderes = "DELETE FROM Poderes WHERE poder='"+poder+"')";
            }
            actualizar(qryPoderes);
        }

        String qryPersonajePoder = "DELETE FROM PersonajePoder WHERE idPersonaje="+personaje.getId()+"";
        actualizar(qryPersonajePoder);
    }

    public void actualizarPersonaje(Personaje personaje) throws PersonajeExcepcion{
        String qry = "UPDATE Personajes SET nombre='"+personaje.getNombre()+"', alias='"+personaje.getAlias()+"', genero='"+personaje.getGenero()+"' WHERE id="+personaje.getId()+"";
        actualizar(qry);

        Set<String> poderes = personaje.getPoderes();
        
        for(String poder : poderes){
            String qryPoderes = "UPDATE Poderes AS p INNER JOIN PersonajePoder AS pp ON p.id=pp.idPoder SET p.poder='"+poder+"'' WHERE pp.idPersonaje="+personaje.getId()+"";
            actualizar(qryPoderes);
        }
    }
}
