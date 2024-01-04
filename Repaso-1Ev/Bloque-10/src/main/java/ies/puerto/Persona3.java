package ies.puerto;
/**
 * El método para mostrar la información fue realizado en los ejercicios anteriores
 * Por lo que Persona3 es igual que Persona2, ya que no implementa nada nuevo
 * */
public class Persona3{
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

    public Persona3(){}

    public Persona3(String nombre){
        this.nombre = nombre;
    }

    public Persona3(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona3(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[] args){
        Persona3 persona1 = new Persona3("Jonay");
        Persona3 persona2 = new Persona3("Alba", "Abreu");
        Persona3 persona3 = new Persona3("Rubén", "Abreu", 18);
        persona1.setNombre("Carlos");
        System.out.println(mostrarInformacion(persona1.getNombre()));
        persona2.setApellido("Hernandez");
        System.out.println(mostrarInformacion(persona2.getNombre(), persona2.getApellido()));
        persona3.setEdad(22);
        System.out.println(mostrarInformacion(persona3.getNombre(), persona3.getApellido(), persona3.getEdad()));
    }

    //Estos son los métodos "nuevos" que pide el ejercicio
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