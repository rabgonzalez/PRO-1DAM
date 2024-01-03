package ies.puerto;

import java.util.Scanner;

public class Ejercicio86{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 matrices de 3x3");

        int[][] matrix1 = new int[3][3];
        System.out.println("introduce los valores de la primera matriz:");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int[][] matrix2 = new int[3][3];
        System.out.println("introduce los valores de la segunda matriz:");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2.length; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        int[][] sum = matrix1.clone();

        String result = "";
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                result += sum[i][j];
            }
            result += "\n";
        }
        System.out.println(result);
    }
}
