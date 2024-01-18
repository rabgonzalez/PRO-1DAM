package ies.puerto.Ejercicio3;

public class Automovil implements Conductor {
    @Override
    public void arrancar(){
        System.out.println("Automovil arrancado");
    }

    @Override
    public void detener(){
        System.out.println("Automovil detenido");
    }

    public void conducir(){
        System.out.println("Conduciendo...");
    }
}
