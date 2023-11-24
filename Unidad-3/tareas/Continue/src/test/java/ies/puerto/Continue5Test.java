package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Continue5Test {
   Continue5 continue5 = new Continue5();

   @Test
   public void Continue5TestOk(){
      String resultado = continue5.positivos();
      String resultadoOk = " 5 10 15 7 ";
      Assertions.assertEquals(resultadoOk, resultado);
   }
}
