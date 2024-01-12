package ies.puerto;

public class App {
    static Coche miCoche;
    static Coche miCocheColor;
    static Coche miCocheMatricula;
    static Bicicleta miBicicleta;

    public static void main(String[] args) {
        miCoche = new Coche();
        miCoche.mover();
        miCoche.miColor();

        miCocheColor = new Coche("Rojo");
        miCocheColor.mover();
        miCocheColor.miColor();
        System.out.println(miCocheColor.toString());

        miBicicleta = new Bicicleta("L", "Azul");
        miBicicleta.mover();
        miBicicleta.miColor();
        System.out.println(miBicicleta.toString());

        miCocheMatricula = new Coche(null, "hdabwdbad");
        System.out.println(miCocheMatricula.toString());
    }
}
