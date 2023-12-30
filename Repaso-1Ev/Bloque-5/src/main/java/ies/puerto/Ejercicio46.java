package ies.puerto;

import java.util.Scanner;

public class Ejercicio46{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce su temperatura corporal en Celsius:");
        float temp = scanner.nextFloat();
        scanner.close();

        float fever = 39.5f;

        if(temp >= fever){
            System.out.println("Tiene fiebre");
        } else{
            System.out.println("No tiene fiebre");
        }
    }
}