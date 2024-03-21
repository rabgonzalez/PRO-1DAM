package ies.puerto.modelo.fichero.abstractas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.fichero.impl.FicheroCsv;
import ies.puerto.utilidades.Utilidades;

public class FicheroTest extends Utilidades {
    Fichero fichero;

    @BeforeEach
    public void beforeEach(){
        fichero = new FicheroCsv();
    }

    @Test
    public void existeFicheroTest(){
        Assertions.assertTrue(fichero.existeFichero(PATH_CSV));
    }

    @Test
    public void existeFicheroNullTest(){
        Assertions.assertFalse(fichero.existeFichero("PATH_CSV"));
    }
}
