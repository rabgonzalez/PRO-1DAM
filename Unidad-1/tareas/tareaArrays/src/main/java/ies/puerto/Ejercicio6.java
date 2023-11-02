package ies.puerto;

/**
 * Dada una matriz cuadrada, encuentra su transpuesta.
 * @author rabgonzalez
 */
public class Ejercicio6 {
    public int[][] matrizTraspuesta(int[][] matriz){
        int[][] traspuesta = new int[matriz.length][matriz.length];
        
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz.length; columna++){
                traspuesta[fila][columna] = matriz[columna][fila];
            }
        }
        return traspuesta;
    }
}
