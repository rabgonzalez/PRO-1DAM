import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 4
 * Escribe un programa en Java que verifique si un número es palíndromo. 
 * Se debe solicitar el número por teclado.
 */

public class Ej4 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
       int numero, resto, numeroInvertido = 0;
       System.out.println("Ingresa el valor:");
       numero = lectura.nextInt();

       while(numero > 0)
       {
        //Sacar primer número
        resto = numero % 10;

        //Pasar el número a la izquierda
        numeroInvertido = numeroInvertido *10 + resto;

        //Obtener números restantes
        numero = numero/10;
       }
       System.out.println(numeroInvertido);
    }
}