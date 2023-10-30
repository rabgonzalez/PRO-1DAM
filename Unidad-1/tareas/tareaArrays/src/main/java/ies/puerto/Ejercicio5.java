package ies.puerto;

/**
 * Encuentra el valor máximo y mínimo en un array de enteros.
 * @author rabgonzalez
 */
public class Ejercicio5 {

    public int buscarElemento(int valor, int[] numeros){
        int resultado = numeros [0];
        for(int i = 1; i < valor; i++){
            resultado = i;
        }
        return resultado;
    }
}
