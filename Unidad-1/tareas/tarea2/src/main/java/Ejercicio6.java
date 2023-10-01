/**
 * @author rabgonzalez
 * Ejercicio Numero 6
 */
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no.
     * @param args
     */

    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args)
    {
        int divisores = 0;

        int numero;
        System.out.println("Introduce el valor:");
        numero = lectura.nextInt();

        // Creamos un bucle que divide nuestro numero del 1 a su valor y comprueba si es divisible entre estos, si el resto da 0 se añade un valor a la variable divisores
        for(int n = 1; n <= numero; n++)
        {
            if(numero % n == 0)
            {
                divisores++;
            }
        }
        
        // Si al dividir todos los valores inferiores al numero, hay mas de 2 divisores del mismo, el numero no es primo
        if(divisores > 2)
        {
            System.out.println(numero + " no es primo");
        }
        else
        {
            System.out.println(numero + " es primo");
        }
    }
}