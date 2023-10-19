import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 9
 * Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. 
 * Solicita el valor de la tabla por teclado.
 */

public class Ej9 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numero;
        System.out.println("Ingrea el número: ");
        numero = lectura.nextInt();
        int multiplo = numero;
        
        for(int n = 1; n <= 10; n++)
        {
            multiplo = numero * n;
            System.out.println(multiplo);
        }
    }
}
