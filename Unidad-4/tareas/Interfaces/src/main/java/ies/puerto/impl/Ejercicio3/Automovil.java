package ies.puerto.impl.Ejercicio3;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {
    @Override
    public void arrancar(){
        System.out.println("Automovil arrancado");
    }

    @Override
    public void detener(){
        System.out.println("Automovil detenido");
    }

    public void conducir(){
        System.out.println("Conduciendo...");
    }
}
