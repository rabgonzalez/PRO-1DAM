package ies.puerto;

import java.util.Scanner;

public class Ejercicio79{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();
        scanner.close();

        String text = Integer.toString(num);

        int count = 0;
        for(int i = 0; i < text.length(); i++){
            count++;
        }
        System.out.println(count);
    }
}
