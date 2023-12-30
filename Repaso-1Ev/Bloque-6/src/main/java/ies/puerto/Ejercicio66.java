package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio66{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String word = scanner.nextLine();
        System.out.println("Introduce una cadena de texto:");
        String text = scanner.nextLine();
        scanner.close();

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println("La palabra se encuentra dentro de la frse");
        } else{
            System.out.println("La palabra no esta en la frase");
        }
    }
}