package ies.puerto;

/**
 * Crea una función que tome como parámetro un número e indique si es primo o no.
 * @author rabgonzalez
 */

public class Ejercicio5 {
    
    /**
     * verificar si un numero es primo
     * @param numero valor del numero
     * @return verificacion de si es primo o no
     */
    public static boolean verificarPrimo(int numero){
        boolean resultado = false;
        int divisores = 0;

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                divisores++;
            }
        }
        if(divisores <= 2){
            resultado = true;
        }

        return resultado;
    }
}