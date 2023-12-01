package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String texto;
        System.out.print("Introduce una cadena de texto: ");
        texto = lectura.nextLine();

        int longitud = texto.length();
        System.out.println(longitud);
    }
}