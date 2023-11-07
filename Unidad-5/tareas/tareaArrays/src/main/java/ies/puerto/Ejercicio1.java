package ies.puerto;

/**
 * Escribe un programa que calcule la suma de todos los elementos en un array de enteros.
 * @author rabgonzalez
 */
public class Ejercicio1 {

    /**
     * Calcular la suma de los valores dentro de un array
     * @param numeros valores que se encuentran dentro del array
     * @return Suma de los valores
     */
    public int calcularSumaArrays(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return (suma);
    }
}