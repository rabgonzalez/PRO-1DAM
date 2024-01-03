package ies.puerto;

import java.util.Scanner;

public class Ejercicio89{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una matriz de 4x4");

        int[][] matrix = new int[4][4];
        System.out.println("introduce los valores:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int max = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("El valor más alto de la matriz es "+max);
    }
}
