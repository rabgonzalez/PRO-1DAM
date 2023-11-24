package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Continue1Test {
   Continue1 continue1 = new Continue1();

   @Test
   public void Continue1TestOk(){
      String resultado = continue1.unoAlVeinte();
      String resultadoOk = " 1 2 4 5 7 8 10 11 13 14 16 17 19 20 ";
      Assertions.assertEquals(resultadoOk, resultado);
   }
}
