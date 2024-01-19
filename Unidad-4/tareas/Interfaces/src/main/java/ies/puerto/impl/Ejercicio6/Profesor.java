package ies.puerto.impl.Ejercicio6;

import ies.puerto.abstrac.Ejercicio6.EmpleadoAbstract;

public class Profesor extends EmpleadoAbstract {
    private String especialidad;

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(){}

    public Profesor(String nombre, String fechaNacimiento, float salario, String trabajo, String especialidad){
        super(nombre, fechaNacimiento, salario, trabajo);
        this.especialidad = especialidad;
    }

    @Override
    public String trabajar(){
        return "tabajando como "+getTrabajo();
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+", Fecha Nac: "+getFechaNacimiento()+ ", especialidad: "+especialidad;
    }

    public String impartirClase(){
        return "impartiendo clase...";
    }
}
