package ies.puerto.Ejercicio1.app;

import java.util.ArrayList;
import java.util.Arrays;

import ies.puerto.Ejercicio1.abstrac.Persona;
import ies.puerto.Ejercicio1.impl.Alumno;

public class AppPersona {
    static Persona persona;
    static Alumno alumno;

    public static void main(String[] args) {
        alumno = new Alumno("Ruben", "434990018P", "28/11/2024");
    }
}
