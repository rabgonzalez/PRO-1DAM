package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio67{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double num = scanner.nextDouble();
        scanner.close();

        String text = ""+num;

        String regex = "\\.([0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String result = "";
        while(matcher.find()){
            result = matcher.group(1);
        }
        System.out.println(result.length());
    }
}