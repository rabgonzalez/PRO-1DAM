package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest{

    Persona persona1 = new Persona("Jose", 23, "jose@gmail.com", 123456789);
    Persona persona2 = new Persona("Pepe", 19, "pepe@gmail.com", 987654321);

    @Test
    public void PersonaTest1OK(){
        String resultado = persona1.imprimir();
        String resultadoOK = "Nombre: Jose Edad: 23 Email: jose@gmail.com Telefono: 123456789";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void PersonaTest2OK(){
        String resultado = persona2.imprimir();
        String resultadoOK = "Nombre: Pepe Edad: 19 Email: pepe@gmail.com Telefono: 987654321";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getNombreOK(){
        String resultado = persona1.getNombre();
        String resultadoOK = "Jose";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void setNombre(){
        persona1.setNombre("Pedro");
        String resultado = persona1.getNombre();
        String resultadoOK = "Pedro";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getEdad(){
        int resultado = persona1.getEdad();
        int resultadoOK = 23;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getEmail(){
        String resultado = persona1.getEmail();
        String resultadoOK = "jose@gmail.com";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getTelefono(){
        int resultado = persona2.getTelefono();
        int resultadoOK = 987654321;
        Assertions.assertEquals(resultado, resultadoOK);
    }
}
