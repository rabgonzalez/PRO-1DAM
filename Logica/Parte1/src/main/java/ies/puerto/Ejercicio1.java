package ies.puerto;

/**
 * @author rabgonzalez
 * Numeros primos
 * Escribe un programa que se encargue de comprobar 
 * si un número es o no primo. 
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Ejercicio1 {
    
    public boolean numeroPrimoBoolean(int numero){
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public String numerosPrimos(){
        int contador = 0;
        String resultado = "";
        for(int i = 1; i <= 100; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    contador++;
                }
            }
            if(contador == 0){
                resultado += i+" ";
            }
            contador = 0;
        }
        return resultado;
    }
}