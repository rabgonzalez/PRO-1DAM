package ies.puerto;

import java.util.Scanner;

public class Ejercicio84{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de notas: ");
        int amount = scanner.nextInt();
        
        System.out.println("Introduzca cada nota");
        float[] array = new float[amount];
        float sum = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextFloat();
            sum += array[i];
        }
        scanner.close();
        float result = sum / amount;
        System.out.println(result);
    }
}
