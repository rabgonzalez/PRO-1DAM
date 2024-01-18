package ies.puerto.Ejercicio2;

public class Circulo implements FormaGeometrica {
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
