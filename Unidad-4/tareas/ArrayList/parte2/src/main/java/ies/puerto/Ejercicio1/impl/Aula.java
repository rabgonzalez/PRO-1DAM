package ies.puerto.Ejercicio1.impl;

import java.util.List;
import java.util.Objects;

public class Aula {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aula)) {
            return false;
        }
        Aula aula = (Aula) o;
        return Objects.equals(nombre, aula.nombre) && Objects.equals(profesor, aula.profesor) && Objects.equals(alumnos, aula.alumnos);
    }

    @Override
    public String toString() {
        return "nombre= "+getNombre()+", profesor= "+getProfesor()+"\nalumnos= "+getAlumnos() ;
    }

    public Aula(String nombre, Profesor profesor, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public Aula() {
    }

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

    public float notaMasAltaAula() {
        float notaMaximaAula = 0;
        for(Alumno alumno:alumnos){
            if(alumno.notaMasAlta() > notaMaximaAula){
                notaMaximaAula = alumno.notaMasAlta();
            }
        }
        return notaMaximaAula;
    }

    public float notaMediaAula() {
        float resultado = 0f;
        if(alumnos.isEmpty()){
            return resultado;
        }

        for(Alumno alumno:alumnos){
            resultado+=alumno.notaMedia();
        }
        return resultado/alumnos.size();
    }
}