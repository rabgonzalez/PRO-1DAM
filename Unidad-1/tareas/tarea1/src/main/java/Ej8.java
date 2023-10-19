import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 8
 * Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. 
 * Solicita el límite por teclado
 */

public class Ej8 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int suma = 0;
        int n;
        System.out.println("Ingrea un valor: ");
        n = lectura.nextInt();

        for(int numero = 1; numero <= n; numero++)
        {

            for(int divisor = 1; divisor <= (numero/2); divisor++)
            {

                if(numero % divisor == 0)
                {
                    suma += divisor;

                }
            }

            if(numero == suma)
            {
                System.out.println(suma);
            }
            suma = 0;
        }
    }
}