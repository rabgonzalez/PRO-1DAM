package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BancoTest{

    Banco banco1 = new Banco(1, "Yo", 100);

    @Test
    public void depositarDineroOK(){
        int resultado = banco1.depositarDinero(100);
        int resultadoOK = 200;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void retirarDineroOK(){
        int resultado = banco1.retirarDinero(50);
        int resultadoOK = 50;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void mostrarSaldoActualOK(){
        String resultado = banco1.mostrarSaldoActual();
        String resultadoOK = "Yo, usted tiene: 100€";
        Assertions.assertEquals(resultado, resultadoOK);
    }
    
    @Test
    public void getNombreTitularOK(){
        String resultado = banco1.getNombreTitular();
        String resultadoOK = "Yo";
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getNumeroCuentaOK(){
        int resultado = banco1.getNumeroCuenta();
        int resultadoOK = 1;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void getSaldoOK(){
        int resultado = banco1.getSaldo();
        int resultadoOK = 100;
        Assertions.assertEquals(resultado, resultadoOK);
    }

    @Test
    public void setSaldoOK(){
        banco1.setSaldo(200);
        int resultado = banco1.getSaldo();
        int resultadoOK = 200;
        Assertions.assertEquals(resultado, resultadoOK);
    }
}
