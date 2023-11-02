package ies.puerto;
import java.util.Arrays;

/**
 * Comprueba si una matriz es diagonal (todos los elementos fuera de la diagonal principal son cero).
 * @author rabgonzalez
 */
public class Ejercicio10 {

    public int[][] matrizDiagonal(int[][] matriz){
        int[][] resultado = new int[matriz.length][matriz.length];
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz.length; columna++){
                if(matriz[fila][columna] != 0){
                    resultado = matriz;
                }
            }
        }
        return resultado;
    }
}
