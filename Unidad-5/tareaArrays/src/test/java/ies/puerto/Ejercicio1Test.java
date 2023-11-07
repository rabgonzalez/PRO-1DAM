package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();


    public void sumaNumerosTest(int[] numeros, int resultadoOk) {
        int resultado = ejercicio1.calcularSumaArrays(numeros);
        Assertions.assertEquals(resultadoOk, resultado, "No ha salido bien");
    }

    @Test
    public void sumarNumerosTest14OK() {
        int[] numeros = {1, 2, 3, 4, 5};
        sumaNumerosTest(numeros, 15);
    }
}