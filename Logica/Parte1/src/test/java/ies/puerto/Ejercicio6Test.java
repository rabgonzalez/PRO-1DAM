package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void diasDiferencia(){
        String fecha1 = "13/03/2024";
        String fecha2 = "10/03/2024";
        int diferencia = 3;
        Assertions.assertEquals(diferencia, ejercicio6.diasDiferencia(fecha1, fecha2));
    }
}
