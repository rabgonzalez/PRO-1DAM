package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Introduce una cadena de texto: ");
        text = scanner.nextLine();
        System.out.println("Introduce un valor a cambiar: ");
        String value = scanner.nextLine();
        System.out.println("Introduce el valor que se sustituya: ");
        String change = scanner.nextLine();

        String finalText = text.replaceAll(value, change);

        System.out.println(finalText);
    }
}