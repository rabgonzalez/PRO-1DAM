package ies.puerto;

import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String name = scanner.next();

        System.out.print("Introduce tu apellido: ");
        String surname = scanner.next();
        scanner.close();
        System.out.println("¡Hola "+name+" "+surname+"!");
    }
}