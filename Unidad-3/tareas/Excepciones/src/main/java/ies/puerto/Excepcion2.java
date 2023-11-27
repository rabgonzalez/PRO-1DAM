package ies.puerto;

import java.util.Scanner;

public class Excepcion2 {
   public static void main(String[] args) throws Exception{
      String strNumero = solicitarNumero();
      int numero = transformarNumeroStrInt(strNumero);
      System.out.println("Numero transformado: "+numero);
   }

   public static String solicitarNumero() {
      Scanner lectura = new Scanner(System.in);
      System.out.println("Introduzca un valor");
      return lectura.nextLine();
   }

   static int transformarNumeroStrInt(String strNumero) throws Exception{
      int resultado = 0;

      try{
         resultado = Integer.parseInt(strNumero);
      } catch(NumberFormatException e){
         throw new Exception("El valor introducido: " +strNumero+ ", no es un numero");
      }
      
      return resultado;
   }
}  
