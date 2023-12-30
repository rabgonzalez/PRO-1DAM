package ies.puerto;

import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Está lloviendo? (Responda true o false)");
        boolean rain = scanner.nextBoolean();
        System.out.println("¿Es de noche? (Responda true o false)");
        boolean night = scanner.nextBoolean();
        scanner.close();

        boolean lampLight = false;
        if(night || rain){
            lampLight = true;
        }

        System.out.println("La lámpara esta encendida: "+lampLight);
    }
}