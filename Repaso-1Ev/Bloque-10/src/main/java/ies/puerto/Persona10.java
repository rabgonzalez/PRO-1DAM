package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Persona10{
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

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

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getDni(){
        return this.dni;
    }

    public Persona10(){}

    public Persona10(String nombre){
        this.nombre = nombre;
    }

    public Persona10(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona10(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona10(String nombre, String apellido, int edad, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public static void main(String[] args) {
        Persona10 persona = new Persona10("Ruben", "Abreu", 18, "43390137Y");
        persona.setDni("12345678A");

        System.out.println(validarDni(persona.getDni()));
    }

    public static String validarDni(String dni){
        String regex = "\\d{8}[A-Z]";
        Pattern pattern = Pattern.compile(regex);

        String result = "Formato de DNI incorrecto";
        if(pattern.matches(regex, dni)){
            result = "Formato correcto";
        }
        return result;
    }
}