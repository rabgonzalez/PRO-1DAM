package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio6();
    }

    @Test
    public void ejercicio6Test() {
        int resultado = 27;
        Assertions.assertEquals(resultado, ejercicio.potencia(3, 3));
    }
}
