package ies.puerto;

import java.util.Scanner;

public class Ejercicio82{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros");
        int amount = scanner.nextInt();

        int[] array = new int[amount];
        System.out.println("introduce los "+amount+" valores:");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int temp;
        String result = "";
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[j-1]){
                temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
        }
            result += array[i] + " ";
        }
        System.out.println(result);
    }
}
