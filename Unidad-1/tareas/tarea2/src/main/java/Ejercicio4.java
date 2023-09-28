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
     * Algoritmo que lee un numero y nos dice si es par o impar
     * usamos un condional if y else
     * @param args
     */
    public static void main(String[] args)
    {
        int numero;
        System.out.println("Introduce un número:");
        numero = lectura.nextInt();

        if(numero % 2 == 0)
        {
            System.out.println("El número " + numero + " es par");
        }
        else{
            System.out.println("El número " + numero + " es impar");
        }
    }
}