package ies.puerto;

import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dinero en Euros:");
        float eur = scanner.nextFloat();
        scanner.close();

        float dollar = eur * 1.10f;
        System.out.println("Tienes un total de: "+dollar+"$");
    }
}