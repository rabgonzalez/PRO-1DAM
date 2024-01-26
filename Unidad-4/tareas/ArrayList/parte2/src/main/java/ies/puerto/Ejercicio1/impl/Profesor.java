package ies.puerto.Ejercicio1.impl;

import ies.puerto.Ejercicio1.abstrac.Empleado;

public class Profesor extends Empleado {
    private String especialidad;

    public Profesor(){}

    public Profesor(String dni) {
        super(dni);
    }

    public Profesor(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento, salario);
    }
}
