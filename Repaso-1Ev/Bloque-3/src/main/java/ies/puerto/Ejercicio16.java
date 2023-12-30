package ies.puerto;

import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del circulo en cm: ");
        int radius = scanner.nextInt();
        scanner.close();

        double area = Math.PI * (radius*radius);
        System.out.println("El area del circulo es: "+area+ " cm2");
    }
}