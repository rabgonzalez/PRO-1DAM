package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest{

    Rectangulo rectangulo1 = new Rectangulo(2, 3);

    @Test
    public void getLargoOK(){
        int resultado = rectangulo1.getLargo();
        int resultadoOK = 2;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void setLargoOk(){
        rectangulo1.setLargo(3);
        int resultado = rectangulo1.getLargo();
        int resultadoOK = 3;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getAnchoOK(){
        int resultado = rectangulo1.getAncho();
        int resultadoOK = 3;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void setAnchoOk(){
        rectangulo1.setAncho(2);
        int resultado = rectangulo1.getAncho();
        int resultadoOK = 2;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void areaRectanguloOK(){
        int resultado = rectangulo1.areaRectangulo();
        int resultadoOK = 6;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void perimetroRectanguloOK(){
        int resultado = rectangulo1.perimetroRectangulo();
        int resultadoOK = 10;
        Assertions.assertEquals(resultado, resultadoOK);
    }
}