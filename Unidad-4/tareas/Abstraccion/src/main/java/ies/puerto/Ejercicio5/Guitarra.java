package ies.puerto.Ejercicio5;

public class Guitarra implements InstrumentoMusical {
    @Override
    public void tocarNota(String nota){
        System.out.println("tocando nota "+nota);
    }

    @Override
    public void afinar(){
        System.out.println("Afinando guitarra...");
    }

    public void cambiarCuerdas(){
        System.out.println("Camnbiando cuerdas...");
    }
}
