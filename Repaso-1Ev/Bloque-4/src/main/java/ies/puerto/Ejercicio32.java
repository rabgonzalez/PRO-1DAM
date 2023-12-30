package ies.puerto;

import java.util.Scanner;

public class Ejercicio32{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double num = scanner.nextDouble();
        scanner.close();

        String result = "El numero ingresado es igual a cero";
        if(num > 0){
            result = "El numero ingresado es positivo";
        } else if (num < 0){
            result = "El numero ingresado es negativo";
        }

        System.out.println(result);
    }
}