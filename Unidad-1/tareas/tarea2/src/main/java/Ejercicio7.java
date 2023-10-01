/**
 * @author rabgonzalez
 * Ejercicio Numero 7
 */
import java.util.Scanner;

public class Ejercicio7 {

    /**
     * Descripcion del algoritmo
     * Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada en kilómetros por hora, proporcione la velocidad en metros por segundo.
     * @param args
     */
    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args)
    {
        double numero;
        System.out.println("Introduce el valor:");
        numero = lectura.nextDouble();
        double conversion = numero / 3.6; // Pasamos los km/h de numero a m/s dividiendo entre 3.6
        System.out.println("el autormovil va a: " + conversion + " m/s");
    }
}

