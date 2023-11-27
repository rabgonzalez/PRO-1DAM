package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion7 {
   public static void main(String[] args) throws Exception{
      int numero1 = solicitarNumero();
      int numero2 = solicitarNumero();
      int resultado = division(numero1, numero2);
      System.out.println("El resultado de la division es: "+resultado);
   }
   
   public static int solicitarNumero(){
      Scanner lectura = new Scanner(System.in);
      int numero;
      System.out.println("Introduce un valor numerico: ");
      numero = lectura.nextInt();
      return numero;
   }
   
   public static int division(int numero1, int numero2) throws Exception{
   int resultado = 0;
   
   try{
      resultado = numero1 / numero2;
   } catch(InputMismatchException e){
      String mensajeError = "No se ha intorducido un valor numerico";
      System.out.println("Mensaje del println "+mensajeError);
      throw new Exception(mensajeError);
   }
   return resultado;
   }
} 
