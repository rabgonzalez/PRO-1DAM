package ies.puerto;

public class AppVehiculo {
    static Coche coche;
    static Motocicleta motocicleta;

    public static void main(String[] args) {
        coche = new Coche("Ruben", "Seat", "Panda", 13500, "gasolina");
        System.out.println(coche.toString());
        System.out.println(coche.mostrarInformacion());

        System.out.println();

        motocicleta = new Motocicleta("Joatham", "Vespa", "Primavera", 5000, 200);
        System.out.println(motocicleta.toString());
        System.out.println(motocicleta.mostrarInformacion());
    }
}
