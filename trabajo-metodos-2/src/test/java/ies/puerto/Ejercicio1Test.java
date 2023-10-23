package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();


    public void calcularSueldoHoraVerficacion(int numeroHoras, int resultadoEsperado) {
        int resultado = ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertEquals(resultadoEsperado, resultado, "No ha salido bien");
    }

    @Test
    public void calcularSueldoHoras10OkTest() {
        calcularSueldoHoraVerficacion(10, 100);
    }

    @Test
    public void calcularSueldoHoras20OkTest() {
        calcularSueldoHoraVerficacion(20, 200);
    }
}