package ies.puerto;

import java.util.Scanner;

public class Ejercicio35{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter:");
        char character = scanner.next().charAt(0);
        scanner.close();

        char[] vocals = {'a', 'e', 'i', 'o', 'u'};
        boolean foundVocal = false;

        for(int i = 0; i < vocals.length; i++){
            if(character == vocals[i]){
                foundVocal = true;
            }
        }
        
        if(foundVocal){
            System.out.println("El carácter es una vocal");
        } else{
            System.out.println("El carácter es una consonante");
        }
    }
}