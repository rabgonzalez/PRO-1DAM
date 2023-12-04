package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int number = scanner.nextInt();

        String numberParsed = Integer.toString(number);
        int textParsed = Integer.parseInt(numberParsed);
        System.out.println("El numero es: "+numberParsed+ ", y el texto es "+textParsed);
    }
}