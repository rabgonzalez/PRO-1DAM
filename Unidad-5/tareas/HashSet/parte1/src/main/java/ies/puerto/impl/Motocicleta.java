package ies.puerto.impl;

import java.util.Objects;

import ies.puerto.abstrac.Vehiculo;
import ies.puerto.interfaz.IVehiculo;

public class Motocicleta extends Vehiculo implements IVehiculo {
    public Motocicleta(){}

    public Motocicleta(String matricula){
        super(matricula);
    }

    public Motocicleta(String marca, String modelo, String matricula, int velocidad){
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motocicleta)) {
            return false;
        }
        Motocicleta motocicleta = (Motocicleta) o;
        return Objects.equals(getMatricula(), motocicleta.getMatricula());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString(){
        return "marca= "+getMarca()+", modelo= "+getModelo()+", matricula= "+getMatricula()+", velocidad= "+getVelocidad();
    }

    @Override
    public int velocidadMaxima(){
        return 120;
    }
}
