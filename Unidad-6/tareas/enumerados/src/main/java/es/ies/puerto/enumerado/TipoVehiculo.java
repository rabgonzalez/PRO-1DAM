package es.ies.puerto.enumerado;

public enum TipoVehiculo {
    COCHE(1),
    MOTOCICLETA(2),
    CAMION(3),
    BICICLETA(4);

    private int tipo;

    private TipoVehiculo(int tipo){
        this.tipo = tipo;
    }

    public int getTipo(){
        return this.tipo;
    }
}
