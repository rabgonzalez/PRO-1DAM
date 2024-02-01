package ies.puerto.Ejercicio3.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ies.puerto.Ejercicio3.imp.Alumno;
import ies.puerto.Ejercicio3.imp.Aula;

public class AppAlumno {
    static Aula dam;

    public static void main(String[] args) {
        dam = new Aula("1DAM");

        Alumno alumno1 = new Alumno("nombre1", "apellido1", Arrays.asList(1f, 5f, 7f, 8f));
        Alumno alumno2 = new Alumno("nombre2", "apellido2", Arrays.asList(7f, 9f, 10f, 6f));
        
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);

        dam.setAlumnos(alumnos);
        System.out.println("Media Aula: "+dam.media());
    }
}