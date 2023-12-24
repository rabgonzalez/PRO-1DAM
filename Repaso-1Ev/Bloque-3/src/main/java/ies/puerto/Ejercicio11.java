package ies.puerto;

import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        scanner.close();

        float sum = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;
        System.out.println("Suma: "+sum+"\nResta: "+sub+"\nMultiplicacion: "+mult+"\nDivision: "+div);
    }
}