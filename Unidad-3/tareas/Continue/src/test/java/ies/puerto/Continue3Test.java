package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Continue3Test {
   Continue3 continue3 = new Continue3();

   @Test
   public void Continue3TestOk(){
      String resultado = continue3.pares();
      String resultadoOk = " 2 4 6 8 10 12 14 16 18 20 ";
      Assertions.assertEquals(resultadoOk, resultado);
   }
}
