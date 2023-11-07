package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {

    Ejercicio9 ejercicio9 = new Ejercicio9();

    public void combinarArraysTest(int[] array1, int[] array2, int[] resultadoOK){
        int[] resultado = ejercicio9.combinarArrays(array1, array2);
        Assertions.assertArrayEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void eliminarDuplicadosTestOK(){
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {8, 6, 4, 2};
        int[] resultadoOK = {1, 3, 5, 7, 2, 4, 6, 8};
        combinarArraysTest(array1, array2, resultadoOK);
    } 
}