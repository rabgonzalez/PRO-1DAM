package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.print("Introduce una cadena de texto: ");
        text = scanner.nextLine();
        int count = 0;

        for(int i= 0; i < text.length(); i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}