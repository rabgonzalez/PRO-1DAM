package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break4Test {
    Break4 break4 = new Break4();

    @Test
    public void Break4TestOk(){
        int resultado = break4.negativoArray();
        int resultadoOk = -4;
        Assertions.assertEquals(resultadoOk, resultado);
    }
}