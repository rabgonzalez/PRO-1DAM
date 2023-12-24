package ies.puerto;

import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su nombre de usuario: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.print("¡Hola, "+name+"!");
    }
}