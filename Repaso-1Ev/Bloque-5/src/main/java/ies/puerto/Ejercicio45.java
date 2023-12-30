package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio45{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter:");
        char character = scanner.next().charAt(0);
        scanner.close();

        String regex = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(regex);
        
        String charSequence = ""+character;

        if(pattern.matches(regex, charSequence)){
            System.out.println("El siguiente carácter es una vocal");
        } else{
            System.out.println("El siguiente carácter es una consonante");
        }
    }
}