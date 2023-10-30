package ies.puerto;

/**
 * Calcula el promedio de los elementos en un array de números en punto flotante.
 * @author rabgonzalez
 */
public class Ejercicio2 {

    /**
     * Calcular el promedio de valores de un array
     * @param numeros valores dentro del array
     * @return Suma de todos los valores entre la cantidad de valores del array, 
     * obteniendo así el promedio.
     */
    public int promedioArray(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return (suma / numeros.length);
    }
}