import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 6
 * Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
 */

 /**
  * Revisar
  */
  
public class Ej6 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numero, resto = 0;
        int n = 0;
        System.out.println("Ingrea un valor: ");
        numero = lectura.nextInt();
            
        while(numero > 0)
        {
            resto = numero % 10;
            System.out.println(resto);
            n++;
            numero /= 10;
        }

        for(int i = n; i > 0; i--)
        {
            n = n*(resto*n);
            System.out.println(n);
        }
    }
}