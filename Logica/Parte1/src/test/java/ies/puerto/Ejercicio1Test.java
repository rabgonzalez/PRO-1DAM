package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void numeroPrimoBooleanTest(){
        int numero = 13;
        Assertions.assertTrue(ejercicio1.numeroPrimoBoolean(numero));
    }

    @Test
    public void numeroPrimoFalseBooleanTest(){
        int numero = 12;
        Assertions.assertFalse(ejercicio1.numeroPrimoBoolean(numero));
    }

    @Test
    public void numerosPrimosTest(){
        String resultado = "1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";
        Assertions.assertEquals(resultado, ejercicio1.numerosPrimos());
    }
}
