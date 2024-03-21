package ies.puerto.modelo.fichero.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.impl.Persona;

public class FicheroCsvTest {
    FicheroCsv ficheroCsv;
    List<Persona> personas;
    Persona persona;
    List<String> poderes;

    @BeforeEach
    public void beforeEach(){
        ficheroCsv = new FicheroCsv();
        personas = new ArrayList<>();
        poderes = new ArrayList<>(Arrays.asList("poder1", "poder2"));

        persona = new Persona("nombre", "alias", "genero", poderes);
    }

    @Test
    public void obtenerPersonasTest(){
        Assertions.assertNotNull(ficheroCsv.obtenerPersonas());
    }

    @Test
    public void escribirTest(){
        personas = ficheroCsv.obtenerPersonas();
        personas.add(persona);
        ficheroCsv.escribir(personas);
        Assertions.assertEquals(personas.size(), ficheroCsv.obtenerPersonas().size());
    }

    @Test
    public void actualizarTest(){
        personas = ficheroCsv.obtenerPersonas();
        personas.set(1, persona);
        ficheroCsv.actualizar(personas);
        Assertions.assertTrue(ficheroCsv.obtenerPersonas().contains(persona));
    }
}
