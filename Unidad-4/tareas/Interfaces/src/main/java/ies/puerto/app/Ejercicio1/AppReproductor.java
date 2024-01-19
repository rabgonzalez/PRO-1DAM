package ies.puerto.app.Ejercicio1;

import ies.puerto.impl.Ejercicio1.ReproductorMP3;
import ies.puerto.interfaz.Ejercicio1.IReproductor;

public class AppReproductor {
    static IReproductor mp3;

    public static void main(String[] args) {
        mp3 = new ReproductorMP3();
        System.out.println(mp3.reproducir());
        System.out.println(mp3.detener());
    }
}
