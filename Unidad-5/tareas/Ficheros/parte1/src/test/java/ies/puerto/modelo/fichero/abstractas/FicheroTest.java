package ies.puerto.modelo.fichero.abstractas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.fichero.impl.FicheroCsv;

public class FicheroTest {
    Fichero fichero;

    @BeforeEach
    public void beforeEach(){
        fichero = new FicheroCsv();
    }

    @Test
    public void existeFicheroTest(){
        Assertions.assertTrue(fichero.existeFichero(fichero.PATH_CSV));
    }

    @Test
    public void existeFicheroNullTest(){
        Assertions.assertFalse(fichero.existeFichero("PATH_CSV"));
    }
}
