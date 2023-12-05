package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto en formato Camel Case:");
        String camelCase = scanner.nextLine();

        String regex = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(camelCase);

        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println("Total de palabras en formato Camel Case= "+count);
    }
}