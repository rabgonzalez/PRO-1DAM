package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    //Constructor por defecto
    public Persona(){}

    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre(){
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

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+dni;
    }
}