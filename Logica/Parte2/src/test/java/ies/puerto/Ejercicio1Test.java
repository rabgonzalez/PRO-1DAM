package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    int[] array = {4, 0, 3, 6, 1, 3};

    @Test
    void numFilasTest(){
        int numero = 6;
        int resultado = ejercicio1.numFilas(array);
        Assertions.assertEquals(numero, resultado);
    }

    @Test
    void contenedorHieloTest(){
        String[][] ejercicio = ejercicio1.contenedorHielo(array);
        String[][] resultado = {{null, null, "🧊", "🧊", "🧊", "🧊"}, 
                                {null, null, null, null, null, null}, 
                                {null, null, null, "🧊", "🧊", "🧊"}, 
                                {"🧊", "🧊", "🧊", "🧊", "🧊", "🧊"},
                                {null, null, null, null, null, "🧊"},
                                {null, null, null, "🧊", "🧊", "🧊"}};
        Assertions.assertArrayEquals(ejercicio, resultado);
    }
}
