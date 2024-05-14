package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.config.Conexion;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoPersonaje extends Conexion {

    public DaoPersonaje() throws MarvelException {

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

    public String qryEquipamiento(){
        return "SELECT id, nombre, descripcion, personaje_id FROM Equipamiento";
    }

    public Set<Equipamiento> findEquipamientos(String qry) throws MarvelException {
        Set<Equipamiento> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);
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

    public String qryPoder(){
        return "SELECT po.id, po.nombre FROM Poder AS po INNER JOIN Personaje_Poder AS pp ON po.id=pp.poder_id";
    }

    public Set<Poder> findPoderes(String qry) throws MarvelException{
        Set<Poder> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);
            while(rs.next()){
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                Poder poder = new Poder(id, nombre);
                lista.add(poder);
            }
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar(rs, statement);
        }
        return lista;
    }

    public String qryAlias(){
        return "SELECT id, personaje_id, alias FROM Alias";
    }

    public Alias findAlias(String qry) throws MarvelException {
        Alias resultado = new Alias();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);
            String id = rs.getString("id");
            String personaje_id = rs.getString("personaje_id");
            String descripcion = rs.getString("alias");
            resultado.setId(id);
            resultado.setDescripcion(descripcion);
            resultado.setPersonaje_id(personaje_id);
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar(rs, statement);
        }
        return resultado;
    }

    public Set<Personaje> findAllPersonaje() throws MarvelException {
        Set<Personaje> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery("SELECT id, nombre, genero FROM Personaje");
            while(rs.next()){
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");
                Personaje personaje = new Personaje(id, nombre, genero, findAlias(qryAlias()), findEquipamientos(qryEquipamiento()+" WHERE personaje_id='"+id+"'"), findPoderes(qryPoder()+" WHERE pp.personaje_id='"+id+"'"));
                lista.add(personaje);
            }
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar(rs, statement);
        }
        return lista;
    }

    public Personaje findPersonaje(Personaje Personaje) throws MarvelException {
        Personaje resultado = null;
        Statement statement = null;
        ResultSet rs = null;   
                
        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery("SELECT id, nombre, genero FROM Personaje WHERE id='"+Personaje.getId()+"'");
            while(rs.next()){
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");
                resultado = new Personaje(id, nombre, genero, findAlias(qryAlias()), findEquipamientos(qryEquipamiento()+" WHERE personaje_id='"+id+"'"), findPoderes(qryPoder()+" WHERE pp.personaje_id='"+id+"'"));
            }
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar(rs, statement);
        }
        return resultado;
    }

    public boolean updatePersonaje(Personaje personaje) throws MarvelException {
        Statement statement = null;

        if (findPersonaje(personaje) == null ) {
            insertPersonaje(personaje);
        }

        try{
            statement = conexion().createStatement();
            statement.executeUpdate("UPDATE Personaje SET nombre='"+personaje.getNombre()+"', genero='"+personaje.getGenero()+"' WHERE id='"+personaje.getId()+"'");
            return true;
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }

    public void deletePersonaje(Personaje Personaje) throws MarvelException {
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("DELETE FROM Personaje WHERE id='"+Personaje.getId()+"'");
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }

    public boolean insertPersonaje(Personaje personaje) throws MarvelException{
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("INSERT INTO Personaje (id, nombre, genero) VALUES ('"+personaje.getId()+"', '"+personaje.getNombre()+"', '"+personaje.getGenero()+"')");
            return true;
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }

}
