package ies.puerto;

import java.util.Scanner;

public class Ejercicio33{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String text = scanner.nextLine();
        scanner.close();

        boolean found = false;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'A'){
                found = true;
            }
        }
        System.out.println("El texto contiene la letra a? "+found);
    }
}