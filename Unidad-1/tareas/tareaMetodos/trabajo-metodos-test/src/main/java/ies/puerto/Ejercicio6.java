package ies.puerto;

public class Ejercicio6 {

    /**
     * Recorrer un rango de números (1..1000)
     * Para un número, comprobar si Armstrong
     * Si es imprime en pantalla
     * Si no sigue adelante
     * @author rabgonzalez
     */
     
     /**
      * Función que verifica si un número es Armstrong
      * @param numero para realizar la verificación
      * @return bollean true/falso con el resultado
      */

     public boolean verificaArmstrong(int numero){
        boolean resultado = false;

        int n = numero;
        int exponente = 0;
        int digito = 0;
        int suma = 0;

        while(n > 0){
            n = n/10;
            exponente++;
        }

        while(n > digito){
            digito = n%10;
            digito = digito * exponente;
            suma = suma + digito;
            if(numero == suma){
                System.out.println(suma);
            }
        }

        return resultado;
    }
}