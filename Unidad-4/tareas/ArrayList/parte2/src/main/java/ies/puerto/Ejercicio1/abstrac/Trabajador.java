package ies.puerto.Ejercicio1.abstrac;

import java.util.Objects;

public abstract class Trabajador extends Persona {
    private String nombre;
    private float salario;
    
    public Trabajador(){}

    public Trabajador(String dni) {
        super(dni);
    }

    public Trabajador(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento);
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
        return "nombre: "+getNombre()+"/ dni: "+getDni()+"/ fechaNacimiento: "+getFechaNacimiento();
    }
}
