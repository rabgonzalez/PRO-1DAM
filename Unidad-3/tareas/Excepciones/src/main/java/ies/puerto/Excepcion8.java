package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion8 {
   public static void main(String[] args) throws Exception{
      int numero1 = solicitarNumero();
      int numero2 = solicitarNumero();
      int resultado = division(numero1, numero2);
      System.out.println("El resultado de la division es: "+resultado);
   }
   
   public static int solicitarNumero() throws Exception{
      Scanner lectura = new Scanner(System.in);
      int numero = 0;
      System.out.println("Introduce un valor numerico: ");

      try{
         numero = lectura.nextInt();
      } catch (InputMismatchException e){
         String mensajeError = "No se ha introducido un número";
         System.out.println("Mensaje del println "+mensajeError);
      }
      return numero;
   }
   
   public static int division(int numero1, int numero2) throws Exception{
      int resultado = 0;
      resultado = numero1 / numero2;
      return resultado;
   }
} 
