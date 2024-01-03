package ies.puerto;

import java.util.Scanner;

public class Ejercicio87{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una matriz de 3x3");

        int[][] matrix = new int[3][3];
        System.out.println("introduce los valores:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        int[][] clone = new int[matrix.length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                clone[i][j] = matrix[j][i];
            }
        }

        String result = "";
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                result += clone[i][j];
            }
            result += "\n";
        }
        System.out.println(result);
    }
}
