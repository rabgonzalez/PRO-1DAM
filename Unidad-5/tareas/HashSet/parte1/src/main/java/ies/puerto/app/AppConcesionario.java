package ies.puerto.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import ies.puerto.impl.Bicicleta;
import ies.puerto.impl.Camion;
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
    static Bicicleta bicicleta1;
    static Bicicleta bicicleta2;
    static Bicicleta bicicleta3;
    static Bicicleta bicicleta4;
    static Bicicleta bicicleta5;
    static Camion camion1;
    static Camion camion2;
    static Camion camion3;
    static Camion camion4;
    static Camion camion5;
    static HashSet<Coche> coches;
    static List<Motocicleta> motocicletas;
    static HashMap<String, Bicicleta> bicicletas;
    static HashMap<String, Camion> camiones;

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

        bicicleta1 = new Bicicleta("Trek","MountainBike","PQR456",30);
        bicicleta2 = new Bicicleta("Giant","CityBike","MNO789",25);
        bicicleta3 = new Bicicleta("Specialized","RoadBike","JKL012",28);
        bicicleta4 = new Bicicleta("Cannondale","HybridBike","DEF345",26);
        bicicleta5 = new Bicicleta("Schwinn","Cruiser","MNO678",22);
        bicicletas = new HashMap<>();
        bicicletas.get(bicicleta1.getMatricula());
        bicicletas.get(bicicleta2.getMatricula());
        bicicletas.get(bicicleta3.getMatricula());
        bicicletas.get(bicicleta4.getMatricula());
        bicicletas.get(bicicleta5.getMatricula());

        camion1 = new Camion("Chevrolet","Silverado","UVW567",150);
        camion2 = new Camion("Ford","Ranger","LMN890",130);
        camion3 = new Camion("Toyota","Hilux","PQR123",140);
        camion4 = new Camion("Nissan","Navara","ABC456",145);
        camion5 = new Camion("Dodge","Ram","XYZ789",160);
        camiones = new HashMap<>();
        camiones.get(camion1.getMatricula());
        camiones.get(camion2.getMatricula());
        camiones.get(camion3.getMatricula());
        camiones.get(camion4.getMatricula());
        camiones.get(camion5.getMatricula());

        concesionario = new Concesionario(coches, motocicletas, camiones, bicicletas);

        Scanner scanner = new Scanner(System.in);
        
    }
}
