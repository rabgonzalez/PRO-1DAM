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
     * @param args
     */
    public static void main(String[] args)
    {
        int Numero;
        System.out.println("Introduce un número:");
        Numero = lectura.nextInt();

        if(Numero % 2 == 0)
        {
            System.out.println("El número " + Numero + " es par");
        }
        else{
            System.out.println("El número " + Numero + " es impar");
        }
    }
}