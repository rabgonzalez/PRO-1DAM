package ies.puerto;

import java.util.Scanner;

public class Ejercicio65{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();
        scanner.close();

        double finalNum = Integer.toUnsignedLong(num);
        double root = Math.sqrt(finalNum);
        System.out.println("La raiz cuadrada de "+num+ " es: "+root);
    }
}