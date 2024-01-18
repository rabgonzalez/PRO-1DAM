package ies.puerto.Ejercicio1;

public class ReproductorMP3 implements Reproductor {
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo MP3");
    }

    @Override
    public void detener(){
        System.out.println("MP3 detenido");
    }
}
