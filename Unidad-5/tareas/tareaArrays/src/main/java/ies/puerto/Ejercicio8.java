package ies.puerto;
import java.util.Arrays;

/**
 * Elimina elementos duplicados de un array, 
 * y muestra finalmente los valores iniciales del array y el resultado final.
 * @author rabgonzalez
 */
public class Ejercicio8 {
    
    public int[] eliminarDuplicados(int[] array){
        Arrays.sort(array);
        int[] duplicado = new int[array.length];

        for(int i = 0; i < array.length; i++){ 
            for(int j = i; j < array.length; j++){
                if(array[j] != array[i]){ 
                    duplicado[j] = array[j];
                }
            }
        }
        return duplicado;
    }
}
