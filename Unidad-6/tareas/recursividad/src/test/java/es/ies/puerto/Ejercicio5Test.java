package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio;
    int valor = 5;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();
    }

    @Test
    public void ejercicio1Test() {
        int resultado = 120;
        Assertions.assertEquals(resultado, ejercicio.factorial(valor));
    }
}
