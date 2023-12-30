package ies.puerto;

import java.util.Scanner;

public class Ejercicio61{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();
        scanner.close();

        String text = Integer.toString(num);
        System.out.println("El numero "+num+ " mide un total de "+text.length()+ " carácteres");
    }
}