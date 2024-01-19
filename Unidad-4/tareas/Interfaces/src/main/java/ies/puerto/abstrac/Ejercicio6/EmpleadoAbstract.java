package ies.puerto.abstrac.Ejercicio6;

import ies.puerto.interfaz.Ejercicio6.ITrabajador;

public abstract class EmpleadoAbstract extends PersonaAbstract implements ITrabajador {
    private float salario;
    private String trabajo;

    public String getTrabajo() {
        return this.trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public EmpleadoAbstract(){}

    public EmpleadoAbstract(String nombre, String fechaNacimiento, float salario, String trabajo){
        super(nombre, fechaNacimiento);
        this.salario = salario;
        this.trabajo = trabajo;
    }

    public String calcularSalario(){
        return "Salario: "+getSalario();
    }
    
    @Override
    public String toString() {
        return "Nombre: "+getNombre()+", Fecha Nac: "+getFechaNacimiento()+ ", salario: "+salario;
    }
}
