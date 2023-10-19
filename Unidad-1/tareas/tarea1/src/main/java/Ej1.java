/**
 * @author rabgonzalez
 */

public class Ej1 {

    /**
     * Descripcion del algoritmo
     * Escribe un programa en Java que imprima el patrón siguiente:
     * 1 
     * 2 3 
     * 4 5 6 
     * 7 8 9 10 
     * @param args
     */
     
    public static void main(String[] args)
    {
        int numero = 1;

        for(int columna = 1; columna <= 4; columna ++){

            for(int fila = 1; fila <= columna; fila++){
                System.out.print(numero+ " ");
                numero++;
            }

            System.out.println();
        }
    }
}