package ies.puerto;

import java.util.Scanner;

public class Ejercicio64{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        String text = scanner.nextLine();
        scanner.close();

        int num = Integer.parseInt(text);
        int multiply = num*2;

        System.out.println("El resultado es "+multiply);
    }
}