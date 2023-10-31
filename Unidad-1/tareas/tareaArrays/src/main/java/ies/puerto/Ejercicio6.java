package ies.puerto;

/**
 * Encuentra el valor máximo y mínimo en un array de enteros.
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
