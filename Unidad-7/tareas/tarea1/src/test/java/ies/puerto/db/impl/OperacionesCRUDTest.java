package ies.puerto.db.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.db.impl.OperacionesCRUD;
import ies.puerto.modelo.impl.Personaje;

public class OperacionesCRUDTest {
    OperacionesCRUD operacionesCRUD;
    Personaje personaje;
    int id;
    String nombre;
    String alias;
    String genero;
    Set<String> poderes;
    String poder1;
    String poder2;
    String poder3;

    @BeforeEach
    public void beforeEach() throws PersonajeExcepcion{
        operacionesCRUD = new OperacionesCRUD();
        id = 3;
        nombre = "nombre";
        alias = "alias";
        genero = "genero";
        poder1 = "poder1";
        poder2 = "poder2";
        poder3 = "poder3";
        poderes = new HashSet<>(Arrays.asList(poder1, poder2, poder3));
        personaje = new Personaje(id, nombre, alias, genero, poderes);
    }

    @Test
    public void obtenerPoderesTest() throws PersonajeExcepcion{
        Assertions.assertEquals(3, operacionesCRUD.obtenerPoderes(1).size());
    }

    @Test
    public void obtenerPersonajesTest(){
        try {
            Set<Personaje> lista = operacionesCRUD.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size());
        } catch (PersonajeExcepcion e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPersonajeTest(){
        try {
            Personaje personajeBuscar = new Personaje(1);
            Assertions.assertEquals(personajeBuscar, operacionesCRUD.obtenerPersonaje(personajeBuscar));
        } catch (PersonajeExcepcion e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarPersonajeTest(){
        try {
            int cantidad = operacionesCRUD.obtenerPersonajes().size();
            operacionesCRUD.insertarPersonaje(personaje);
            Assertions.assertEquals(cantidad+1, operacionesCRUD.obtenerPersonajes().size());

            operacionesCRUD.eliminarPersonaje(personaje);
            Assertions.assertEquals(cantidad, operacionesCRUD.obtenerPersonajes().size());
        } catch (PersonajeExcepcion e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarPersonajeTest() throws PersonajeExcepcion{
        Personaje personajeActualizar = new Personaje(3, "otroNombre", "otroAlias", "otroGenero", poderes);
        operacionesCRUD.actualizarPersonaje(personajeActualizar);
        Assertions.assertEquals(personajeActualizar, operacionesCRUD.obtenerPersonaje(personajeActualizar));
    }
}
