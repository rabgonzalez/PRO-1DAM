package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String text = scanner.nextLine();

        String regex = "\\w";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println("Número de palabras: "+count);
    }
}