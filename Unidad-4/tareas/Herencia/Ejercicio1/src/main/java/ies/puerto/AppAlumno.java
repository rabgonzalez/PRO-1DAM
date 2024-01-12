package ies.puerto;

public class AppAlumno {
    static Alumno alumno;

    public static void main(String[] args) {
        alumno = new Alumno("Ruben", 18, "43490018P");
        System.out.println(alumno.toString());
    }
}
