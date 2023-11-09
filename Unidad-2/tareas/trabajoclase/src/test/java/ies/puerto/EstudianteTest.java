package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudianteTest{
    
    Estudiante estudiante1 = new Estudiante("Ruben", "Programacion", 17, 10);

    @Test
    public void detallesTest(){
        String resultado = estudiante1.detalles();
        String resultadoOK = "Nombre: RubenEdad: 17Carrera: Programacion";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void verificarAprobadoTest(){
        boolean resultado = estudiante1.verificarAprobado();
        boolean resultadoOK = true;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getPromedio(){
        int resultado = estudiante1.getPromedio();
        int resultadoOK = 10;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void verificarAprobadoTestOK(){
        estudiante1.setPromedio(4);
        boolean resultado = estudiante1.verificarAprobado();
        boolean resultadoOK = false;
        Assertions.assertEquals(resultadoOK, resultado);
    }
}
