package ies.puerto;

import java.util.Scanner;

public class Ejercicio80{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(exit == false){
            System.out.println("Quieres salir del bucle?");
            exit = scanner.nextBoolean();
        }
        scanner.close();
        System.out.println("Has salido del bucle correctamente");
    }
}
