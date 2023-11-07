package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Persona{
    private String nombre;
    private int edad;
    private String email;
    private int telefono;

    /**
     * Getters/Setters
     */
    public int getTelefono() {
        return this.telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /** 
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);
    }
    */

    public String imprimir(){
        return "Nombre: " + nombre + "Edad: " + edad + "Email: " + email + "Telefono: " + telefono;
    }

    /**
     * Constructor por defecto de la clase
     */
    public Persona(){
    }

    /**
     * Constructor con el parámetro nombre
     * @param nombre de la persona
     */
    public Persona(String nombre){
        this.nombre =nombre;
    }

    /**
     * Constructor de la clase con el nombre y edad
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona(String nombre, int edad){
        this.nombre =nombre;
        this.edad = edad;
    }

    /**
     * Constructor de la clase
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona(String nombre, int edad, String email){
        this.nombre =nombre;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Constructor de la clase
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona(String nombre, int edad, String email, int telefono){
        this.nombre =nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    Persona persona1 = new Persona("Jose", 23, "jose@gmail.com", 123456789);
    Persona persona2 = new Persona("Pepe", 19, "pepe@gmail.com", 987654321);
    Persona persona3 = new Persona("Rubén", 17, "ruben@gmail.com", 111111111);

}