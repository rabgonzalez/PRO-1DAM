package es.ies.puerto.enumerado;

public enum ColorArcoiris {
    ROJO("ROJO"),
    NARANJA("NARANJA"),
    AMARILLO("AMARILLO"),
    VERDE("VERDE"),
    AZUL("AZUL"),
    ANIL("ANIL"),
    VIOLETA("VIOLETA");

    private String color;

    private ColorArcoiris(){
    }

    private ColorArcoiris(final String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}
