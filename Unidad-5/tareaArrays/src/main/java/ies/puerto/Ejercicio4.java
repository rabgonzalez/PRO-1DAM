package ies.puerto;

/**
 * Imprime los números pares de un array de enteros.
 * @author rabgonzalez
 */
public class Ejercicio4 {

    /**
     * Encontrar los numeros pares y mostralos
     * @param numeros array base
     * @return array de numeros pares
     */
    public int[] numerosPares(int[] numeros){
        int[] pares = new int[numeros.length];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares[i] = numeros[i];
            }
        }
        return pares;
    }
}
