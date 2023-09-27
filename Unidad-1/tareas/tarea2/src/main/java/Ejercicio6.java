/**
 * @author rabgonzalez
 * Ejercicio Numero 2
 */
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args)
    {
        int divisores = 0;

        int numero;
        System.out.println("Introduce el valor:");
        numero = lectura.nextInt();

        for(int n = 1; n <= numero; n++)
        {
            if(numero % n == 0)
            {
                divisores++;
            }
        }

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