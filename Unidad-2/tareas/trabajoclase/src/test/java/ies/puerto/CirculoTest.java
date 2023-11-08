package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTest{

    Circulo circulo1 = new Circulo(2.6);

    @Test
    public void CirculoTestOK(){
        double resultado = circulo1.getRadio();
        double resultadoOK = 2.6;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void areaCirculoOK(){
        double resultado = circulo1.areaCirculo();
        double resultadoOK = 21.2264;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void circunferenciaCirculoOK(){
        double resultado = circulo1.circunferenciaCirculo();
        double resultadoOK = 16.328000000000003;
        Assertions.assertEquals(resultado, resultadoOK);
    }
}
