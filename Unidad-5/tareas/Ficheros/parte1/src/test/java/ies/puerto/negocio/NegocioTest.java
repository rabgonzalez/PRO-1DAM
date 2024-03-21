package ies.puerto.negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.impl.Persona;

public class NegocioTest {
    Negocio negocio;
    List<Persona> personaList;
    Persona persona;
    String nombre;
    String alias;
    String genero;
    List<String> poderes;

    @BeforeEach
    public void BeforeEach(){
        negocio = new Negocio();
        nombre = "Iron Man";
        alias = "Tony Stark";
        genero = "Masculino";
        poderes = new ArrayList<>(Arrays.asList("poder1", "poder2"));
        persona = new Persona(nombre, alias, genero, poderes);
        personaList = negocio.fichero.obtenerPersonas();
    }

    @Test
    public void obtenerPersonaTest(){
        Assertions.assertEquals(persona, negocio.obtenerPersona(persona));
    }

    @Test
    public void crearPersonaTest(){
        Persona personaCrear = new Persona("nombre");
        Assertions.assertTrue(negocio.crearPersona(personaCrear));
    }

    @Test
    public void eliminarPersonaTest(){
        Persona personaEliminar = new Persona("Iron Man");
        Assertions.assertTrue(negocio.eliminarPersona(personaEliminar));
    }

    @Test
    public void actualizarPersonaTest(){
        Persona personaActualizar = new Persona("Iron Man", "alias2", "Masculino", poderes);
        negocio.actualizarPersona(personaActualizar);
        Assertions.assertTrue(personaList.contains(personaActualizar));
    }
}
