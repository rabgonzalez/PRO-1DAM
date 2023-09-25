import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 2
 */

public class Ejercicio2 {
    /**
     * Descripcion del algoritmo
     * @param args
     */

// declarar variables
    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args){
       int valorA;
       int valorB;
       int valorC;

// mientras el if sea verdadero, se crea un bucle que pide valores distintos debido a que una de las variables se repite
       while(true)
       {
           System.out.println("Ingresa el valor de A:");
           valorA = lectura.nextInt();
           System.out.println("Ingresa el valor de B:");
           valorB = lectura.nextInt();
           System.out.println("Ingresa el valor de C:");
           valorC = lectura.nextInt();

           if (valorA == valorB || valorA == valorC)
           {
               System.out.println("No repitas valores");
           }
        
// si la condicion es falsa, rompemos el bucle y buscamos la variable mayor
           else
           {
               break;
           }
       }

// vemos si el valor de la variable A es el mayor
       if (valorA > valorB && valorA > valorC)
       {
            System.out.println("A es el mayor");
       }

// vemos si el valor de la variable B es el mayor
       else if(valorB > valorA && valorB > valorC)
       {
            System.out.println("B es el mayor");
       }

// Si ni A ni B son las mayores, daremos por mayor a la variable C
       else
       {
            System.out.println("C es el mayor");
        }
    }
}