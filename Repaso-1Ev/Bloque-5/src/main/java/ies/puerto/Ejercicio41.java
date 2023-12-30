package ies.puerto;

import java.util.Scanner;

public class Ejercicio41{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        Integer result = Integer.compare(num1, num2);
        
        if(result == 1){
            System.out.println(num1+" es mayor que "+num2);
        } else if(result == -1){
            System.out.println(num1+" es menor que "+num2);
        } else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}