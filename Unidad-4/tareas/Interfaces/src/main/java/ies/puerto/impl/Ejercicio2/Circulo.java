package ies.puerto.impl.Ejercicio2;

import ies.puerto.interfaz.IFormaGeometrica;

public class Circulo implements IFormaGeometrica {
    private double radio;

    public Circulo(){}

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio;
    }
}
