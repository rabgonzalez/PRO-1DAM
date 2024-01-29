package ies.puerto.Ejercicio1.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ies.puerto.Ejercicio1.impl.Alumno;
import ies.puerto.Ejercicio1.impl.Aula;
import ies.puerto.Ejercicio1.impl.Colegio;
import ies.puerto.Ejercicio1.impl.Nota;
import ies.puerto.Ejercicio1.impl.Profesor;

public class AppPersona {
    static List<Aula> aulasColegio;
    static List<Alumno> alumnosAula;
    static List<Nota> notasAlumno1;
    static Nota nota1;
    static Alumno alumno;
    static Profesor profesor;
    static Aula aula;
    static Colegio colegio;

    public static void main(String[] args) throws Exception{
        nota1 = new Nota("Economía", 6f);
        Nota nota2 = new Nota("Ingles", 7f);
        Nota nota3 = new Nota("Mates", 9f);

        Nota nota4 = new Nota("Economía", 2f);
        Nota nota5 = new Nota("Ingles", 7f);
        Nota nota6 = new Nota("Mates", 6f);

        Nota nota7 = new Nota("Economía", 9f);
        Nota nota8 = new Nota("Ingles", 10f);
        Nota nota9 = new Nota("Mates", 8f);

        Nota nota10 = new Nota("Economía", 6f);
        Nota nota11 = new Nota("Ingles", 3f);
        Nota nota12 = new Nota("Mates", 5f);

        notasAlumno1 = new ArrayList<>(Arrays.asList(nota1, nota2, nota3));
        List<Nota> notasAlumno2 = new ArrayList<>(Arrays.asList(nota4, nota5, nota6));
        List<Nota> notasAlumno3 = new ArrayList<>(Arrays.asList(nota7, nota8, nota9));
        List<Nota> notasAlumno4 = new ArrayList<>(Arrays.asList(nota10, nota11, nota12));

        alumno = new Alumno("Ruben", "434990018P", "28/11/2005", notasAlumno1);
        Alumno alumno2 = new Alumno("Daniel", "12345678B", "18/02/2006", notasAlumno2);
        Alumno alumno3 = new Alumno("Jose", "12345678Y", "04/01/2004", notasAlumno3);
        Alumno alumno4 = new Alumno("Pablo", "9116315P", "26/01/2005", notasAlumno4);

        profesor = new Profesor("Eduardo", "43388666V", "18/04/2006", 2000, "Economía");
        Profesor profesor2 = new Profesor("Carlos", "5567819U", "26/07/1987", 3700, "Inglés");

        alumnosAula = new ArrayList<>();
        alumnosAula.add(alumno);
        alumnosAula.add(alumno2);

        List<Alumno> alumnosAula2 = new ArrayList<>();
        alumnosAula2.add(alumno3);
        alumnosAula2.add(alumno4);

        aula = new Aula("1DAM", profesor, alumnosAula);
        Aula aula2 = new Aula("1DAW", profesor2, alumnosAula2);

        aulasColegio = new ArrayList<>();
        aulasColegio.add(aula);
        aulasColegio.add(aula2);

        colegio = new Colegio("Ies Telesforo Bravo", "Puerto de la Cruz", "Tenerife", aulasColegio);
        
        System.out.println("NOTA MÁXIMA ALUMNOS DEL COLEGIO");
        System.out.println(colegio.notaMasAltaColegio());

        System.out.println();
        System.out.println("NOTA MEDIA DE UNA CLASE ESPECÍFICA");
        System.out.println(aula.notaMediaAula());

        System.out.println();
        System.out.println("NOTA MEDIA DE TODO EL COLEGIO");
        System.out.println(colegio.notaMediaColegio());

        System.out.println();
        System.out.println("SALARIO MEDIO PROFESORES");
        System.out.println(colegio.salarioMedioProfesores());

        System.out.println();
        System.out.println("SALARIO MÁXIMO Y MÍNIMO DE LOS PROFESORES");
        System.out.println("Salario máximo: "+colegio.salarioMaximoProfesores());
        System.out.println("Salario máximo: "+colegio.salarioMinimoProfesores());

        System.out.println();
        System.out.println("INFORMACION DE PROFE/ALUMNO POR DNI");
        System.out.println(colegio.mostrarInformacion("5567819U"));

        System.out.println();
        System.out.println("EDAD MEDIA PROFESORES Y ALUMNOS");
        System.out.println("Edad media alumnos: "+colegio.edadMediaAlumno());
        System.out.println("Edad media profesores: "+colegio.edadMediaProfesores());
    }
}