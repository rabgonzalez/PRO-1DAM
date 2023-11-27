package ies.puerto;

import java.util.Scanner;

public class Excepcion7 {
   public static void main(String[] args) throws IllegalArgumentException{
      Scanner lectura = new Scanner(System.in);
      System.out.println("Introduzca un valor:");
      int valor = lectura.nextInt();

      if(valor < 0){
         throw new IllegalArgumentException(valor +" no es un valor positivo");
      }
   }
} 
