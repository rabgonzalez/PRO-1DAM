package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductoTest{

    Producto producto1 = new Producto("Plátano", 1, 100);
    Producto producto2 = new Producto("iPhone", 1500, 100);

    @Test
    public void mostrarProductosOK(){
        String resultado = producto1.mostrarProductos();
        String resultadoOK = "Nombre: Plátano Precio: 1 Stock: 100";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getNombreOK(){
        String resultado = producto1.getNombre();
        String resultadoOK = "Plátano";
        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void setPrecioOK(){
        producto1.setPrecio(1000);
        int resultado = producto1.getPrecio();
        int resultadoOK = 1000;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void agregarProductosTest(){
        int resultado = producto1.agregarProductos(10);
        int resultadoOK = 110;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void retirarProductosTest(){
        int resultado = producto1.retirarProductos(50);
        int resultadoOK = 50;
        Assertions.assertEquals(resultado, resultadoOK);
    }
}
