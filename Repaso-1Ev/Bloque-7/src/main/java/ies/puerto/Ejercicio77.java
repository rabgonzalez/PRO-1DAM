package ies.puerto;

import java.util.Scanner;

public class Ejercicio77{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce 5 notas:");
        
        float sum = 0;
        for(int i = 0; i < 5; i++){
            float mark = scanner.nextFloat();
            sum += mark;
        }
        scanner.close();
        float mid = sum / 5;
        System.out.println("Tu nota media es un: "+mid);
    }
}
