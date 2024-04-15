package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
    Ejercicio8 ejercicio;
    int resultado;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio8();
        resultado = 5050;
    }

    @Test
    public void ejercicio8TradicionalTest() {
        Assertions.assertEquals(resultado, ejercicio.sumaDigitosTradicional(100));
    }

    @Test
    public void ejercicio8Test() {
        Assertions.assertEquals(resultado, ejercicio.sumaDigitos(100));
    }
}
