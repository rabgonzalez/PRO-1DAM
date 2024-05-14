package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.config.Conexion;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoPoder extends Conexion{
    public DaoPoder() throws MarvelException {

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

    public Set<Poder> findAllPoder() throws MarvelException {
        Set<Poder> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery("SELECT id, nombre FROM Poder");
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

    public Poder findPoder(Poder poder) throws MarvelException {
        Poder resultado = null;
        ResultSet rs = null;
        Statement statement = null;

        try {
            statement = conexion().createStatement();
            rs = statement.executeQuery("SELECT id, nombre FROM Poder WHERE id='"+poder.getId()+"'");
            while(rs.next()){
            String id = rs.getString("id");
            String nombre = rs.getString("nombre");
            resultado = new Poder(id, nombre);
            }
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally{
            cerrar(rs, statement);
        }
        return resultado;
    }

    public boolean updatePoder(Poder poder) throws MarvelException {
        Statement statement = null;

        if (findPoder(poder) == null ) {
            insertPoder(poder);
        }
        
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("UPDATE Poder SET nombre='"+poder.getNombre()+"' WHERE id='"+poder.getId()+"'");
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
        return true;
    }

    public void deletePoder(Poder poder) throws MarvelException {
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("DELETE FROM Poder WHERE id='"+poder.getId()+"'");
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }

    public boolean insertPoder(Poder poder) throws MarvelException{
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate("INSERT INTO Poder (id, nombre) VALUES ('"+poder.getId()+"', '"+poder.getNombre()+"')");
            return true;
        } catch(SQLException e){
            throw new MarvelException(e.getMessage(), e);
        } finally {
            cerrar(null, statement);
        }
    }
}
