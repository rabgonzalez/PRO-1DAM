package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Continue4Test {
   Continue4 continue4 = new Continue4();

   @Test
   public void Continue4TestOk(){
      String resultado = continue4.mayorQue50();
      String resultadoOk = " 60 80 70 ";
      Assertions.assertEquals(resultadoOk, resultado);
   }
}
