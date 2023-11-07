package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();


    public void promedioNumerosTest(int[] numeros, int resultadoOk) {
        int resultado = ejercicio2.promedioArray(numeros);
        Assertions.assertEquals(resultadoOk, resultado, "No ha salido bien");
    }

    @Test
    public void promedioNumerosTest3OK() {
        int[] numeros = {1, 2, 3, 4, 5};
        promedioNumerosTest(numeros, 3);
    }
}