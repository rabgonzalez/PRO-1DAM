package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    public void matrizTraspuestaTest(int[][] matriz, int[][] resultadoOK){
        int[][] resultado = ejercicio6.matrizTraspuesta(matriz);
        Assertions.assertArrayEquals(resultado, resultadoOK, "mal");
    }

    @Test
    public void matrizTraspuestaTestOK(){
        int[][] resultadoOK = {{1, 3}, {2, 4}};
        int[][] matriz = {{1, 2}, {3, 4}};
        matrizTraspuestaTest(matriz, resultadoOK);
    }
}