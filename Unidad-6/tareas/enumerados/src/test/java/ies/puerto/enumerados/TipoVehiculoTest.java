package ies.puerto.enumerados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.enumerado.TipoVehiculo;

public class TipoVehiculoTest {
    TipoVehiculo tipoVehiculo;

    @Test
    public void tipoVehiculoBiciTest(){
        tipoVehiculo = tipoVehiculo.BICICLETA;
        Assertions.assertEquals(4, tipoVehiculo.getTipo());
    }
}
