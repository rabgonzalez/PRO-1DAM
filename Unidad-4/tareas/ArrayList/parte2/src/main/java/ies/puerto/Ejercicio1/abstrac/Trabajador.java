package ies.puerto.Ejercicio1.abstrac;

import java.util.Objects;

public abstract class Trabajador extends Persona {
    private String nombre;
    private float salario;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public Trabajador(){}

    public Trabajador(String dni) {
        super(dni);
    }

    public Trabajador(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento);
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(getDni(), persona.getDni());
    }

    @Override
    public String toString() {
        return "nombre: "+getNombre()+" / dni: "+getDni()+" / fechaNacimiento: "+getFechaNacimiento();
    }
}