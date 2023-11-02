package ies.puerto;
import java.util.Arrays;

/**
 * Combina dos arrays ordenados en uno solo manteniendo el orden.
 * @author rabgonzalez
 */
public class Ejercicio9 {

    public int[] combinarArrays(int[] array1, int[] array2){
        int[] combinacion = new int[array1.length + array2.length];
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1.length; j++){
                if(array1[j] <= array2[i]){
                    combinacion[i] = array1[j];
                }
            }
        }
        return combinacion;
    }
}
