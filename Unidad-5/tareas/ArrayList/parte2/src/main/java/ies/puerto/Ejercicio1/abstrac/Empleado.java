package ies.puerto.Ejercicio1.abstrac;

public abstract class Empleado extends Trabajador {
    
    public Empleado(){}

    public Empleado(String dni) {
        super(dni);
    }

    public Empleado(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento, salario);
    }
}
