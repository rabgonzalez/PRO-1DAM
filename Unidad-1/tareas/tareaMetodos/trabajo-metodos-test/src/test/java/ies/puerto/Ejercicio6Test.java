package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    static Ejercicio6 ejercicio6;

    @BeforeAll
    public static void before(){
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void verificarArmstrongFALSE() {
        int numero = 1;
        boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertFalse(resultado, "Número NO debe de ser Armstrong");
    }
}
