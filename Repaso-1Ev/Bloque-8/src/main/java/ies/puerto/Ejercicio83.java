package ies.puerto;

import java.util.Scanner;

public class Ejercicio83{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros");
        int amount = scanner.nextInt();

        int[] array = new int[amount];
        System.out.println("introduce los "+amount+" valores:");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.print("¿Que numero quieres buscar? ");
        int num = scanner.nextInt();
        scanner.close();


        int i = 0;
        boolean found = false;
        while(i < array.length || found == false){
            if(array[i] == num){
                found = true;
                break;
            }
            i++;
        }

        if(array[i] == num){
            System.out.println("Valor encontrado en la posición "+i);
        } else {
            System.out.println("Valor no encontrado :(");
        }
    }
}
