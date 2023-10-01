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
     * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10. 
     * Utilia un buble __for__ y un bucle __while__.
     * @param args
     */
    
    public static void main(String[] args)
    {
        int sumatorio = 0;

        // solucion con bucle for
        for(int i = 0; i <= 10; i++)
        {
            sumatorio += i;
        }
        System.out.println(sumatorio);
        
        // Reiniciamos el sumatorio y usamos el bucle while
        sumatorio = 0;
        int numero = 0;
        while(numero <= 10)
        {
            sumatorio += numero;
            numero++;
        }
        System.out.println(sumatorio);
    }
}