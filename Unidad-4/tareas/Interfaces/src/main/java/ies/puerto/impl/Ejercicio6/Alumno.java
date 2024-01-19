package ies.puerto.impl.Ejercicio6;

import ies.puerto.abstrac.Ejercicio6.PersonaAbstract;

public class Alumno extends PersonaAbstract {
    private String nivel;

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Alumno(){}

    public Alumno(String nombre, String fechaNacimiento, String nivel){
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+", Fecha Nac: "+getFechaNacimiento();
    }

    public String estudiar(){
        return "estudiando para "+nivel;
    }
}
