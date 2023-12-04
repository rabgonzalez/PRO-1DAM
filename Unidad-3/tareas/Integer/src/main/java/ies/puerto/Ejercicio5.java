package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Introduce un valor numérico:");
        number = scanner.nextInt();
        int i = number-1;
        
        while(i > 0){
            if(number % i == 0){
                System.out.println("El número: "+i+ ", es el mayor divisor");
                break;
            } 
            i--;
        }
    }
}