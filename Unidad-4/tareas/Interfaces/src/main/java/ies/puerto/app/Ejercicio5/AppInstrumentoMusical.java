package ies.puerto.app.Ejercicio5;

import java.util.Scanner;

import ies.puerto.impl.Ejercicio5.Guitarra;

public class AppInstrumentoMusical {
    static Guitarra guitarra;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una nota ");
        String nota = scanner.nextLine();
        scanner.close();
        
        guitarra = new Guitarra();
        guitarra.tocarNota(nota);
        guitarra.afinar();
        guitarra.cambiarCuerdas();
    }
}
