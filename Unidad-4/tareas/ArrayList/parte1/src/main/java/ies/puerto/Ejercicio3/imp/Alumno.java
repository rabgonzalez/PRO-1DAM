package ies.puerto.Ejercicio3.imp;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Float> calificaciones;

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

    public List<Float> getCalificaciones() {
        return this.calificaciones;
    }

    public void setCalificaciones(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Alumno(){}

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = new ArrayList<>();
    }

    public Alumno(String nombre, String apellido, List<Float> calificaciones) {
    this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
    }

    public float media() {
        float resultado = 0;

        if(calificaciones.isEmpty()) {
            return resultado;
        }

        for (float calificacion : calificaciones) {
            resultado += calificacion;
        }
        return resultado/calificaciones.size();
    }

    @Override
    public String toString(){
        return "Alumno: "+nombre+" "+apellido;
    }
}
