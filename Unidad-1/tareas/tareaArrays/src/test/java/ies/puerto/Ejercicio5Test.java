package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();

    public void buscarElementoTest(int[] numeros, int valor, int resultadoOK){
        int resultado = ejercicio5.buscarElemento(valor, numeros);
        Assertions.assertEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void buscarElemento4TestOK(){
        int[] numeros = {1, 2, 3, 4, 5};
        int valor = 5;
        int resultadoOK = 4;
        buscarElementoTest(numeros, valor, resultadoOK);
    }
}