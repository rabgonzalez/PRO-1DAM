package ies.puerto.Abstract;

public class App {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    static Rectangulo rectangulo;

    public static void main(String[] args) {
        cuadrado = new Cuadrado(5.0f);
        System.out.println(cuadrado);
        mostrarArea(cuadrado);

        System.out.println();
        
        triangulo = new Triangulo(10f, 5f);
        System.out.println(triangulo);
        mostrarArea(triangulo);

        System.out.println();

        rectangulo = new Rectangulo(4f, 3f);
        System.out.println(rectangulo);
        System.out.println(rectangulo.calcularArea());
    }

    public static void mostrarArea(Figura figura){
        System.out.println(figura.calcularArea());
    }
}
