package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibroTest{

    Libro libro1 = new Libro("Hola", "Yo", 2023);

    @Test
    public void LibroTestOK(){
        String resultado = libro1.imprimir();
        String resultadoOK = "Titulo: HolaAutor: YoAño Publicacion: 2023";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getTituloOK(){
        String resultado = libro1.getTitulo();
        String resultadoOK = "Hola";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getAutorOK(){
        String resultado = libro1.getAutor();
        String resultadoOK = "Yo";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getAnioPublicacionOK(){
        int resultado = libro1.getAnioPublicacion();
        int resultadoOK = 2023;
        Assertions.assertEquals(resultado, resultadoOK);
    }
}