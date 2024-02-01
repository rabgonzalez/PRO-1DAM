package ies.puerto.Ejercicio1.app;

import java.util.ArrayList;
import java.util.List;

public class AppEnteros {
    static List<Integer> listaNumerosPares;
    static List<Integer> listaNumerosImpares;

     public static void main(String[] args) {
        listaNumerosPares = new ArrayList<Integer>();
        listaNumerosImpares = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            if(esNumeroPar(i)){
                listaNumerosPares.add(i);
            } else {
                listaNumerosImpares.add(i);
            }
        }
        System.out.println(listaNumerosPares);
        System.out.println(listaNumerosImpares);
    }

    /**
     * Funcion que verifica si un numero es par
     * @param i numero que verifica 
     * @return tru/false si es o no par
     */
    public static boolean esNumeroPar(int i){
        if(i % 2 == 0){
            return true;
        }
        return false;
    }
}