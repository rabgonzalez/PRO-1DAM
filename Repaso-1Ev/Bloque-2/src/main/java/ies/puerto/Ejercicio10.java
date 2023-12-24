package ies.puerto;

import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        float price = scanner.nextFloat();
        scanner.close();

        float total = price + (price * 0.07f);
        System.out.println("El precio del producto sumándole el impuesto IGIC se queda en: "+total+" Euros");
    }
}