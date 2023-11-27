package ies.puerto;

import java.util.Scanner;

public class Excepcion4 {
   public static void main(String[] args) throws Exception{
      String resultado = nulo();
      System.out.println("El resultado es: "+resultado);
   }

   public static String resultado(){
      return null;
   }

   public static String nulo() throws Exception{
      String resultado = "";

      try{
         resultado = resultado();
      } catch(NullPointerException e){
         String mensajeError = "El resultado es nulo";
         System.out.println("Mensaje del println "+mensajeError);
      }
      return resultado;
   }
}  
