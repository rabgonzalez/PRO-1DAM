package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break5Test {
    Break5 break5 = new Break5();

    @Test
    public void Break5TestOk(){
        int resultado = break5.divisor5MayorQue30();
        int resultadoOk = 35;
        Assertions.assertEquals(resultadoOk, resultado);
    }
}