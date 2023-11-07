package ies.puerto;

/**
 * Dado un valor específico, encuentra su posición en el array o indica si no está presente.
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
