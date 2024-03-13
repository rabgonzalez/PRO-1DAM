package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void contarPalabrasTest(){
        String texto = "Hola me llamo Ruben";
        int resultado = 4;
        Assertions.assertEquals(resultado, ejercicio4.contarPalabras(texto));
    }
}
