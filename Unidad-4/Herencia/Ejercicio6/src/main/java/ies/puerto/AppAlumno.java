package ies.puerto;

public class AppAlumno {
    static Alumno alumno;

    public static void main(String[] args) {
        alumno = new Alumno("Ruben", 18, "43192971", 1, 10);
        System.out.println(alumno.toString());
    }
}