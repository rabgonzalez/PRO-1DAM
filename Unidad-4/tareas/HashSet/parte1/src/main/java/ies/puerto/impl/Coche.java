package ies.puerto.impl;

import ies.puerto.abstrac.Vehiculo;
import ies.puerto.interfaz.IVehiculo;

import java.util.Objects;

public class Coche extends Vehiculo implements IVehiculo {
    public Coche(){}

    public Coche(int velocidad){
        super(velocidad);
    }

    public Coche(String marca, String modelo, String matricula, int velocidad){
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coche)) {
            return false;
        }
        Coche coche = (Coche) o;
        return Objects.equals(getMatricula(), coche.getMatricula());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString(){
        return "Soy un coche\nmarca= "+getMarca()+", modelo= "+getModelo()+", matricula= "+getMatricula()+", velocidad= "+getVelocidad();
    }

    @Override
    public int velocidadMaxima(){
        return 180;
    }
}
