package ies.puerto;

public class Alumno extends Persona {
    private int curso;
    private int nota;

    public Alumno(String nombre, int edad, String dni, int curso, int nota){
        super(nombre, edad, dni);
        this.curso = curso;
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nDNI: "+getDni()+"\nCurso: "+curso+"\nNota: "+nota;    
    }
}
