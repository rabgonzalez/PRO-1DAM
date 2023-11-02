package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {

    Ejercicio10 ejercicio10 = new Ejercicio10();

    public void matrizDiagonalTest(int[][] matriz, int[][] resultadoOK){
        int[][] resultado = ejercicio10.matrizDiagonal(matriz);
        Assertions.assertArrayEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void matrizDiagonalTestOK(){
        int[][] matriz = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        int[][] resultadoOK = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        matrizDiagonalTest(matriz, resultadoOK);
    } 
}