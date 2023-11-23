package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break3Test {
    Break3 break3 = new Break3();

    @Test
    public void Break3TestOk(){
        int resultado = break3.sieteArray();
        int resultadoOk = 7;
        Assertions.assertEquals(resultadoOk, resultado);
    }
}