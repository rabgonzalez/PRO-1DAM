package ies.puerto;

public class AppAlumno {
    static Alumno alumno;

    public static void main(String[] args) {
        alumno = new Alumno();
        System.out.println(alumno.saludar());
    }
}
