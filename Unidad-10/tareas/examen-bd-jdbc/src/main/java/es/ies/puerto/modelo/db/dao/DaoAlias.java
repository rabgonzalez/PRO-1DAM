package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.config.Conexion;
import es.ies.puerto.modelo.db.entidades.Alias;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoAlias extends Conexion {


    public DaoAlias() throws MarvelException {
        
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

        public Set<Alias> findAllAlias() throws MarvelException {
            Set<Alias> lista = new HashSet<>();
            ResultSet rs = null;
            Statement statement = null;

            try {
                statement = conexion().createStatement();
                rs = statement.executeQuery("SELECT id, personaje_id, alias FROM Alias");

                while(rs.next()){
                    String id = rs.getString("id");
                    String personaje_id = rs.getString("personaje_id");
                    String descripcion = rs.getString("alias");
                    Alias alias = new Alias(id, descripcion, personaje_id);
                    lista.add(alias);
                }
            } catch(SQLException e){
                throw new MarvelException(e.getMessage(), e);
            } finally{
                cerrar(rs, statement);
            }
            return lista;
        }

        public Alias findAlias(Alias Alias) throws MarvelException {
            Alias resultado = null;
            ResultSet rs = null;
            Statement statement = null;
        
            try {
                statement = conexion().createStatement();
                rs = statement.executeQuery("SELECT id, personaje_id, alias FROM Alias WHERE id='"+Alias.getId()+"'");

                while(rs.next()){
                    String id = rs.getString("id");
                    String personaje_id = rs.getString("personaje_id");
                    String descripcion = rs.getString("alias");
                    resultado = new Alias();
                    resultado.setId(id);
                    resultado.setDescripcion(descripcion);
                    resultado.setPersonaje_id(personaje_id);
                }

            } catch(SQLException e){
                throw new MarvelException(e.getMessage(), e);
            } finally{
                cerrar(rs, statement);
            }
            return resultado;
        }

        public boolean updateAlias(Alias alias) throws MarvelException {
            Statement statement = null;

            if(findAlias(alias) == null ) {
                insertAlias(alias);
            }
            
            try{
                statement = conexion().createStatement();
                statement.executeUpdate("UPDATE Alias SET alias='"+alias.getDescripcion()+"' WHERE id='"+alias.getId()+"'");
                return true;
            } catch(SQLException e){
                throw new MarvelException(e.getMessage(), e);
            } finally {
                cerrar(null, statement);
            }
        }

        public void deleteAlias(Alias alias) throws MarvelException {
            Statement statement = null;
            try{
                statement = conexion().createStatement();
                statement.executeUpdate("DELETE FROM Alias WHERE id='"+alias.getId()+"'");
            } catch(SQLException e){
                throw new MarvelException(e.getMessage(), e);
            } finally {
                cerrar(null, statement);
            }
        }

        public boolean insertAlias(Alias alias) throws MarvelException{
            Statement statement = null;
            try{
                statement = conexion().createStatement();
                statement.executeUpdate("INSERT INTO Alias (id, personaje_id, alias) VALUES ('"+alias.getId()+"', '"+alias.getPersonaje_id()+"', '"+alias.getDescripcion()+"')");
                return true;
            } catch(SQLException e){
                throw new MarvelException(e.getMessage(), e);
            } finally {
                cerrar(null, statement);
            }
        }
}
