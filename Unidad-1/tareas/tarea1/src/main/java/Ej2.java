import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 2
 * Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. 
 * Se debe solicitar los números por teclado.
 */

public class Ej2 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int valorA, valorB, valorMayor;
        System.out.println("Ingresa el primer valor:");
        valorA = lectura.nextInt();
        System.out.println("Ingresa el segundo valor:");
        valorB = lectura.nextInt();

        if(valorA > valorB)
        {
            valorMayor = valorA;
        }
        else
        {
            valorMayor = valorB;
        }

        for(int divisor = valorMayor/2; divisor > 0; divisor--)
        {
            if(valorA % divisor == 0 || valorB % divisor == 0)
            {
                System.out.println(divisor+ " es el divisor más grande");
                break;
            }
        }
    }    
}