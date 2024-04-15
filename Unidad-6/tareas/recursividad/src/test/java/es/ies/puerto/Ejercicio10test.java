package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio10test {
    Ejercicio10 ejercicio;
    List<Integer> resultado;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio10();
        resultado = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
    }

    @Test
    public void ejercicio10TradicionalTest() {
        Assertions.assertEquals(resultado, ejercicio.imprimirImparesTradicional(10));
    }

    @Test
    public void ejercicio10Test() {
        Assertions.assertEquals(resultado, ejercicio.imprimirImpares(10));
    }
}
