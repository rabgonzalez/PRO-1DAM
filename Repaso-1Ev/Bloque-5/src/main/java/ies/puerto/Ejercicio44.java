package ies.puerto;

import java.util.Scanner;

public class Ejercicio44{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un booleano:");
        boolean bool = scanner.nextBoolean();
        scanner.close();

        if(bool){
            System.out.println("La variable es verdadera");
        } else{
            System.out.println("La variable es false");
        }
    }
}