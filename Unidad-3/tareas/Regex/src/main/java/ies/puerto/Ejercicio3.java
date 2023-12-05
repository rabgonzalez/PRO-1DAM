package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha:");
        String date = scanner.nextLine();

        String regex = "\\d{2}\\/\\d{2}\\/\\d{4}";

        String message = "Formato de fecha erróneo";
        if(Pattern.matches(regex, date)){
            message = "Fecha válida";
        }
        System.out.println(message);
    }
}