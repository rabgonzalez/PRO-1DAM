package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void mayusculaTest(){
        String texto = "hola me llamo ruben";
        String resultado = "Hola Me Llamo Ruben ";
        Assertions.assertEquals(resultado, ejercicio7.mayuscula(texto));
    }
}
