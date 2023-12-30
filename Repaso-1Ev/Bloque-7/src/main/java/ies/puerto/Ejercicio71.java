package ies.puerto;

import java.util.Scanner;

public class Ejercicio71{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 10) + 1;
        int num = 0;
        do{
            System.out.print("Introduce un numero: ");
            num = scanner.nextInt();
        } while(num != random);
        scanner.close();
        System.out.println("Has acertado, el número era "+random);
    }
}