package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String texto1;
        String texto2;
        System.out.print("Introduce una cadena de texto: ");
        texto1 = lectura.nextLine();
        System.out.print("Introduce una cadena de texto: ");
        texto2 = lectura.nextLine();

        boolean comparacion = texto1.equals(texto2);
        System.out.println(comparacion);
    }
}