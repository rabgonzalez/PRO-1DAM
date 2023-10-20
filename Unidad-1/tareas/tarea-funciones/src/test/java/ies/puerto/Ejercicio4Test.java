package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void numeroMayorTestOK(){
        int a = 1;
        int b = 3;
        int c = 6;
        int resultadoOK = 6;
        int resultado = ejercicio4.numeroMayorDos(resultadoOK, 3);
        Assertions.assertEquals(resultadoOK, resultado, "No ha salido bien");
    }
}