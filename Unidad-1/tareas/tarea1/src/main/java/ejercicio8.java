import java.util.Scanner;

public class ejercicio8 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
     * @param args
     */

     
     public static void main(String[] args)
    {
        Scanner lectura = new Scanner(System.in);
        int numero;
        float sumatorio = 0;
        
        System.out.println("Ingresa la cantidad de notas: ");
        numero = lectura.nextInt();

        for(int N = numero-1; N >= 0; N--)
        {

            System.out.println("Ingresa el valor: ");
            sumatorio += lectura.nextFloat();
        }
        System.out.println(sumatorio / numero);
    }
}