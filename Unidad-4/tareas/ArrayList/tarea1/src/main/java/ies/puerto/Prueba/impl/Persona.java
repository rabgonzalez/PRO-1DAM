package ies.puerto.Prueba.impl;
import java.util.Objects;

import ies.puerto.Prueba.app.AppPersona;

public class Persona extends AppPersona {
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private double nota;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, double nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nota = nota;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Persona dni(String dni) {
        setDni(dni);
        return this;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona apellido1(String apellido1) {
        setApellido1(apellido1);
        return this;
    }

    public Persona apellido2(String apellido2) {
        setApellido2(apellido2);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido1, persona.apellido1) && Objects.equals(apellido2, persona.apellido2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "{dni: "+getDni()+", nombre: "+getNombre()+", apellidos: "+getApellido1()+getApellido2()+"}";
    } 
}
