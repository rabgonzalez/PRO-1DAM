package ies.puerto.Ejercicio6;

import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.impl.Ejercicio6.Alumno;
import ies.puerto.impl.Ejercicio6.Profesor;


public class Ejercicio6Test {
    static Profesor profesor;
    static Alumno alumno;
    
    @BeforeAll
    public static void BeforeAll() {
        profesor = new Profesor("Jonay", "07/02/2005", 2000, "Profesor", "Programación");
        alumno = new Alumno("Ruben", "28/11/2005", "1ºDAM");
    }

    @Test
    public void profesorToStringOk(){
        String resultado = profesor.toString();
        String resultadoOk = "Nombre: Jonay, Fecha Nac: 07/02/2005, especialidad: Programación";
        Assertions.assertEquals(resultado, resultadoOk);
    }

    @Test
    public void trabajarOk(){
        String resultado = profesor.trabajar();
        String resultadoOk = "trabajando como Profesor";
        Assertions.assertEquals(resultado, resultadoOk);
    }

    @Test
    public void calcularSalarioOk(){
        String resultado = profesor.calcularSalario();
        String resultadoOk = "Salario: 2000.0";
        Assertions.assertEquals(resultado, resultadoOk);
    }

    @Test
    public void impartirClaseOk(){
        String resultado = profesor.impartirClase();
        String resultadoOk = "impartiendo clase...";
        Assertions.assertEquals(resultado, resultadoOk);
    }

    @Test
    public void profesorAniosOk() throws ParseException {
        long resultado = profesor.anios();
        long resultadoOk = 18;
        Assertions.assertEquals(resultado, resultadoOk);
    }


    @Test
    public void alumnoToStringOk(){
        String resultado = alumno.toString();
        String resultadoOk = "Nombre: Ruben, Fecha Nac: 28/11/2005";
        Assertions.assertEquals(resultado, resultadoOk);
    }

    @Test
    public void estudiarOk(){
        String resultado = alumno.estudiar();
        String resultadoOk = "estudiando para 1ºDAM";
        Assertions.assertEquals(resultado, resultadoOk);
    }

    @Test
    public void alumnoAniosOk() throws ParseException {
        long resultado = alumno.anios();
        long resultadoOk = 18;
        Assertions.assertEquals(resultado, resultadoOk);
    }
}

