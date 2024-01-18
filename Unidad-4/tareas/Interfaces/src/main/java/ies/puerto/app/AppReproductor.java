package ies.puerto.app;

import ies.puerto.impl.Ejercicio1.ReproductorMP3;

public class AppReproductor {
    static ReproductorMP3 mp3;

    public static void main(String[] args) {
        mp3 = new ReproductorMP3();
        System.out.println(mp3.reproducir());
        System.out.println(mp3.detener());
    }
}
