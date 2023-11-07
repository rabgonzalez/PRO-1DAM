package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();

    public void ordenAscendenteTest(int[] array, int[] resultadoOK){
        int[] resultado = ejercicio7.ordenAscendente(array);
        Assertions.assertArrayEquals(resultadoOK, resultado);
    }

    @Test
    public void ordenAscendenteTestOk(){
        int[] array = {1, 5, 2};
        int[] resultadoOK = {1, 2, 5};
        ordenAscendenteTest(array, resultadoOK);
    }
}