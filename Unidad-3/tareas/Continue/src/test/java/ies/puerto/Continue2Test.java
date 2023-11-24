package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Continue2Test {
   Continue2 continue2 = new Continue2();

   @Test
   public void Continue2TestOk(){
      String resultado = continue2.impares();
      String resultadoOk = " 1 3 5 7 9 11 13 15 17 19 ";
      Assertions.assertEquals(resultadoOk, resultado);
   }
}
