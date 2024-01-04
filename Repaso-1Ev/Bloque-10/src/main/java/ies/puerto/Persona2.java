package ies.puerto;

public class Persona2{
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

    public Persona2(){}

    public Persona2(String nombre){
        this.nombre = nombre;
    }

    public Persona2(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona2(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[] args){
        Persona2 persona1 = new Persona2("Jonay");
        Persona2 persona2 = new Persona2("Alba", "Abreu");
        Persona2 persona3 = new Persona2("Rubén", "Abreu", 18);
        persona1.setNombre("Carlos");
        System.out.println(mostrarInformacion(persona1.getNombre()));
        persona2.setApellido("Hernandez");
        System.out.println(mostrarInformacion(persona2.getNombre(), persona2.getApellido()));
        persona3.setEdad(22);
        System.out.println(mostrarInformacion(persona3.getNombre(), persona3.getApellido(), persona3.getEdad()));
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