package ies.puerto;

public class Continue5 {
   public String positivos(){
      int[] numeros = {-2, 5, -8, 10, 15, -3, 7};
      String resultado = " ";

      for(int i = 0; i < numeros.length; i++){
         if(numeros[i] < 0){
            continue;
         }
         resultado += numeros[i] + " ";
      }
      return resultado;
   }
}
