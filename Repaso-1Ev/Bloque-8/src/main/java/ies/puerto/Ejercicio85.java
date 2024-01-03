package ies.puerto;

import java.util.Scanner;

public class Ejercicio85{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros");
        int amount = scanner.nextInt();

        int[] array = new int[amount];
        System.out.println("introduce los "+amount+" valores:");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.print("Introduce un numero en especifico: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                count++;
            }
        }
        System.out.println("El numero "+num+" aparece un total de "+count+" veces");
    }
}
