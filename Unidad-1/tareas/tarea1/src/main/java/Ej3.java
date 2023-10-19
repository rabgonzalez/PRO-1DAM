import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 3
 * Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  
 * Se debe solicitar el número por teclado.
 */

public class Ej3 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int valorAnterior = 0;
        int numero;
        int fibonacci = 1;
        System.out.println("Ingresa el valor:");
        numero = lectura.nextInt();
        
        for( int n = 1; n < numero; n++)
        {
            fibonacci += valorAnterior;
            valorAnterior = fibonacci - valorAnterior;
        }
        System.out.println(fibonacci);
    }
}