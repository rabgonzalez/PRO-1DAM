package ies.puerto;

import java.util.Scanner;

public class Ejercicio49{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        scanner.close();

        if(age < 65){
            if(age < 18){
                System.out.println("Eres menor de edad");
            } else {
                System.out.println("Eres mayor de edad");
            }
        } else {
            System.out.println("Perteneces a la tercera edad");
        }
    }
}