package ies.puerto;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Introduce un valor numérico:");
        number = scanner.nextInt();
        
        Integer numberParsed = Integer.valueOf(number);
        String binaryNumber = numberParsed.toBinaryString(number);

        System.out.println(binaryNumber);
    }
}