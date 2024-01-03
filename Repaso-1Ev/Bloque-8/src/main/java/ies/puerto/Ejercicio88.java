package ies.puerto;

import java.util.Scanner;

public class Ejercicio88{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una matriz de 2x3");
        int[][] matrix1 = new int[2][3];
        System.out.println("introduce los valores:");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Introduce una matriz de 3x2");
        int[][] matrix2 = new int[3][2];
        System.out.println("introduce los valores:");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }
        scanner.close();


        /**
         * tumbamos la matriz de 3x2 hacia la izquierda
         * No funciona
         */
        int[][] matrix = new int[2][3];
        for(int i = 0; i < matrix2[i].length; i++){
            for(int j = 0; j < matrix2.length; j++){
                matrix[i][j] = matrix2[j][2-i];
            }
        }

        int[][] end = new int[2][3];
        String result = "";
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                end[i][j] = matrix[i][j]*matrix1[i][j];
                result += end[i][j];
            }
            result += "\n";
        }

        System.out.println(result);
    }
}
