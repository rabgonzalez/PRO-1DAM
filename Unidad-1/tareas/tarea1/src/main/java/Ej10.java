import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 10
 * Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
 */

public class Ej10 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int suma = 0;
        int n;
        System.out.println("Ingrea el número: ");
        n = lectura.nextInt();
        int s = 2;

        do {
            if(s % 2 == 0)
            {
               suma += s;
            }
            s++;
        } while (s <= n);
        System.out.println(suma);
    }
}