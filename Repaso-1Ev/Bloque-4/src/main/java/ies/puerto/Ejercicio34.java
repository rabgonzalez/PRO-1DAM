package ies.puerto;

import java.util.Scanner;

public class Ejercicio34{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce true o false:");
        boolean bool = scanner.nextBoolean();
        scanner.close();

        if(bool){
            System.out.println("El siguiente booleano es verdadero");
        } else{
            System.out.println("El siguiente booleano es falso");
        }
    }
}