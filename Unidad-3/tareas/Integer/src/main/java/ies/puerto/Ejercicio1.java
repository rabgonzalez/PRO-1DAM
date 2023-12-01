package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;
        System.out.println("Introduce un numero:");
        number = scanner.nextLine();

        Integer numbInteger = Integer.parseInt(number);

        if(numbInteger % 2 == 0){
            System.out.println(numbInteger + " es par");
        } else{
            System.out.println(numbInteger + " es impar");
        }
    }
}