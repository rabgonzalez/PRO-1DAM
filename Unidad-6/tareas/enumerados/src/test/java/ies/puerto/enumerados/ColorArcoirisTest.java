package ies.puerto.enumerados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.enumerado.ColorArcoiris;

public class ColorArcoirisTest {
    ColorArcoiris colorArcoiris;

    @Test
    public void colorArcoirisRojoTest(){
        colorArcoiris = colorArcoiris.ROJO;
        Assertions.assertEquals(colorArcoiris, colorArcoiris.ROJO);
        Assertions.assertEquals("ROJO", colorArcoiris.toString());
    }

    @Test
    public void colorArcoirisAmarilloTest(){
        colorArcoiris = colorArcoiris.AMARILLO;
        Assertions.assertEquals(colorArcoiris, colorArcoiris.AMARILLO);
        Assertions.assertTrue(colorArcoiris.AMARILLO.equals(colorArcoiris));
    }

    @Test
    public void colorArcoirisMiColorTest(){
        colorArcoiris = colorArcoiris.valueOf("ROJO");
        Assertions.assertEquals(colorArcoiris, colorArcoiris.ROJO);
        ColorArcoiris colorRojo = colorArcoiris.valueOf("ROJO");
        System.out.println(colorArcoiris.getColor());
    }
}
