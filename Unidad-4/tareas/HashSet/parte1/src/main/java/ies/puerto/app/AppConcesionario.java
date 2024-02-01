package ies.puerto.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import ies.puerto.impl.Coche;
import ies.puerto.impl.Concesionario;
import ies.puerto.impl.Motocicleta;

public class AppConcesionario {
    static Concesionario concesionario;
    static Coche coche1;
    static Coche coche2;
    static Coche coche3;
    static Coche coche4;
    static Coche coche5;
    static Motocicleta motocicleta1;
    static Motocicleta motocicleta2;
    static Motocicleta motocicleta3;
    static Motocicleta motocicleta4;
    static Motocicleta motocicleta5;
    static HashSet<Coche> coches;
    static List<Motocicleta> motocicletas;

    public static void main(String[] args) {
        coche1 = new Coche("Toyota","Corolla","ABC123",60);
        coche2 = new Coche("Honda","Civic","XYZ789",75);
        coche3 = new Coche("Ford","Mustang","DEF456",100);
        coche4 = new Coche("Chevrolet","Impala","GHI789",80);
        coche5 = new Coche("Volkswagen","Golf","JKL012",65);
        coches = new HashSet<>();
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);

        motocicleta1 = new Motocicleta("Harley-Davidson","Sportster","MNO345",50);
        motocicleta2 = new Motocicleta("Yamaha","YZF R6","PQR678",90);
        motocicleta3 = new Motocicleta("Ducati","Monster","STU901",70);
        motocicleta4 = new Motocicleta("Suzuki","GSX-750","VWX234",80);
        motocicleta5 = new Motocicleta("Kawasaki","Ninja","ZAB567",85);
        motocicletas = new ArrayList<>(Arrays.asList(motocicleta1, motocicleta2, motocicleta3, motocicleta4));

        concesionario = new Concesionario(coches, motocicletas);

        System.out.println("Velocidad máxima motocicletas: "+motocicleta4.velocidadMaxima());
        System.out.println("Velocidad máxima coches: "+coche2.velocidadMaxima());
        System.out.println();
        System.out.println("Velocidad media coches: "+concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media motocicletas: "+concesionario.velocidadMediaMotocicletas());
        System.out.println("Velocidad media vehiculos: "+concesionario.velocidadMediaVehiculos()); 
        System.out.println();
        System.out.println(concesionario.addCoche(coche5));
        System.out.println(concesionario.removeCoche(coche1));
        System.out.println(concesionario.obtenerCoche("JKL012"));
        System.out.println();
        System.out.println(concesionario.addMotocicleta(motocicleta5));
        System.out.println(concesionario.removeMotocicleta(motocicleta1));
        System.out.println(concesionario.obtenerMotocicleta("VWX234"));
        System.out.println();
        System.out.println(concesionario);
    }
}
