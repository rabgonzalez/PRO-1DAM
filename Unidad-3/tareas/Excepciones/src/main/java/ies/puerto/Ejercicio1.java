package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
   public static void main(String[] args){
      int numero1 = solicitarNumero();
      int numero2 = solicitarNumero();
      int resultado = division(numero1, numero2);
      System.out.println("Resultado de la division: "+resultado);
   }

   /**
    * Funcion que pide por teclado los números
    * @return resultado
    */
   public static int solicitarNumero() {
      int numero;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Introduzca un valor");
      numero= scanner.nextInt();
      return numero;
   }

   /**
    * Funcion que realiza la division de los numeros
    * @param dividendo de la division
    * @param divisor de la division
    * @return resultado
    */
   public static int division(int dividendo, int divisor){
      int resultado = 0;

      try{
         resultado = dividendo/divisor;
      } catch(ArithmeticException arithmeticException){
         String mensajeError = "Se intenta realizar una división por 0";
         System.out.println("Mensaje del println "+mensajeError);
         throw new Exception(mensajeError);
      }

      return resultado;
   }
}  
