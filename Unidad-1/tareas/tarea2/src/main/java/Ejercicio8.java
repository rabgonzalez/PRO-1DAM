/**
 * @author rabgonzalez
 * Ejercicio Numero 8
 */
import java.util.Scanner;

public class Ejercicio8 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner lectura = new Scanner(System.in);
        int numero, sumatorio = 0;

        System.out.println("Ingresa la cantidad de notas: ");
        numero = lectura.nextInt();

        for(int N = numero-1; N >= 0; N--)
        {

            System.out.println("Ingresa el valor: ");
            sumatorio += lectura.nextInt();
        }
        System.out.println(sumatorio / numero);
    }
}