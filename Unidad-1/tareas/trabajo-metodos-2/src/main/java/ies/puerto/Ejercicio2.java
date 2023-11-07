package ies.puerto;

/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es positivo o negativo y si es par o impar.
 * @author rabgonzalez
 */
public class Ejercicio2 {

    /**
     * Calcular si el numero dado es positivo y par
     * @param numero numero que se introduce
     * @return booleano que confirma si ambas condiciones se cumplen
     */
    public boolean verificarNumero(int numero) {
        boolean resultado = false;

        if ((numero > 0) && (numero % 2 == 0)) {
            return resultado = true;
        }
        return resultado;
    }
}
