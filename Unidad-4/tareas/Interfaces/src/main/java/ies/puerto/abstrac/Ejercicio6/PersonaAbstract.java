package ies.puerto.abstrac.Ejercicio6;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class PersonaAbstract {
    private String nombre;
    private String fechaNacimiento;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaAbstract(){}

    public PersonaAbstract(String nombre, String fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long anios() throws ParseException {
        Date fechaActual = new Date();
        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try{
            date = formato.parse(fechaNacimiento);
        } catch (ParseException e){
            throw new ParseException("Formato de fecha incorrecto", 0);
        }

        long diferencia = fechaActual.getTime()-date.getTime();
        long age = diferencia/(1000*3600L*24*30*12);
        return age;
    }

    @Override
    public String toString(){
        return "Soy una persona";
    }
}
