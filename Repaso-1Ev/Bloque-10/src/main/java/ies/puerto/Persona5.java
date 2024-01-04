package ies.puerto;

public class Persona5{
    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona5(){}

    public Persona5(String nombre){
        this.nombre = nombre;
    }

    public Persona5(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona5(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public static String mostrarInformacion(Persona5 persona){
        String result = persona.nombre+" "+persona.apellido+", "+persona.edad+" años";
        return result;
    }

    public static void main(String[] args){
        Persona5 persona1 = new Persona5("Ruben", "Abreu", 18);
        Persona5 persona2 = new Persona5("Jonay", "Contreras", 21);
        Persona5 persona3 = new Persona5("Roberto", "Hernandez", 19);
        Persona5[] personas = {persona1, persona2, persona3};
        
        for(int i = 0; i < personas.length; i++){
            System.out.println(mostrarInformacion(personas[i]));
        }
    }
}