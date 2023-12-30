package ies.puerto;

import java.util.Scanner;

public class Ejercicio62{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        System.out.println("La suma de " +num1+ " + " +num2+ " es igual a: "+(num1+num2));
    }
}