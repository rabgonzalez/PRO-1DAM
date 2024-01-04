package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Persona2Test {
    Persona2 persona2 = new Persona2("Rubén", "Abreu", 18);

    @Test
    public void infoTest(){
        persona2.setNombre("Carlos");
        String nombre = persona2.getNombre();
        persona2.setApellido("Hernandez");
        String apellido = persona2.getApellido();
        persona2.setEdad(50);
        int edad = persona2.getEdad();

        String result = persona2.mostrarInformacion(nombre, apellido, edad);
        String resultOk = "Nombre: Carlos\nApellido: Hernandez\nEdad: 50 años";
        Assertions.assertEquals(result, resultOk);
    }
}
