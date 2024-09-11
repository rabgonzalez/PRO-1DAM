package ies.puerto;

public class Ejercicio1 {
    public String[][] contenedorHielo(int[] array){
        String[][] resultado = new String[array.length][numFilas(array)];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < numFilas(array); j++){
                if(j < numFilas(array)-array[i]){
                    continue;
                }
                resultado[i][j] = "🧊";
            }
        }
        return resultado;
    }

    public int numFilas(int[] array){
        int resultado = 0;

        for(int numero : array){
            if(numero > resultado){
                resultado = numero;
            }
        }
        return resultado;
    }
}