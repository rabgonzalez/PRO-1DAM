package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el cálculo del factorial
 * @author rabgonzalez
 */
public class CalculoFactorial {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Calculando el factorial de " + numero + ", resultado: " + calculoFactorial(numero));
    }

    /**
     * Método que realiza el cálculo del factorial
     * @param numero Valor sobre el que se realiza el cálculo
     * @return factorial del número dado
     */

    public static int calculoFactorial (int numero){
        int resultado = 1;
        for(int i = 2; i <= numero; i++){
            resultado *= i;
        }

        return resultado;
    }

}