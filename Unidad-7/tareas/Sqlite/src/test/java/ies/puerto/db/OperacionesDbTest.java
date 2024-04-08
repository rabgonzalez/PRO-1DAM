package ies.puerto.db;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.exception.UsuarioException;
import ies.puerto.modelo.db.OperacionesDb;
import ies.puerto.modelo.impl.Usuario;

public class OperacionesDbTest {
    OperacionesDb operacionesDb;
    String urlDb = "src/main/resources/usuarios.db";
    Usuario usuario;

    @BeforeEach
    public void beforeEach(){
        operacionesDb = new OperacionesDb(urlDb);
        usuario = new Usuario("11", "Jonay", 19, "Comunismo");
    }

    @Test
    public void obtenerUsuariosTest(){
        try {
            Set<Usuario> lista = operacionesDb.obtenerUsuarios();
            Assertions.assertEquals(10, lista.size());
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUsuarioTest(){
        Usuario usuario = new Usuario("5");
        try {
            usuario = operacionesDb.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario);
            Assertions.assertNotNull(usuario.getId());
            Assertions.assertNotNull(usuario.getNombre());
            Assertions.assertNotNull(usuario.getEdad());
            Assertions.assertNotNull(usuario.getCiudad());
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarUsuarioTest(){
        try {
            int cantUsuario = operacionesDb.obtenerUsuarios().size();
            operacionesDb.insertarUsuario(usuario);
            Usuario usuarioObtenido = operacionesDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido);
            
            operacionesDb.eliminarUsuario(usuarioObtenido);
            int cantUsuarioFinal = operacionesDb.obtenerUsuarios().size();
            Assertions.assertEquals(cantUsuarioFinal, cantUsuario);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarUsuarioTest(){
        String nombreUpdate = "Pepe Juan";
        int edadUpdate = 22;
        String ciudadUpdate = "Miami";

        try {
            operacionesDb.insertarUsuario(usuario);
            usuario.setCiudad(ciudadUpdate);
            usuario.setEdad(edadUpdate);
            usuario.setNombre(nombreUpdate);
            operacionesDb.actualizarUsuario(usuario);

            Usuario usuarioEncontrado = operacionesDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuarioEncontrado, usuario);
            Assertions.assertEquals(usuarioEncontrado.getNombre(), usuario.getNombre());
            Assertions.assertEquals(usuarioEncontrado.getEdad(), usuario.getEdad());
            Assertions.assertEquals(usuarioEncontrado.getCiudad(), usuario.getCiudad());
            operacionesDb.eliminarUsuario(usuarioEncontrado);
        } catch (Exception e) {
            Assertions.fail();
        }
    }
}
