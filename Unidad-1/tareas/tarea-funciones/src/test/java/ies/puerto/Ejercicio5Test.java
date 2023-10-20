package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void calcularPrimoTestTrue(){
        int primo = 7;
        boolean resultado = ejercicio5.verificarPrimo(primo);
        Assertions.assertTrue(resultado);
    }
}