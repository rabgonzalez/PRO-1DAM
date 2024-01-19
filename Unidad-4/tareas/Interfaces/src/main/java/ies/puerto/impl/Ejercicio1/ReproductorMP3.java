package ies.puerto.impl.Ejercicio1;

import ies.puerto.interfaz.Ejercicio1.IReproductor;

public class ReproductorMP3 implements IReproductor {
    @Override
    public String reproducir(){
        return "Reproduciendo Mp3";
    }

    @Override
    public String detener(){
        return "Deteniendo Mp3";
    }
}
