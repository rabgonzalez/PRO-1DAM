package ies.puerto.modelo.fichero.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.impl.Persona;

public class FicheroJsonTest {
    FicheroJson ficheroJson;
    List<Persona> personas;
    Persona persona;
    List<String> poderes;

    @BeforeEach
    public void beforeEach(){
        ficheroJson = new FicheroJson();
        personas = new ArrayList<>();
        poderes = new ArrayList<>(Arrays.asList("poder1", "poder2"));

        persona = new Persona("nombre", "alias", "genero", poderes);
    }

    @Test
    public void obtenerPersonasTest(){
        Assertions.assertNotNull(ficheroJson.obtenerPersonas());
    }

    @Test
    public void escribirTest(){
        personas = ficheroJson.obtenerPersonas();
        personas.add(persona);
        ficheroJson.escribir(personas);
        Assertions.assertEquals(personas.size(), ficheroJson.obtenerPersonas().size());
    }
}
