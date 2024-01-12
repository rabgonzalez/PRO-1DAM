package ies.puerto;

public class AppAlumno {
    static Alumno alumno;

    public static void main(String[] args) throws Exception {
        alumno = new Alumno("Ruben", 18, "12345678A", 1, 10);
        
        if(alumno.credencialOK() == false){
            throw new Exception("Formato de DNI incorrecto");
        } else {
            System.out.println(alumno.toString());
        }
    }
}