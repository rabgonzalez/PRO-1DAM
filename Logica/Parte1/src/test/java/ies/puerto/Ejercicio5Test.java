package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();

    @ Test
    public void palindromoTest(){
        String text = "Ana lleva al oso la avellana";
        Assertions.assertTrue(ejercicio5.palindromo(text));
    }
}
