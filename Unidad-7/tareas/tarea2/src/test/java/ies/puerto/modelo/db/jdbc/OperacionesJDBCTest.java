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
    String nombre1;
    String nombre2;
    String genero;

    @BeforeEach
    public void beforeEach() throws PersonajeExcepcion{
        operacionesJDBC = new OperacionesJDBC();

        id1= 1;
        nombre1 = "Iron Man";
        genero = "Masculino";
        ironMan = new Personajes(id1, nombre1, genero, null, null);

        id2 = 6;
        alias = new Alias(id1, id2, "Ruben Abreu");
        poder = new Poderes(id1, "Programacion", null);
        poderes = new HashSet<>(Arrays.asList(poder));
        personaje = new Personajes(id2, nombre2, genero, poderes, alias);
    }

    @Test
    public void obtenerTodosPersonajesTest() throws PersonajeExcepcion{
        Assertions.assertEquals(2, operacionesJDBC.obtenerTodosPersonajes().size());
    }

    @Test
    public void obtenerPersonajeTest() throws PersonajeExcepcion{
        Personajes personajeBuscar = new Personajes(id1);
        Assertions.assertEquals(ironMan, operacionesJDBC.obtenerPersonaje(personajeBuscar));
    }

    @Test
    public void insertarEliminarPersonajeTest() throws PersonajeExcepcion{
        int cantidadInicial = operacionesJDBC.obtenerTodosPersonajes().size();

        operacionesJDBC.insertarPersonaje(personaje);
        Assertions.assertEquals(cantidadInicial+1, operacionesJDBC.obtenerTodosPersonajes().size());

        operacionesJDBC.eliminarPersonaje(personaje);
        Assertions.assertEquals(cantidadInicial, operacionesJDBC.obtenerTodosPersonajes().size());
    }

    @Test
    public void actualizarPersonajeTest() throws PersonajeExcepcion{
        Alias otroAlias = new Alias(id1, id2, "otroAlias");
        Personajes personajeActualizar = new Personajes(6, "otroNombre", "otroGenero", null, otroAlias);
        operacionesJDBC.actualizarPersonaje(personajeActualizar);
        Assertions.assertEquals(personajeActualizar, operacionesJDBC.obtenerPersonaje(personajeActualizar));
    }
}
