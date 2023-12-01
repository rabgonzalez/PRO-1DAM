package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Introduce una cadena de texto: ");
        text = scanner.nextLine();

        boolean start = text.startsWith("Hola");
        boolean end = text.endsWith("Mundo!");

        System.out.println(start + ", " +end);
    }
}