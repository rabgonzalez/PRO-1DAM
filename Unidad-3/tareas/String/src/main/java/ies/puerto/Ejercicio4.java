package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Introduce una cadena de texto: ");
        text = scanner.nextLine();
        String text2 = "";
        
        int length = text.length();

        for(int i = 0; i < text.length(); i++){
            text2 += text.charAt((length-1)- i);
        }
        System.out.println(text2);
    }
}