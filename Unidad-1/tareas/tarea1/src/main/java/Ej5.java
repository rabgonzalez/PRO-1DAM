import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 5
 * Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. 
 * Se debe solicitar el número n por teclado.
 */

public class Ej5 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int valorAnterior = 0;
        int fibonacci = 1;
        int posicion;
        System.out.println("Ingresa el valor:");
        posicion = lectura.nextInt();

        for(int n = 0; n < posicion; n++)
        {
            System.out.println(fibonacci);
            fibonacci += valorAnterior;
            valorAnterior = fibonacci - valorAnterior;
        }
    }
}