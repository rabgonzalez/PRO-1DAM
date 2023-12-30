package ies.puerto;

import java.util.Scanner;

public class Ejercicio38{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 cadenas de texto:");
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        scanner.close();

        if(text1.length() == text2.length()){
            System.out.println("Ambas cadenas miden lo mismo: "+text1.length()+" carácteres");
        } else{
            System.out.println("Cada cadena tiene una longitud distinta");
        }
    }
}