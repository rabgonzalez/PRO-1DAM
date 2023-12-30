package ies.puerto;

import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca 2 cadenas de texto:");
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        scanner.close();

        String result = text1 + " " + text2;
        int resultLength = result.length();
        System.out.println(result+ ". Tiene un total de " +resultLength+ " carácteres");
    }
}