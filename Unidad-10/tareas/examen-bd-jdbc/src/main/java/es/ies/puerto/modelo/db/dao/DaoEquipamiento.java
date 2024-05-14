package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.config.Conexion;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoEquipamiento extends Conexion {

    public DaoEquipamiento() throws MarvelException {

    }

    public void cerrar(ResultSet rs, Statement statement) throws MarvelException {
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
            throw new MarvelException(e.getMessage(), e);
        }
    }

    public Set<Equipamiento> findAllEquipamiento() throws MarvelException {
        Set<Equipamiento> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery("SELECT id, nombre, descripcion, personaje_id FROM Equipamiento");
            while(rs.next()){
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String personaje_id = rs.getString("personaje_id");
                Equipamiento equipamiento = new Equipamiento(id, nombre, descripcion, personaje_id);
                lista.add(equipamiento);
            }
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar(rs, statement);
        }
        return lista;
    }

    public Equipamiento findEquipamiento(Equipamiento Equipamiento) throws MarvelException {
            Equipamiento resultado = null;
            ResultSet rs = null;
            Statement statement = null;

            try {
                statement = conexion().createStatement();
                rs = statement.executeQuery("SELECT id, nombre, descripcion, personaje_id FROM Equipamiento WHERE id='"+Equipamiento.getId()+"'");

                while(rs.next()){
                    String id = rs.getString("id");
                    String nombre = rs.getString("nombre");
                    String descripcion = rs.getString("descripcion");
                    String personaje_id = rs.getString("personaje_id");
                    resultado = new Equipamiento(id, nombre, descripcion, personaje_id);
                }
            } catch(SQLException e){
                throw new MarvelException(e.getMessage(), e);
            } finally{
                cerrar(rs, statement);
            }
            return resultado;
    }

    public boolean updateEquipamiento(Equipamiento Equipamiento) throws MarvelException {
        Statement statement = null;

        if (findEquipamiento(Equipamiento) == null ) {
            insertEquipamiento(Equipamiento);
        }
        
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("UPDATE Equipamiento SET nombre='"+Equipamiento.getNombre()+"', descripcion='"+Equipamiento.getDescripcion()+"' WHERE id='"+Equipamiento.getId()+"'");
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
        return true;
    }

    public void deleteEquipamiento(Equipamiento Equipamiento) throws MarvelException {
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("DELETE FROM Equipamiento WHERE id='"+Equipamiento.getId()+"'");
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }

    public boolean insertEquipamiento(Equipamiento equipamiento) throws MarvelException{
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("INSERT INTO Equipamiento (id, nombre, descripcion, personaje_id) VALUES ('"+equipamiento.getId()+"', '"+equipamiento.getNombre()+"', '"+equipamiento.getDescripcion()+"', '"+equipamiento.getPersonaje_id()+"')");
            return true;
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }
}
