package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio;
    int resultado = 5050;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio2();
    }

    @Test
    public void ejercicio2Test() {
        Assertions.assertEquals(resultado, ejercicio.sumaNaturales(100));
    }
}
