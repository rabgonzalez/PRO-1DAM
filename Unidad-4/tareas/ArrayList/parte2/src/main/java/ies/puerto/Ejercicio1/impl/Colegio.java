package ies.puerto.Ejercicio1.impl;

import java.text.ParseException;
import java.util.List;
import java.util.Objects;

public class Colegio {
    private String nombre;
    private String direccion;
    private String ubicacion;
    private List<Aula> aulas;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Colegio)) {
            return false;
        }
        Colegio colegio = (Colegio) o;
        return Objects.equals(nombre, colegio.nombre) && Objects.equals(direccion, colegio.direccion) && Objects.equals(ubicacion, colegio.ubicacion) && Objects.equals(aulas, colegio.aulas);
    }

    @Override
    public String toString() {
        return "nombre= "+getNombre()+", direccion= "+getDireccion()+", ubicacion= "+getUbicacion()+"\naulas= "+getAulas();
    }

    public Colegio(String nombre, String direccion, String ubicacion, List<Aula> aulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.aulas = aulas;
    }

    public Colegio() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Aula> getAulas() {
        return this.aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public float notaMasAltaColegio() {
        float notaMaximaColegio = 0f;
        for(Aula aula:aulas){
            if(aula.notaMasAltaAula() > notaMaximaColegio){
                notaMaximaColegio = aula.notaMasAltaAula();
            }
        }
        return notaMaximaColegio;
    }

    public float notaMediaColegio() {
        float resultado = 0f;
        for(Aula aula:aulas){
            if(aula.notaMediaAula(aula) > resultado){
                resultado += aula.notaMediaAula(aula);
            }
        }
        return resultado/aulas.size();
    }

    public float salarioMedioProfesores() {
        float salarioTotal=0f;
        for(Aula aula:aulas){
            salarioTotal += aula.getProfesor().getSalario();
        }
        return salarioTotal/aulas.size();
    }

    public float salarioMaximoProfesores() {
        float resultado=0f;
        for(Aula aula:aulas){
            if(aula.getProfesor().getSalario() > resultado){
                resultado = aula.getProfesor().getSalario();
            }
        }
        return resultado;
    }

    public float salarioMinimoProfesores() {
        float resultado=salarioMaximoProfesores();
        for(Aula aula:aulas){
            if(resultado > aula.getProfesor().getSalario()){
                resultado = aula.getProfesor().getSalario();
            }
        }
        return resultado;
    }

    public float edadMediaAlumno() throws ParseException {
        float edadMediaTotal = 0f;
        int total = 0;
        for(Aula aula:aulas){
            for(Alumno alumno:aula.getAlumnos()){
            edadMediaTotal += alumno.anios();
            total++;
            }
        }
        return edadMediaTotal/total;
    }

    public float edadMediaProfesores() throws ParseException {
        float edadMediaTotal = 0f;
        int total = 0;
        for(Aula aula:aulas){
            edadMediaTotal += aula.getProfesor().anios();
            total++;
        }
        return edadMediaTotal/total;
    }

    public String mostrarInformacion(String dni) {
        for(Aula aula : aulas) {
            if(aula.getProfesor().getDni().equals(dni)){
                return aula.getProfesor().toString();
            } else {
                for(Alumno alumno : aula.getAlumnos()){
                    if(alumno.getDni().equals(dni)){
                        return alumno.toString();
                    }
                }
            }
        }
        return "USuario no encontrado";
    }
}