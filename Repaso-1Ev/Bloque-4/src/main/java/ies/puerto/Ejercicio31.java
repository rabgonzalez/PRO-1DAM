package ies.puerto;

import java.util.Scanner;

public class Ejercicio31{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        String mayor = "El mayor es: "+num1;
        if(num2 > num1){
            mayor = "El mayor es: "+num2;
        } else if(num2 == num1){
            mayor = "Son iguales";
        }

        System.out.println(mayor);
    }
}