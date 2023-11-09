package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest{

    Libro libro1;
    String Titulo;
    String Autor;
    int AnioPublicacion;

    @BeforeEach
    public void BeforeEach(){
        libro1 = new Libro(Titulo, Autor, AnioPublicacion);
    }

    @Test
    public void LibroTestOK(){
        libro1.imprimir();
        String resultado = libro1.imprimir();
        String resultadoOK = "Titulo: HolaAutor: YoAño Publicacion: 2023";
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void setAnioPublicacionTestOK(){
        libro1.setAnioPublicacion(10);
        int resultado = libro1.getAnioPublicacion();
        int resultadoOK = 10;
        Assertions.assertEquals(resultadoOK, resultado, "mal");
    }
}