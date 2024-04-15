package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {
    Ejercicio9 ejercicio9;
    String texto = ".--.";

    @BeforeEach
    public void beforeach(){
        ejercicio9 = new Ejercicio9();
    }

    @Test
    public void verificarTipoTest(){
        Assertions.assertEquals(false, ejercicio9.verificarTexto(texto));
    }

    @Test
    public void convertirMorseTest(){
        String resultado = "hola";
        Assertions.assertEquals(resultado, ejercicio9.convertir(texto));
    }

    @Test
    public void convertirTextoTest(){
        String resultado = ".--.";
        Assertions.assertEquals(resultado, ejercicio9.convertir("hola"));
    }
}
