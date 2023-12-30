package ies.puerto;

import java.util.Scanner;

public class Ejercicio37{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double num = scanner.nextDouble();
        scanner.close();

        if(num % 5 == 0){
            System.out.println("El numero "+num+ " es divisible entre 5");
        } else{
            System.out.println("El numero "+num+ " no es divisible entre 5");
        }
    }
}