package ies.puerto;


/**
 * Combina dos arrays ordenados en uno solo manteniendo el orden.
 * @author rabgonzalez
 */
public class Ejercicio9 {

    public int[] combinarArrays(int[] array1, int[] array2){
        int[] combinacion = new int[array1.length + array2.length];
        
        for(int i = 0; i < array1.length; i++){
                combinacion[i] = array1[i];
            }
        for(int j = 0; j < array2.length; j++){
            combinacion[array1.length+j] = array2[j];
        }
            return combinacion;
    }
}
