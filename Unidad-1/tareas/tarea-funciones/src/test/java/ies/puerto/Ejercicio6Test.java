package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void verificarTemperaturaTestOK(){
        int grados = 50;
        double resultadoOK= 10.0;
        double resultado = ejercicio6.calcularTemperatura(grados);
        Assertions.assertEquals(resultadoOK, resultado, "No es correcto");
    }
}