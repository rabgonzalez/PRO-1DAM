package ies.puerto;

import java.util.Scanner;

public class Ejercicio60{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 cadenas de texto:");
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        scanner.close();

        boolean result = text1.equalsIgnoreCase(text2); 
        if(result){
            System.out.println("Ambas cadenas son iguales");
        } else {
            System.out.println("Las cadenas contienen información diferente");
        }
    }
}