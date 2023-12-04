package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor numérico:");
        int number = scanner.nextInt(); 

        Integer numbInteger = Integer.valueOf(number);

        boolean prime = true;
        for(int i = 2; i <= numbInteger/2; i++){
            if(numbInteger % i == 0){
                prime = false;
            }
        }
        System.out.println("¿El numero: "+numbInteger+ ", es primo? "+prime);
    }
}