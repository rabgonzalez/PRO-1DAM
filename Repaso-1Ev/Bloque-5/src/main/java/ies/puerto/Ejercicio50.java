package ies.puerto;

import java.util.Scanner;

public class Ejercicio50{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año:");
        int year = scanner.nextInt();
        scanner.close();

        if(year % 4 == 0){
            System.out.println("El año "+year+" es bisiesto");
        } else{
            System.out.println("El año "+year+" no es bisiesto");
        }
    }
}