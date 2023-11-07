package ies.puerto;

/**
 * Encuentra el valor máximo y mínimo en un array de enteros.
 * @author rabgonzalez
 */
public class Ejercicio3 {

    /**
     * Mostrar el valor más alto 
     * @param numeros valores dentro del array
     * @return valor más alto del bucle
     */
    public int mayorArray(int[] numeros){
        int maximo = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        return (maximo);
    }

    /**
     * Mostrar el valor más bajo 
     * @param numeros valores dentro del array
     * @return valor más pequeño del bucle
     */
    public int menorArray(int[] numeros){
        int minimo = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < minimo){
                minimo = numeros[i];
            }
        }
        return (minimo);
    }
}
