package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {

    Ejercicio10 ejercicio10 = new Ejercicio10();

    public void matrizDiagonalTest(int[][] matriz, boolean resultadoOK){
        boolean resultado = ejercicio10.matrizDiagonal(matriz);
        Assertions.assertTrue(resultadoOK);
    }

    @Test
    public void matrizDiagonalTestOK(){
        int[][] matriz = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        boolean resultadoOK = true;
        matrizDiagonalTest(matriz, resultadoOK);
    } 
}