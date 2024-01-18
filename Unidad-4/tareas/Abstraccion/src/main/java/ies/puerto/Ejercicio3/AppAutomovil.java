package ies.puerto.Ejercicio3;

public class AppAutomovil {
    static Automovil automovil;

    public static void main(String[] args) {
        automovil = new Automovil();
        automovil.arrancar();
        automovil.conducir();
        automovil.detener();
    }
}
