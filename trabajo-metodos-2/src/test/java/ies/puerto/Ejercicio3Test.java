package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void mostrarNumerosTestOK(){
        String resultadoOK = "42678";
        String resultado = ejercicio3.mostrarNumeros(4, 2, 6, 7, 8);
        Assertions.assertEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void sumarNumerosTestOK(){
        int resultado = ejercicio3.sumarNumeros(4, 2, 6, 2, 4);
        Assertions.assertEquals(resultado, 18, "mal");
    }
}
