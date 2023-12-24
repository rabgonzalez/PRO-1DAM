package ies.puerto;

import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        scanner.close();

        boolean adult = (age - 18 >= 0) ? true : false;
        System.out.println("Mayor de edad?\n"+adult);
    }
}