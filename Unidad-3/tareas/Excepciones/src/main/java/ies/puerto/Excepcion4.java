package ies.puerto;

public class Excepcion4 {
   public static void main(String[] args) throws Exception{
      String resultado = nulo();
      System.out.println("El resultado es: "+resultado);
   }

   public static String nulo() throws Exception{
      String resultado = null;

      try{
         resultado.length();
      } catch(NullPointerException e){
         String mensajeError = "El resultado es nulo";
         System.out.println("Mensaje del println "+mensajeError);
      }
      return resultado;
   }
}  
