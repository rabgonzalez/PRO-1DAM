package ies.puerto;

import java.util.Scanner;

public class Ejercicio39{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        scanner.close();

        if(age < 18){
            System.out.println("Eres menor de edad, te quedan "+(18-age)+" año/s para ser mayor de edad");
        } else if(age >= 18 && age < 65){
            System.out.println("Eres mayor de edad");
        } else{
            System.out.println("Eres de la tercera edad");
        }
    }
}