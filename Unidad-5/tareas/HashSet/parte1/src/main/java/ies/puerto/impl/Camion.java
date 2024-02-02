package ies.puerto.impl;

import ies.puerto.abstrac.Vehiculo;
import ies.puerto.interfaz.IVehiculo;

import java.util.Objects;

public class Camion extends Vehiculo implements IVehiculo {

    public Camion(String matricula){
        super(matricula);
    }

    public Camion(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Camion)) {
            return false;
        }
        Camion camion = (Camion) o;
        return Objects.equals(getMatricula(), camion.getMatricula());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Soy un camion\nmarca= "+getMarca()+", modelo= "+getModelo()+", matricula= "+getMatricula()+", velocidad= "+getVelocidad();
    }

    @Override
    public int velocidadMaxima(){
        return 160;
    }
}
