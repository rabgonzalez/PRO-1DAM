package ies.puerto;

/**
 * Encuentra el valor máximo y mínimo en un array de enteros.
 * @author rabgonzalez
 */
public class Ejercicio4 {

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
