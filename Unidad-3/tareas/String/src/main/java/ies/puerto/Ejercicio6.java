package ies.puerto;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Introduce una cadena de texto: ");
        text = scanner.nextLine();
        String [] parts;

        for(int i=0; i < text.length(); i++){
            parts = text.split(" ");
            System.out.println(parts[i]);
        }
    }
}