package ies.puerto;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Clase realiza el primer ejercicio de las tares
 */
public class Main {
    public static void main(String[] args) {

        int valorA;
        int valorB;

        Scanner lectura = new Scanner(System.in);

        //Bloque 1: Pide valor por pantalla y asigna valor


        //Bloque 2: Verifica si los valores son iguales
        do{
            System.out.println("Ingresa el valor de A:");
            valorA = lectura.nextInt();
            System.out.println("Valor de A:" + valorA);

            System.out.println("Ingresa el valor de B:");
            valorB = lectura.nextInt();
            System.out.println("Valor de B:" + valorB);

            if(valorA > valorB){
                System.out.println("A es el mayor");
            }else{
                System.out.println("B es el mayor");
            }
        } while(valorA == valorB);

        //Bloque 3: Verifica si A > B


        //Muestra por pantalla el valor mayor

    }
}