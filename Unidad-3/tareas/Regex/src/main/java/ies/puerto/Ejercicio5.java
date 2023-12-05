package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una etiqueta de HTML:");
        String html = scanner.nextLine();

        String regex = "<\\w+>(\\w+)</\\w+>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}