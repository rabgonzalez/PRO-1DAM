package ies.puerto.negocio;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.impl.Persona;

public class NegocioTest {
    Negocio negocio;
    String nombre;
    Persona persona;
    List<Persona> personas;

    @BeforeEach
    public void BeforeEach(){
        negocio = new Negocio();
        nombre = "nombre";
        persona = new Persona(nombre);
        personas = new ArrayList<>();
        negocio.crearPersona(persona);
    }

    @Test
    public void obtenerPersonaTest(){
        Assertions.assertEquals(persona, negocio.obtenerPersona(persona));
    }

    @Test
    public void obtenerPersonaFalseTest(){
        Persona personaNull = new Persona();
        Assertions.assertNull(negocio.obtenerPersona(personaNull));
    }

    @Test
    public void crearPersonaTest(){
        Persona personaCrear = new Persona("otroNombre");
        Assertions.assertTrue(negocio.crearPersona(personaCrear));
    }

    @Test
    public void crearPersonaFalseTest(){
        Assertions.assertFalse(negocio.crearPersona(persona));
    }

    @Test
    public void eliminarPersonaTest(){
        negocio.eliminarPersona(persona);
        Assertions.assertNull(negocio.obtenerPersona(persona));
    }

    @Test
    public void eliminarPersonaNullTest(){
        Persona personaActualizar = new Persona();
        Assertions.assertTrue(negocio.eliminarPersona(personaActualizar));
    }

    @Test
    public void actualizarPersonaTest(){
        Persona personaActualizar = new Persona(nombre, "alias", "genero", null);
        negocio.actualizarPersona(personaActualizar);
        Assertions.assertEquals(personaActualizar, negocio.obtenerPersona(persona));
    }

    @Test
    public void actualizarPersonaFalseTest(){
        Persona personaActualizar = new Persona();
        Assertions.assertFalse(negocio.actualizarPersona(personaActualizar));
    }
}
