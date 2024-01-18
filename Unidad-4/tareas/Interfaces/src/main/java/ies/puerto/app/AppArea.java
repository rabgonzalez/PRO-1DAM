package ies.puerto.app;

import ies.puerto.impl.Ejercicio2.Circulo;
import ies.puerto.impl.Ejercicio2.Rectangulo;

public class AppArea {
    static Circulo circulo;
    static Rectangulo rectangulo;

    public static void main(String[] args) {
        circulo = new Circulo(5);
        System.out.println(circulo.calcularArea());

        rectangulo = new Rectangulo(4, 6);
        System.out.println(rectangulo.calcularArea());
    }
}
