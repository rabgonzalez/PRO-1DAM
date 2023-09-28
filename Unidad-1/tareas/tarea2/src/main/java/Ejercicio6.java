/**
 * @author rabgonzalez
 * Ejercicio Numero 6
 */
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * Descripcion del algoritmo
     * Algoritmo que lee un numero y nos dice si es primo o no
     * usamos un for con condicional para sumar divisores y un condicional para comprobar si tiene 2 o mas divisores
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