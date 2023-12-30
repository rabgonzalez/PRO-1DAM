package ies.puerto;

import java.util.Scanner;

public class Ejercicio42{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double num = scanner.nextDouble();
        scanner.close();

        int parseNum = (int) num;
        Integer result = Integer.compare(parseNum, 0);

        if(result == 1){
            System.out.println(num+" es positivo");
        } else if(result == -1){
            System.out.println(num+" es negativo");
        } else{
            System.out.println(num+" es igual a 0");
        }
    }
}