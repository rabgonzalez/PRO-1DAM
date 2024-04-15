package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio;
    List<Integer> resultado;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio7();
        resultado = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1));
    }

    @Test
    public void ejercicio7TradicionalTest() {
         Assertions.assertEquals(resultado, ejercicio.conteoRegresivoTradicional(6));
    }

    @Test
    public void ejercicio7Test() {
         Assertions.assertEquals(resultado, ejercicio.conteoRegresivo(6));
    }
}
