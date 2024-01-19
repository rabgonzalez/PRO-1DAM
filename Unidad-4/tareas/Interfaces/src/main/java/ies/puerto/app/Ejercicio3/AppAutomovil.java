package ies.puerto.app.Ejercicio3;

import ies.puerto.impl.Ejercicio3.Automovil;

public class AppAutomovil {
    static Automovil automovil;

    public static void main(String[] args) {
        automovil = new Automovil();
        automovil.arrancar();
        automovil.conducir();
        automovil.detener();
    }
}
