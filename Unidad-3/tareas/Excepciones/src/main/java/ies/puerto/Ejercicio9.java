package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {
   public static void main(String[] args) throws Excepcion9{
      Scanner lectura = new Scanner(System.in);

      System.out.print("Inserta un numero mayor o inferior a 0: ");
      int numero = lectura.nextInt();
      if(esPositivo(numero)){
         System.out.println("El numero "+numero+", es positivo");
      }
   }

   public static boolean esPositivo(int numero) throws Excepcion9{
      if(numero < 0){
         throw new Excepcion9("El numero "+numero+", es negativo");
      }
      return true;
   }
} 
