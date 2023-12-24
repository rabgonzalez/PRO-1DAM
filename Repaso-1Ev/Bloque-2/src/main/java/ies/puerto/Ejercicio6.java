package ies.puerto;

import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        int sum = num1 + num2;
        System.out.println("Numero 1: "+num1+"\nNumero 2: "+num2+"\nSuma: "+sum);
    }
}