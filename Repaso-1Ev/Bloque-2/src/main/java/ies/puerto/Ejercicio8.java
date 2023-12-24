package ies.puerto;

import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio de un círculo en cm:");
        float radius = scanner.nextFloat();
        scanner.close();

        float area = (radius * radius) * 3.14f;
        System.out.println("El radio del circulo es de: "+area+" cm2");
    }
}