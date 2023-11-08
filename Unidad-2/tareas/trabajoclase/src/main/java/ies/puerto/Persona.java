package ies.puerto;
/**
 * Clase con sus objetos
 * @author rabgonzalez
 */
public class Persona{
    private String nombre;
    private int edad;
    private String email;
    private int telefono;
    
    /**
     * Constructor por defecto
     */
    public Persona(){}
        
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
    public String getEmail() {
        return this.email;
    }

    /**
     * Metodo que imprime los resultados
     * @return informacion persona
     */
    public String imprimir(){
        return "Nombre: " + nombre + " " + "Edad: " + edad + " " + "Email: " + email + " " + "Telefono: " + telefono;
    }
}
    