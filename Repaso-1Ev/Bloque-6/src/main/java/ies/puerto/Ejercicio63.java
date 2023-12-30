package ies.puerto;

import java.util.Scanner;

public class Ejercicio63{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String name = scanner.nextLine();
        System.out.println("Ahora introduce tu apellido:");
        String surname = scanner.nextLine();
        scanner.close();

        System.out.println("¡Hola "+name+ " "+surname+ "!");
    }
}