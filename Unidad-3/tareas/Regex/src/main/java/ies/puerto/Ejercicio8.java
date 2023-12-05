package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String text = scanner.nextLine();

        String regex = "([a-z]+|[A-Z]+|[0-9]+){8,}";

        String message = "El formato no es válido";
        if(Pattern.matches(regex, text)){
            message = "El formato es válido";
        }
        System.out.println(message);
    }
}