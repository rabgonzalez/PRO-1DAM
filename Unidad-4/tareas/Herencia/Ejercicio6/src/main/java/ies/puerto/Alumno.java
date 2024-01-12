package ies.puerto;

public class Alumno extends Autenticacion {
    private int curso;
    private int nota;

    public Alumno(String nombre, int edad, String dni, int curso, int nota){
        super(nombre, edad, dni);
        this.curso = curso;
        this.nota = nota;
    }

    @Override
    public String toString() {
        String result = "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nDNI: N/A\nCurso: "+curso+"\nNota: "+nota;
        if(credencialOK()){
            result = "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nDNI: "+getDni()+"\nCurso: "+curso+"\nNota: "+nota;
        }
        return result;
    }
}