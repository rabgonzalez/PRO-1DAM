package ies.puerto.Ejercicio1.impl;

import java.util.List;

import ies.puerto.Ejercicio1.abstrac.Persona;

public class Alumno extends Persona {
    private List<Float> notas;

    public Alumno(List<Float> notas) {
        this.notas = notas;
    }

    public Alumno() {}

    public Alumno(String dni) {
        super(dni);
    }

    public Alumno(String nombre, String dni, String fechaNacimiento, List<Float> notas) {
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    public float notaMasAlta() {
        float notaMaxima = 0;

        for(Float nota : notas) {
            if(nota > notaMaxima) {
                notaMaxima = nota;
            }
        }
        return notaMaxima;
    }
}
