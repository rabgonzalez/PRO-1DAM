package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio43{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String text = scanner.nextLine();
        scanner.close();

        String regex = "[aA]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println("El texto contiene la letra a");
        } else{
            System.out.println("El texto no contiene la letra a");
        }
    }
}