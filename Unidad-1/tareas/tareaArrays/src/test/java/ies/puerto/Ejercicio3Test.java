package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    public void valorMayorTest(int[] numeros, int resultadoOK){
        int resultado = ejercicio3.mayorArray(numeros);
        Assertions.assertEquals(resultado, resultadoOK, "mal");
    }
    public void valorMenorTest(int[] numeros, int resultadoOK){
    int resultado = ejercicio3.menorArray(numeros);
    Assertions.assertEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void valorMayorTestOK(){
    int[] numeros = {1, 2, 3, 4, 5};
    valorMayorTest(numeros, 5);
    }

    @Test
    public void valorMenorTestOK(){
    int[] numeros = {7, 2, 3, 4, 5};
    valorMenorTest(numeros, 2);
    }
}