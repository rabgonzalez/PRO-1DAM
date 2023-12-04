package ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Introduce un valor numérico:");
        number = scanner.nextInt();
        
        String numberParsed = Integer.toString(number);
        int multiply = 0;
        for(int i = 0; i < numberParsed.length(); i++){
            int position = numberParsed.charAt(i);
            multiply *= position;
        }
        System.out.println(multiply);
    }
}