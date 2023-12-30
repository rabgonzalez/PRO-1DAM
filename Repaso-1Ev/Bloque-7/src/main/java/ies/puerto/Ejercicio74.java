package ies.puerto;

import java.util.Scanner;

public class Ejercicio74{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la longitud de la base del triángulo: ");
        int base = scanner.nextInt();
        scanner.close();

        int temp = 0;
        String result = "";

        for(int i = base/2; i >= 0; i--){
            for(int j = 0; j <= (base/2)*2; j++){
                if(j < temp || j > (base/2)*2-temp){
                    result += " ";
                } else {
                    result += "*";
                }
            }
            temp++;
            result += "\n";
        }
        System.out.println(result);
    }
}