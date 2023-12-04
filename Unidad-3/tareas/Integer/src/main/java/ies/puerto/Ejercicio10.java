package ies.puerto;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Introduce un valor numérico:");
        text = scanner.nextLine();

        try{
            int textParsed = Integer.parseInt(text);
            System.out.println("Ha salido bien");
        } catch(NumberFormatException e){
            System.out.println("No se puede introducir texto");
        }
    }
}