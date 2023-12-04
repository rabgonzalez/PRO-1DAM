package ies.puerto;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Introduce un valor numérico:");
        number = scanner.nextInt();
        
        Integer numberParsed = Integer.valueOf(number);
        int comparation = numberParsed.compare(number, 0);

        String result = "cero";
        if(comparation == 1){
            result = "positivo";
        } else if(comparation == -1){
            result = "negativo";
        }

        System.out.println(result);
    }
}