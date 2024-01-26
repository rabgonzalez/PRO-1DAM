package ies.puerto.Ejercicio5.app;

import java.util.ArrayList;
import java.util.List;

/**
 * TERMINAR
 */
public class AppNumerosPares {
    static List<Integer> array;

    public static void main(String[] args) {
        array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        System.out.println(array);
        System.out.println("\n"+pintarPares());
    }

    public static boolean pares(int numero) {
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }

    public static List<Integer> pintarPares() {
        for(int numero:array){
            if(!pares(numero)){
                array.remove(numero);
            }
        }
        return array;
    }
}
