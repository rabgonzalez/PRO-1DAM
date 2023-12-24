package ies.puerto;

import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String name = scanner.next();

        System.out.print("Introduce tu edad: ");
        int age = scanner.nextInt();

        System.out.print("Introduce tu hobby favorito: ");
        String hobby = scanner.next();
        scanner.close();

        System.out.println("Este es tu perfil=\nNombre: "+name+"\nEdad: "+age+" años\nHobby: "+hobby);
    }
}