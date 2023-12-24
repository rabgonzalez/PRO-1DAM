package ies.puerto;

import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean par = (num % 2 == 0) ? true : false;
        System.out.println("El numero: "+num+" ¿Es par?\n"+par);
    }
}