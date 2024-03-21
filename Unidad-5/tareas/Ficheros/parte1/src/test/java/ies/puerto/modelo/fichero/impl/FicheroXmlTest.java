package ies.puerto.modelo.fichero.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.impl.Persona;

public class FicheroXmlTest {
    FicheroXml ficheroXml;
    List<Persona> personas;
    Persona persona;
    List<String> poderes;

    @BeforeEach
    public void beforeEach(){
        ficheroXml = new FicheroXml();
        personas = new ArrayList<>();
        poderes = new ArrayList<>();

        persona = new Persona("nombre", "alias", "genero", poderes);
    }

    @Test
    public void obtenerPersonasTest(){
        Assertions.assertNotNull(ficheroXml.obtenerPersonas());
    }

    @Test
    public void escribirTest(){
        personas = ficheroXml.obtenerPersonas();
        personas.add(persona);
        ficheroXml.escribir(personas);
        Assertions.assertEquals(personas.size(), ficheroXml.obtenerPersonas().size());
    }
}
