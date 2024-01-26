package ies.puerto.Ejercicio5.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppNumerosPares {
    static List<Integer> array;

    public static void main(String[] args) {
        array = new ArrayList<>();
        array.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(array);
        System.out.println(pintarPares());
    }

    public static boolean pares(int numero) {
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }

    public static List<Integer> pintarPares() {
        List<Integer> resultado = new ArrayList<>();
        
        for(int numero:array){
            if(pares(numero)){
                resultado.add(numero);
            }
        }
        return resultado;
    }
}
