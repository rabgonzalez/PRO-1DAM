package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break2Test {
    Break2 break2 = new Break2();

    @Test
    public void Break2TestOk(){
        int resultado = break2.primoMayor();
        int resultadoOk = 101;
        Assertions.assertEquals(resultadoOk, resultado);
    }
}