package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductoTest{

    Producto producto1 = new Producto("Plátano", 1, true);
    Producto producto2 = new Producto("iPhone", 1500, false);

    @Test
    public void mostrarProductosOK(){
        String resultado = producto1.mostrarProductos();
        String resultadoOK = "Nombre: Plátano Precio: 1 Stock? true";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getNombreOK(){
        String resultado = producto1.getNombre();
        String resultadoOK = "Plátano";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getPrecioOK(){
        int resultado = producto1.getPrecio();
        int resultadoOK = 1;
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
    public void getStockOK(){
        boolean resultado = producto1.getStock();
        boolean resultadoOK = true;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void setStockOK(){
        producto1.setStock(false);
        boolean resultado = producto1.getStock();
        boolean resultadoOK = false;
        Assertions.assertEquals(resultado, resultadoOK);
    }
}
