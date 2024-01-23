package ies.puerto.Ejercicio1.app;

import java.util.ArrayList;
import java.util.List;

public class AppEnteros {
    static List<Integer> enteros;

    public static int[] arrayConBase(int base) {
        int[] array = new int[base];
        
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
        return array;
    }

    public static List<Integer> pares() {
        int[] array = arrayConBase(10);

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                enteros.add(array[i]);
            }
        }
        return enteros;
    }

    public static void main(String[] args) {
        enteros = new ArrayList<Integer>();
        System.out.println(pares());
    }
}
