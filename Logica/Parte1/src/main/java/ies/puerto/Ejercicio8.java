package ies.puerto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera cadena de texto: ");
        String str1 = scanner.nextLine();
        System.out.print("Introduce la segunda cadena de texto: ");
        String str2 = scanner.nextLine();

        String out1 = "";
        String out2 = "";

        Set<Character> caracteres = new HashSet<>();

        for(int i = 0; i < str1.length(); i++){

            for(int j = 0; j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    caracteres.add(str1.charAt(i));
                }
            }

            if(!caracteres.contains(str1.charAt(i))){
                out1 += str1.charAt(i);
                out2 += str2.charAt(i);
            }
        }

        System.out.println(out1);
        System.out.println(out2);
    }
}
