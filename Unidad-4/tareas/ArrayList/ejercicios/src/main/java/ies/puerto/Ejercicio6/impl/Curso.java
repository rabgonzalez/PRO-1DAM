package ies.puerto.Ejercicio6.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ies.puerto.Ejercicio3.imp.Alumno;

public class Curso {
    static List<Alumno> alumnos;
    static Alumno alumno1;
    static Alumno alumno2;
    static Alumno alumno3;

    public static void main(String[] args) {
        alumno1 = new Alumno("Ruben", "Abreu", Arrays.asList(8f, 9f, 10f, 7f));
        alumno2 = new Alumno("Raul", "Gonzalez", Arrays.asList(5f, 3f, 8f, 2f));
        alumno3 = new Alumno("NoSoyRuben", "Abreu", Arrays.asList(8f, 9f, 10f, 7f));

        alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);

        añadirAlumnos(alumno3);
        System.out.println(alumnos);

        eliminarAlumnos(alumno2);
        System.out.println(alumnos);

        System.out.println("Media de la clase: " +media());
    }

    public static void eliminarAlumnos(Alumno alumno){
        alumnos.remove(alumno);
    }

    public static void añadirAlumnos(Alumno alumno){
        alumnos.add(alumno);
    }

    public static float media() {
        float resultado = 0f;
        if(alumnos.isEmpty()){
            return resultado;
        }

        for(Alumno alumno : alumnos) {
            resultado += alumno.media();
        }
        
        return resultado/alumnos.size();
    }
}
