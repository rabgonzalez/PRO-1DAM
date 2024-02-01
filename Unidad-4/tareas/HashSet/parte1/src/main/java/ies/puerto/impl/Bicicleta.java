package ies.puerto.impl;

import ies.puerto.abstrac.Vehiculo;
import java.util.Objects;

public class Bicicleta extends Vehiculo {
    public Bicicleta(){}

    public Bicicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bicicleta)) {
            return false;
        }
        Bicicleta bicicleta = (Bicicleta) o;
        return Objects.equals(getMatricula(), bicicleta.getMatricula());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Soy una bicicleta\nmarca= "+getMarca()+", modelo= "+getModelo()+", matricula= "+getMatricula()+", velocidad= "+getVelocidad();
    }
    
}
