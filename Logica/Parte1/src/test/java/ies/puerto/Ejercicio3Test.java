package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void invertirCadenaTest(){
        String cadena = "holaSoyRuben";
        String resultado = "nebuRyoSaloh";
        Assertions.assertEquals(resultado, ejercicio3.invertirCadena(cadena));
    }
}
