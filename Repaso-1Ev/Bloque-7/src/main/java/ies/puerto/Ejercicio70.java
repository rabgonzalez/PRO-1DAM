package ies.puerto;

import java.util.Scanner;

public class Ejercicio70{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        do{
            System.out.print("Introduce un numero inferior a 100: ");
            int num = scanner.nextInt();
            sum += num;
            System.out.println("La suma es igual a "+sum);
        } while(sum <= 100);
        scanner.close();
        System.out.println("Te has pasado de 100");
    }
}