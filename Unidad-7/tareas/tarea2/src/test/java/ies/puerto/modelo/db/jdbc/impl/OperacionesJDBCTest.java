package ies.puerto.modelo.db.jdbc.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.impl.Personajes;

public class OperacionesJDBCTest {
    OperacionesJDBC operacionesJDBC;
    Personajes personaje;
    int id = 6;

    @BeforeEach
    public void beforeEach() throws PersonajeExcepcion{
        operacionesJDBC = new OperacionesJDBC();
        String nombre = "nombre";
        String genero = "genero";
        personaje = new Personajes(id, nombre, genero, null, null);
    }

    @Test
    public void obtenerTodosPersonajesTest() throws PersonajeExcepcion{
        Assertions.assertEquals(2, operacionesJDBC.obtenerTodosPersonajes().size());
    }

    @Test
    public void insertarEliminarPersonajeTest() throws PersonajeExcepcion{
        id++;
        int cantidadInicial = operacionesJDBC.obtenerTodosPersonajes().size();

        operacionesJDBC.insertarPersonaje(personaje);
        Assertions.assertEquals(cantidadInicial+1, operacionesJDBC.obtenerTodosPersonajes().size());

        operacionesJDBC.eliminarPersonaje(personaje);
        Assertions.assertEquals(cantidadInicial, operacionesJDBC.obtenerTodosPersonajes().size());
    }

    @Test
    public void actualizarPersonajeTest() throws PersonajeExcepcion{
        Personajes personajeActualizar = new Personajes(3, "otroNombre", "otroGenero", null, null);
        operacionesJDBC.actualizarPersonaje(personajeActualizar);
        Assertions.assertEquals(personajeActualizar, operacionesJDBC.obtenerPersonaje(personajeActualizar));
    }
}
