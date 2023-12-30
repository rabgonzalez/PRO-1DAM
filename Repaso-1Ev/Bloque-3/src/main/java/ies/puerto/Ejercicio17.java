package ies.puerto;

import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ahora introduce un numero decimal: ");
        double num2 = scanner.nextDouble();
        scanner.close();

        double sum = num1 + num2;
        System.out.println("La suma es: "+sum);
    }
}