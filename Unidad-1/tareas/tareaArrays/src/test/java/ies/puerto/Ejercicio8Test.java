package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {

    Ejercicio8 ejercicio8 = new Ejercicio8();

    public void eliminarDuplicadosTest(int[] array, int[] resultadoOK){
        int[] resultado = ejercicio8.eliminarDuplicados(array);
        Assertions.assertArrayEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void eliminarDuplicadosTestOK(){
        int[] array = {1, 2, 8, 8};
        int[] resultadoOK = {0, 2, 8, 8};
        eliminarDuplicadosTest(array, resultadoOK); 
    } 
}