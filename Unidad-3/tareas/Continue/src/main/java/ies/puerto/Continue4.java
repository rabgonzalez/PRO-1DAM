package ies.puerto;

public class Continue4 {
   public String mayorQue50(){
      int[] numeros = {40, 60, 30, 80, 50, 45, 70};
      String resultado = " ";

      for(int i = 0; i < numeros.length; i++){
         if(numeros[i] <= 50){
         continue;
         }
         resultado += numeros[i] + " ";
      }
      return resultado;
   }
}
