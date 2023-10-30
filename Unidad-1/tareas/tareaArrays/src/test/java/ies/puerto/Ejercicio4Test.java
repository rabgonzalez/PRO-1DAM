package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    public void mostrarParesTest(int[] numeros, int[] resultadoOK){
        int[] resultado = ejercicio4.numerosPares(numeros);
        Assertions.assertArrayEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void mostrarParesTestOK(){
        int[] numeros = {1, 2, 3, 4, 5};
        int [] resultadoOK = {0, 2, 0, 4, 0};
        mostrarParesTest(numeros, resultadoOK);
    }
}