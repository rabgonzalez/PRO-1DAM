package ies.puerto.Ejercicio2;

public class Rectangulo implements FormaGeometrica {
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
