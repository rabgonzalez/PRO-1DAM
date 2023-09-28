/**
 * @author rabgonzalez
 * Ejercicio Numero 2
 */
import java.util.Scanner;

/**
 * @author rabgonzalez
 * Ejercicio Numero 3
 */

public class Ejercicio3
{
    /**
     * Descripcion del algoritmo
     * Algoritmo que suma todos los valores entre 1 y el 10
     * Usamos un bucle for
     * @param args
     */
    public static void main(String[] args)
    {
        int sumatorio = 0;
        int numero = 0;
        for(int i = 0; i <= 10; i++)
        {
            sumatorio += i;
        }
        System.out.println(sumatorio);

        sumatorio = 0;
        while(numero <= 10)
        {
            sumatorio += numero;
            numero++;
        }
        System.out.println(sumatorio);
    }
}