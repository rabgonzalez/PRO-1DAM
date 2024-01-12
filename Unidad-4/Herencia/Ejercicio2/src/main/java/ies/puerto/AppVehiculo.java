package ies.puerto;

public class AppVehiculo {
    static Coche coche;
    static Motocicleta motocicleta;

    public static void main(String[] args) {
        coche = new Coche("Seat", "Panda", 13500);
        System.out.println(coche.toString());
        System.out.println(coche.mostrarInformacion());

        System.out.println();

        motocicleta = new Motocicleta("Vespa", "Primavera", 5000);
        System.out.println(motocicleta.toString());
        System.out.println(motocicleta.mostrarInformacion());
    }
}
