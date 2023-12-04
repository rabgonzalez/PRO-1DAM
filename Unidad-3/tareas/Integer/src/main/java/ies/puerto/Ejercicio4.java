package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Introduce un valor numérico:");
        number = scanner.nextInt();

        String stringNumber = Integer.toString(number);
        int sum = 0;
        
        for(int i = 0; i < stringNumber.length(); i++){
            sum = stringNumber.charAt(i);
        }
        System.out.println(sum);
    }
}