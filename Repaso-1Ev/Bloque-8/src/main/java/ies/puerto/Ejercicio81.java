package ies.puerto;

import java.util.Scanner;

public class Ejercicio81{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros");
        int amount = scanner.nextInt();

        int[] array = new int[amount];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            System.out.println("introduce un valor:");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        scanner.close();
        System.out.println(sum);
    }
}
