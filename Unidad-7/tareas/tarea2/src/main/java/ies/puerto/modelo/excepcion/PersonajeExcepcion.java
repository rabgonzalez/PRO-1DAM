package ies.puerto.modelo.excepcion;

public class PersonajeExcepcion extends Exception {
    public PersonajeExcepcion(String mensaje){
        super(mensaje);
    }

    public PersonajeExcepcion(String mensaje, Throwable tipo){
        super(mensaje, tipo);
    }
}
