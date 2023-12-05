package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu tarjeta de crédito:");
        String creditCard = scanner.nextLine();

        String regex = "^\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(creditCard);

        while(matcher.find()){
            System.out.println("Tu tarjeta es válida: "+matcher.group());
        }
    }
}