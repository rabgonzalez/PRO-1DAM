package ies.puerto.Ejercicio1;

public class AppReproductor {
    static ReproductorMP3 mp3;

    public static void main(String[] args) {
        mp3 = new ReproductorMP3();
        mp3.reproducir();
        mp3.detener();
    }
}
