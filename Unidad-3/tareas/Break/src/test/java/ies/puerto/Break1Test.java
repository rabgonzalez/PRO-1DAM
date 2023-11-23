package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break1Test {
    Break1 break1 = new Break1();

    @Test
    public void Break1TestOk(){
        int resultado = break1.primerDivisible();
        int resultadoOk = 35;
        Assertions.assertEquals(resultadoOk, resultado);
    }
}