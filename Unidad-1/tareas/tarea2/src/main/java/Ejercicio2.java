import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 2
 */

public class Ejercicio2 {
    /**
     * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. 
     * El algoritmo debe imprimir cual es el mayor y cual es el menor. 
     * Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. 
     * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
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

           if (valorA == valorB || valorA == valorC || valorB == valorC)
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
            if (valorB > valorC)
            {
                System.out.println("A es el mayor, C es el menor");
            }
            else
            {
                System.out.println("A es el mayor, B es el menor");
            }
       }

// vemos si el valor de la variable B es el mayor
       else if(valorB > valorA && valorB > valorC)
       {
            if (valorA > valorC)
            {
                System.out.println("B es el mayor, C es el menor");
            }
            else
            {
                System.out.println("B es el mayor, A es el menor");
            }
       }

// Si ni A ni B son las mayores, daremos por mayor a la variable C
       else
       {
            if (valorA > valorB)
            {
                System.out.println("C es el mayor, B es el menor");
            }
            else
            {
                System.out.println("C es el mayor, A es el menor");
            }
        }
    }
}