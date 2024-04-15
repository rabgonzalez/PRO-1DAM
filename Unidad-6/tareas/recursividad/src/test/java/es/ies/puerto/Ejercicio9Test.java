package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {
    Ejercicio9 ejercicio;
    List<Integer> resultado;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio9();
        resultado = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    public void ejercicio9TradicionalTest() {
        Assertions.assertEquals(resultado, ejercicio.serieNumeroTradicional(10));
    }

    @Test
    public void ejercicio9Test() {
        Assertions.assertEquals(resultado, ejercicio.serieNumero(10));
    }
}
