package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion5 {
   public static void main(String[] args) throws Exception{
      int numero1 = solicitarNumero();
      int numero2 = solicitarNumero();
      int resultado = sumatorio(numero1, numero2);
      System.out.println("El resultado de la suma es: "+resultado);
   }

   public static int solicitarNumero() throws Exception{
      Scanner lectura = new Scanner(System.in);
      int numero;
      System.out.println("Introduce un valor numerico: ");
      try{
         numero = lectura.nextInt();
      } catch(InputMismatchException e){
         String mensajeError = "No se ha intorducido un valor numerico";
         System.out.println("Mensaje del println "+mensajeError);
         throw new Exception(mensajeError);
      }
      return numero;
   }

   public static int sumatorio(int numero1, int numero2){
      int resultado = numero1 + numero2;;
      return resultado;
   }
}  
