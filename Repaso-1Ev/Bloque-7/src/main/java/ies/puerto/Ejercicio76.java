package ies.puerto;

import java.util.Scanner;

public class Ejercicio76{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce números positivos:");
        int num = 0;

        do{
            num = scanner.nextInt();
        } while(num >= 0);
        scanner.close();
        System.out.println(num+" es un numero negativo");
    }
}
