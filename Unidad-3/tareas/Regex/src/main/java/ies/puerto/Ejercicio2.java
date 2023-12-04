package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu telefono:");
        String phoneNumber = scanner.nextLine();

        String regex = "\\+[\\d{2}]+-[\\d{3}]+-[\\d{2}]+-[\\d{2}]+-[\\d{2}]+";

        String message = "El formato es incorrecto";
        if(Pattern.matches(regex, phoneNumber)){
            message = "válido";
        }
        System.out.println(message);
    }
}