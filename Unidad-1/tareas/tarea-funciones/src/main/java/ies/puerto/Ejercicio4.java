package ies.puerto;

/**
 * Crea una función que tome dos parámetros numéricos y calcule el máximo de los dos números. 
 * Crear una nueva función con el mismo nombre, que tome tres parámetros, y calcule el máximo de los tres números. 
 * Esta segunda función debe hacer uso de la primera.
 * @author rabgonzalez
 */

public class Ejercicio4 {
    
    /**
     * calcular el valor mayor de un numero a y un numero b
     * @param a valor de a
     * @param b valor de b
     * @return operacion que calcula el mayor valor
     */
    public int numeroMayorDos(int a, int b){
        int resultado = b;
        if(a > b){
            resultado = a;
        }
        return resultado;
    }

    /**
     * calcular el valor mayor del numero mayor anterior y un numero c
     * @param a valor de a
     * @param b valor de b
     * @param c valor de c
     * @return operacion que calcula el mayor valor
     */
    public int numeroMayorDos(int a, int b, int c){
        int resultado = 0;
        resultado = numeroMayorDos(numeroMayorDos(a, b), c);
        return resultado;
    }
}
