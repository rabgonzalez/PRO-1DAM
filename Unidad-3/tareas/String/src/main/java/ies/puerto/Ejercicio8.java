package ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Introduce una cadena de texto: ");
        text = scanner.nextLine();
        
        System.out.println(text.toLowerCase() + " " +text.toUpperCase());
    }
}