package ies.puerto;

import java.util.Scanner;


public class Ejercicio68{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        scanner.close();

        double multiply = num1 * num2;
        String result = "El resultado de la multiplicación es igual a "+multiply;
        System.out.println(result);
    }
}