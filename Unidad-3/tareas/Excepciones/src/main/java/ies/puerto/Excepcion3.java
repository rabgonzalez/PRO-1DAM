package ies.puerto;

import java.util.Scanner;

public class Excepcion3 {
   public static void main(String[] args) throws Exception{
      int posicion1 = solicitarPosicion();
      int[] array = new int[3];
      int resultado = valorPosicion(array, posicion1);
      System.out.println("El valor de salida es: " + resultado);
   }

   public static int solicitarPosicion(){
      Scanner lectura = new Scanner(System.in);
      int posicion;
      System.out.println("Introduzca la posicion del array: ");
      posicion = lectura.nextInt();
      return posicion;
   }

   public static int valorPosicion(int[] array, int posicion) throws Exception{
      int resultado = 0;

      try{
         resultado = array[posicion];
      } catch(ArrayIndexOutOfBoundsException e){
         String mensajeError = "El valor introducido es mayor que la longitud del array";
         System.out.println("Mensaje del Println "+mensajeError);
      }
      return resultado; 
   }

   public static int division(int[] array, int posicion1){
      int resultado = array[posicion1];
      return resultado;
   }
}  
