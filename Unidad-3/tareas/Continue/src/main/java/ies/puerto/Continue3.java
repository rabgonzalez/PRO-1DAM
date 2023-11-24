package ies.puerto;

public class Continue3 {
   public String pares(){
      String resultado = " ";
    for(int i = 1; i <= 20; i++){
      if(i % 2 != 0){
         continue;
      }
      resultado += i + " ";
    }
    return resultado;
   }
}
