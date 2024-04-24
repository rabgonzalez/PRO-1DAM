package ies.puerto.modelo.db.jdbc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

        nombre2 = "ProgrammerMan";
        alias = new Alias(0, 0, "Ruben Abreu");
        poder = new Poderes(0, "Programacion");
        poderes = new HashSet<>(Arrays.asList(poder));
        personaje = new Personajes(0, nombre2, genero, poderes, alias);
    }

    @Test
    public void obtenerPersonajesTest() throws PersonajeExcepcion{
        Assertions.assertEquals(2, operacionesJDBC.obtenerPersonajes().size());
    }

    @Test
    public void obtenerPersonajeTest() throws PersonajeExcepcion{
        Personajes personajeBuscar = new Personajes();
        personajeBuscar.setNombre("Iron Man");
        Assertions.assertEquals(ironMan, operacionesJDBC.obtenerPersonaje(personajeBuscar));
    }

    @Test
    public void insertarEliminarPersonajeTest() throws PersonajeExcepcion{
        int cantidadInicial = operacionesJDBC.obtenerPersonajes().size();

        operacionesJDBC.insertarPersonaje(personaje);
        operacionesJDBC.eliminarPersonaje(personaje);
        Assertions.assertEquals(cantidadInicial, operacionesJDBC.obtenerPersonajes().size());
    }

    @Test
    public void actualizarPersonajeTest() throws PersonajeExcepcion{
        Alias otroAlias = new Alias(0, id2, "otroAlias");

        Poderes poder2 = new Poderes(0, "otroPoder");
        poderes.add(poder2);

        personaje.setNombre("otroNombre");
        personaje.setGenero("otroGenero");
        personaje.setPoderes(poderes);
        personaje.setAlias(otroAlias);

        operacionesJDBC.actualizarPersonaje(personaje);
        Assertions.assertEquals(personaje, operacionesJDBC.obtenerPersonaje(personaje));
    }

    @Test
    public void obtenerIdPersonajeTest() throws PersonajeExcepcion{
        int resultado = 1;
        Assertions.assertEquals(resultado, operacionesJDBC.obtenerIdPersonaje(ironMan));
    }
}
