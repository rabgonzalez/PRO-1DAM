package ies.puerto;

public class Persona1{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona1(){}

    public Persona1(String nombre){
        this.nombre = nombre;
    }

    public Persona1(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona1(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[] args){
        Persona1 persona1 = new Persona1("Jonay");
        Persona1 persona2 = new Persona1("Alba", "Abreu");
        Persona1 persona3 = new Persona1("Rubén", "Abreu", 18);
        System.out.println(mostrarInformacion(persona1.nombre));
        System.out.println(mostrarInformacion(persona2.nombre, persona2.apellido));
        System.out.println(mostrarInformacion(persona3.nombre, persona3.apellido, persona3.edad));
    }

    public static String mostrarInformacion(String nombre){
        String result = "Nombre: "+nombre;
        return result;
    }

    public static String mostrarInformacion(String nombre, String apellido){
        String result = "Nombre: "+nombre+"\nApellido: "+apellido;
        return result;
    }

    public static String mostrarInformacion(String nombre, String apellido, int edad){
        String result = "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+" años";
        return result;
    }
}