package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void contarPalabrasRepetidasTest(){
        String texto = "Hola me llamo Ruben , aunque la gente me llama ruben";
        int resultado = 2;
        Assertions.assertEquals(resultado, ejercicio4.contarPalabrasRepetidas(texto));
    }
}
