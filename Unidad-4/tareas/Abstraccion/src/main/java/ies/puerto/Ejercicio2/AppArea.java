package ies.puerto.Ejercicio2;

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
