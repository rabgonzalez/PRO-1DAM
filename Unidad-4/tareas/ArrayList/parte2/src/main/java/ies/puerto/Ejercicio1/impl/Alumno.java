package ies.puerto.Ejercicio1.impl;

import java.util.List;

import ies.puerto.Ejercicio1.abstrac.Persona;

public class Alumno extends Persona {
    private List<Nota> notas;

    public Alumno(List<Nota> notas) {
        this.notas = notas;
    }

    public Alumno() {}

    public Alumno(String dni) {
        super(dni);
    }

    public Alumno(String nombre, String dni, String fechaNacimiento, List<Nota> notas) {
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    public float notaMasAlta() {
        float notaMaxima = 0;

        for(Nota nota : notas) {
            if(nota.getValor() > notaMaxima) {
                notaMaxima = nota.getValor();
            }
        }
        return notaMaxima;
    }

    public float notaMedia() {
        float resultado=0f;
        for(Nota nota:notas){
            resultado+=nota.getValor();
        }
        return resultado/notas.size();
    }

    @Override
    public String toString() {
        return "nombre: "+getNombre()+" / dni: "+getDni()+" / fechaNacimiento: "+getFechaNacimiento()+"\nnotas: "+notas;
    }
}