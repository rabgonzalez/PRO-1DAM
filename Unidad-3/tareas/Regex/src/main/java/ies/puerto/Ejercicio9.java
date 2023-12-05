package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una URL:");
        String url = scanner.nextLine();

        String regex = "https\\:\\/(\\/\\w+){1,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}