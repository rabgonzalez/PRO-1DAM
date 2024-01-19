package ies.puerto.app.Ejercicio6;

import java.text.ParseException;

import ies.puerto.impl.Ejercicio6.Alumno;
import ies.puerto.impl.Ejercicio6.Profesor;

public class App {
    static Profesor profesor;
    static Alumno alumno;
    
    public static void main(String[] args) throws ParseException{
        profesor = new Profesor("Raul", "22/05/1998", 2000, "Profesor", "Programación");
        System.out.println(profesor.toString());
        System.out.println(profesor.trabajar());
        System.out.println(profesor.calcularSalario());
        System.out.println("Tu edad es: "+profesor.anios()+" años");
        System.out.println(profesor.impartirClase());

        System.out.println();

        alumno = new Alumno("Ruben", "28/11/2005", "1ºDAM");
        System.out.println(alumno.toString());
        System.out.println(alumno.estudiar());
        System.out.println("Tu edad es: "+alumno.anios()+" años");
    }
}
