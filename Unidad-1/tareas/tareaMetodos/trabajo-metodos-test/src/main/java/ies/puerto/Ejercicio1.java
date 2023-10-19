package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author
 */
public class Ejercicio1 {
    public static void main(String[] args) {

    }

    /**
     * Funcion que calcula el factorial de un número 
     * @param numero de entrada oara el cálculo
     * @return resultado del factorial
     */

    public int calcularFactorial(int numero) {
        int resultado = 1;

        for(int i = 2; i <= numero; i++){
            resultado *= i;
        }

        return resultado;
    }

}