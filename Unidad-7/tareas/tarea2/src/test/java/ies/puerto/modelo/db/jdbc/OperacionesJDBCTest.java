package ies.puerto.modelo.db.jdbc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.db.impl.OperacionesJDBC;
import ies.puerto.modelo.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.impl.Alias;
import ies.puerto.modelo.impl.Personajes;
import ies.puerto.modelo.impl.Poderes;

public class OperacionesJDBCTest {
    OperacionesJDBC operacionesJDBC;
    Personajes ironMan;
    Personajes personaje;
    Alias alias;
    Poderes poder;
    Set<Poderes> poderes;
    int id1;
    int id2;
    int aliasId;
    int poderId;
    String nombre1;
    String nombre2;
    String genero;

    @BeforeEach
    public void beforeEach() throws PersonajeExcepcion{
        operacionesJDBC = new OperacionesJDBC();

        nombre1 = "Iron Man";
        genero = "Masculino";
        ironMan = new Personajes(0, nombre1, genero, null, null);

        alias = new Alias();
        alias.setAlias("Ruben Abreu");

        poder = new Poderes();
        poder.setPoder("programacion");
        poderes = new HashSet<>(Arrays.asList(poder));

        personaje = new Personajes();
        personaje.setNombre("nombre");
        personaje.setGenero(genero);
        personaje.setPoderes(poderes);
        personaje.setAlias(alias);

        operacionesJDBC.insertarPersonaje(personaje);
    }

    @Test
    public void obtenerPersonajesTest() throws PersonajeExcepcion{
        Assertions.assertEquals(3, operacionesJDBC.obtenerPersonajes().size());
    }

    @Test
    public void obtenerPersonajeTest() throws PersonajeExcepcion{
        Assertions.assertEquals(personaje.getNombre(), operacionesJDBC.obtenerPersonaje(personaje).getNombre());
    }

    @Test
    public void actualizarPersonajeTest() throws PersonajeExcepcion{

        poder.setId(operacionesJDBC.obtenerIdPoder(poder));
        poder.setPoder("otroPoder");

        personaje.setNombre("otroNombre");
        personaje.setGenero("otroGenero");
        personaje.setPoderes(poderes);
        alias.setAlias("otroAlias");
        personaje.setAlias(alias);

        operacionesJDBC.actualizarPersonaje(personaje);
        Assertions.assertEquals(personaje, operacionesJDBC.obtenerPersonaje(personaje));
    }

    @Test
    public void obtenerIdPersonajeTest() throws PersonajeExcepcion{
        int resultado = 1;
        Assertions.assertEquals(resultado, operacionesJDBC.obtenerIdPersonaje(ironMan));
    }

    @AfterEach
    public void afterEach() throws PersonajeExcepcion{
        operacionesJDBC.eliminarPersonaje(personaje);
    }
}
