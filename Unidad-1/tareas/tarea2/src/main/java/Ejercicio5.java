/**
 * @author rabgonzalez
 * Ejercicio Numero 2
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args)
    {
        int numero1, numero2;
        System.out.println("Introduce el primer valor:");
        numero1 = lectura.nextInt();
        System.out.println("Introduce el segundo valor:");
        numero2 = lectura.nextInt();

        if(numero1 > numero2)
        {
            System.out.println(numero1 + " es mayor que " + numero2);
        }
        else
        {
            System.out.println(numero2 + " es mayor que " + numero1);
        }
    }
}