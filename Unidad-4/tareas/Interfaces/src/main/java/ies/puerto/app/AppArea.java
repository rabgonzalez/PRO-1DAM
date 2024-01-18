package ies.puerto.app;

import ies.puerto.impl.Ejercicio2.Circulo;
import ies.puerto.impl.Ejercicio2.Cuadrado;
import ies.puerto.impl.Ejercicio2.Rectangulo;
import ies.puerto.interfaz.IFormaGeometrica;

public class AppArea {
    static IFormaGeometrica circulo;
    static IFormaGeometrica rectangulo;
    static IFormaGeometrica cuadrado;

    public static void main(String[] args) {
        rectangulo = new Rectangulo(7f, 6f);
        System.out.println("Área rectangulo: "+rectangulo.calcularArea());

        circulo = new Circulo(5f);
        System.out.println("Área circulo: "+circulo.calcularArea());

        cuadrado = new Cuadrado(5f);
        System.out.println("Área cuadrado: "+cuadrado.calcularArea());
    }
}
