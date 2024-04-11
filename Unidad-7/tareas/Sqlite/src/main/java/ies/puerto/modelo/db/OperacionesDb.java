package ies.puerto.modelo.db;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import ies.puerto.exception.UsuarioException;
import ies.puerto.modelo.impl.Usuario;

public class OperacionesDb extends Conexion{
    
    public OperacionesDb() throws UsuarioException{
    }

    private Set<Usuario> obtener(String qry) throws UsuarioException{
        Set<Usuario> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                String userId = rs.getString("id");
                String userName = rs.getString("nombre");
                int userAge = rs.getInt("edad");
                String userCity = rs.getString("ciudad");
                Usuario usuario = new Usuario(userId, userName, userAge, userCity);
                lista.add(usuario);
            }
        } catch(SQLException exception){
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if(rs != null && !rs.isClosed()){
                    rs.close();
                }
                if(statement != null && !statement.isClosed()){
                    statement.close();
                }
                if(!conexion().isClosed()){
                    conexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return lista;
    }

    private void actualizar(String qry) throws UsuarioException{
        Statement statement = null;
        try{
            statement = conexion().createStatement();
            statement.executeUpdate(qry);
        } catch(SQLException exception){
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if(statement != null && !statement.isClosed()){
                    statement.close();
                }
                if(!conexion().isClosed()){
                    conexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
    }

    public Set<Usuario> obtenerUsuarios() throws UsuarioException{
        String qry = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios as u";
        return obtener(qry);
    }

    public void insertarUsuario(Usuario usuario) throws UsuarioException{
        String qry = "INSERT INTO usuarios AS u (nombre, edad, ciudad) VALUES('"+usuario.getNombre()+"', "+usuario.getEdad()+", '"+usuario.getCiudad()+"')";
        actualizar(qry);
    }

    public void eliminarUsuario(Usuario usuario) throws UsuarioException{
        String qry = "DELETE FROM usuarios AS u WHERE u.id='"+usuario.getId()+"'";
        actualizar(qry);
    }

    public void actualizarUsuario(Usuario usuario) throws UsuarioException{
        String qry = "UPDATE usuarios SET nombre='"+usuario.getNombre()+"', edad="+usuario.getEdad()+", ciudad='"+usuario.getCiudad()+"' WHERE id='"+usuario.getId()+"'";
        actualizar(qry);
    }

    public Usuario obtenerUsuario(Usuario usuario) throws UsuarioException{
        String qry = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios as u WHERE u.id='"+usuario.getId()+"'";
        Set<Usuario> lista = obtener(qry);
        if(lista.isEmpty()){
            return null;
        }
        return lista.iterator().next();
 
    }
}
