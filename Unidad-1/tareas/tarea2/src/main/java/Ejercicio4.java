/**
 * @author rabgonzalez
 * Ejercicio Numero 4
 */
import java.util.Scanner;
public class Ejercicio4
{
    static Scanner lectura = new Scanner(System.in);
    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es par o impar.
     * @param args
     */

    public static void main(String[] args)
    {
        int numero;
        System.out.println("Introduce un número:");
        numero = lectura.nextInt();

        // Si al dividir el valor entre 2 el resto nos da 0, significa que el número es par
        if(numero % 2 == 0)
        {
            System.out.println("El número " + numero + " es par");
        }
        else{
            System.out.println("El número " + numero + " es impar");
        }
    }
}