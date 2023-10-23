package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void verificarNumeroTestTrue(){
        boolean resultado = ejercicio2.verificarNumero(4);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void verificarNumeroTestFalse(){
        boolean resultado = ejercicio2.verificarNumero(9);
        Assertions.assertFalse(resultado);
    }
}
