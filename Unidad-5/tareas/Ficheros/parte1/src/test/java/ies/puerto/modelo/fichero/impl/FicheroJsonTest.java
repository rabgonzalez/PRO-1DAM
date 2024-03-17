package ies.puerto.modelo.fichero.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.impl.Persona;
import ies.puerto.modelo.impl.Poder;

public class FicheroJsonTest {
    FicheroJson ficheroJson;
    List<Persona> personas;
    Persona persona;
    Set<Poder> poderes;
    Poder poder1;
    Poder poder2;

    @BeforeEach
    public void beforeEach(){
        ficheroJson = new FicheroJson();
        personas = new ArrayList<>();
        poderes = new HashSet<>();
        poder1 = new Poder("poder1");
        poder2 = new Poder("poder2");

        poderes.add(poder1);
        poderes.add(poder2);
        persona = new Persona("nombre", "alias", "genero", poderes);
        personas.add(persona);
    }

    @Test
    public void obtenerPersonasTest(){
        Assertions.assertNotNull(ficheroJson.obtenerPersonas());
    }

    @Test
    public void actualizarTest(){
        Assertions.assertTrue(ficheroJson.actualizar(personas));
    }

    @Test
    public void escribirTest(){
        Assertions.assertTrue(ficheroJson.escribir(personas));
    }
}
