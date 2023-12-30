package ies.puerto;

import java.util.Scanner;

public class Ejercicio73{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String text = scanner.nextLine();
        scanner.close();

        int i = 0;
        int sum = 0;

        while(i < text.length()){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                sum++;
            }
            i++;
        }
        System.out.println(sum);
    }
}