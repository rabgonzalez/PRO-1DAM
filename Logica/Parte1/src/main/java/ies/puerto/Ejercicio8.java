package ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera cadena de texto: ");
        String str1 = scanner.nextLine();
        System.out.print("Introduce la segunda cadena de texto: ");
        String str2 = scanner.nextLine();

        String out1 = "";
        String out2 = "";


        for(int i = 0; i < str1.length(); i++){
            for(int j = 0; j < str2.length(); j++){
                if(str1.charAt(i) != str2.charAt(j)){
                    out1 += str1.charAt(i);
                    out2 += str2.charAt(j);
                }
            }
        }
        System.out.println("\n"+out1);
        System.out.println(out2);
    }
}
