package ies.puerto.impl.Ejercicio2;

import ies.puerto.interfaz.IFormaGeometrica;

public class Rectangulo implements IFormaGeometrica {
    private double base;
    private double altura;

    public Rectangulo(){}

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
}
