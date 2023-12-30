package ies.puerto;

import java.util.Scanner;

public class Ejercicio48{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 cadenas de texto:");
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        scanner.close();

        int result = text1.compareTo(text2); 
        if(result < 0){
            System.out.println("La primera cadena es más corta que la segunda cadena");
        } else if(result > 0){
            System.out.println("La primera cadena es más larga que la segunda cadena");
        } else {
            System.out.println("Ambas cadenas tienen la misma longitud");
        }
    }
}