package ies.puerto;

import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        float num1 = scanner.nextFloat();
        double num2 = scanner.nextDouble();
        scanner.close();

        float floatNumber = num1 + 0.0000000001f;
        double doubleNumber =  num2 + 0.0000000001d;
        
        System.out.println("Esta es la diferencia entre un double y un float:\n"+floatNumber+"\n"+doubleNumber);
    }
}