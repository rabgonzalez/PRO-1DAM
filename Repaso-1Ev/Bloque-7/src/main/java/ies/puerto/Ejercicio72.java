package ies.puerto;

import java.util.Scanner;

public class Ejercicio72{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números:");

        int product = 1;
        for(int i = 0; i < 5; i++){
            int num = scanner.nextInt();
            product *= num;
        }
        scanner.close();
        System.out.println("El producto es igual a: "+product);
    }
}