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
        
        do {
            System.out.println(menu());
        } while (menu() == false);
    }

    static Scanner scanner = new Scanner(System.in);
    static Coche coche;
    static Motocicleta motocicleta;
    static Bicicleta bicicleta;
    static Camion camion;

    public static boolean menu(){
        System.out.println();
        System.out.println("****************************************");
        System.out.println("* Bienvenido al Concesionario de Rubén *");
        System.out.println("****************************************");
        System.out.println();
        System.out.println("Por favor, seleccione el tipo de vehículo a modificar");
        System.out.println("********************");
        System.out.println("* - 1) Coche       *");
        System.out.println("* - 2) Motocicleta *");
        System.out.println("* - 3) Bicicleta   *");
        System.out.println("* - 4) Camión      *");
        System.out.println("* - 5) Salir       *");
        System.out.println("********************");
        System.out.print("Opción [1, 2, 3, 4, 5]= ");
        int vehiculo = scanner.nextInt();

        switch (vehiculo) {
            case 1:
                do {
                System.out.println(coche());
                } while(coche() == false);
                return false;

            case 2:
                do {
                    System.out.println(motocicleta());
                } while(motocicleta() == false);
                return false;

            case 3:
                do {
                    System.out.println(bicicleta());
                } while(bicicleta() == false);
                return false;

            case 4:
                do{
                    System.out.println(camion());
                } while (camion() == false);
                return false;

            case 5:
                return true;
        
            default:
                System.out.println("Por favor, elige una opción existente");
                return false;
        }
    }

    public static boolean coche(){
        System.out.println();
        System.out.println("¿Qué acción quieres realizar?");
        System.out.println("*************************");
        System.out.println("* - 1) Añadir Coche     *");
        System.out.println("* - 2) Eliminar Coche   *");
        System.out.println("* - 3) Obtener Coche    *");
        System.out.println("* - 4) Modificar Coche  *");
        System.out.println("* - 5) Ver lista Coche  *");
        System.out.println("* - 6) Cambiar Vehículo *");
        System.out.println("*************************");
        System.out.print("Opción [1, 2, 3, 4, 5]= ");
        int accionCoche = scanner.nextInt();

        switch (accionCoche) {
            case 1:
                System.out.print("1. Introduce la marca del coche: ");
                String marca = scanner.next();
                System.out.print("2. Introduce el modelo del coche: ");
                String modelo = scanner.next();
                System.out.print("3. Introduce la matrícula del coche: ");
                String matricula = scanner.next();
                System.out.print("4. Introduce la velocidad del coche: ");
                int velocidad = scanner.nextInt();

                if(velocidad > coche.velocidadMaxima()){
                    System.out.println("La velocidad máxima permitida es de 180 km/h");
                    velocidad = coche.velocidadMaxima();
                }
                coche = new Coche(marca, modelo, matricula, velocidad);
                coches.add(coche);
                System.out.println("Añadido: "+coche);
                return false;

            case 2:
                System.out.print("1. Introduce la marca del coche: ");
                marca = scanner.next();
                System.out.print("2. Introduce el modelo del coche: ");
                modelo = scanner.next();
                System.out.print("3. Introduce la matrícula del coche: ");
                matricula = scanner.next();
                System.out.print("4. Introduce la velocidad del coche: ");
                velocidad = scanner.nextInt();

                coche = new Coche(marca, modelo, matricula, velocidad);
                if(coches.contains(coche)){
                    System.out.println("Eliminado: "+coche);
                    coches.remove(coche);
                } else {
                    System.out.println("Lo siento, ese coche no existe en nuestro concesionario");
                }
                return false;
            
            case 3:
                System.out.print("1. Introduce la marca del coche: ");
                marca = scanner.next();
                System.out.print("2. Introduce el modelo del coche: ");
                modelo = scanner.next();
                System.out.print("3. Introduce la matrícula del coche: ");
                matricula = scanner.next();
                System.out.print("4. Introduce la velocidad del coche: ");
                velocidad = scanner.nextInt();

                coche = new Coche(marca, modelo, matricula, velocidad);
                if(coches.contains(coche)){
                    System.out.println(coche);
                } else {
                    System.out.println("Lo siento, ese coche no existe en nuestro concesionario");
                }
                return false;
        
            case 4:
                System.out.print("1. Introduce la marca del coche: ");
                marca = scanner.next();
                System.out.print("2. Introduce el modelo del coche: ");
                modelo = scanner.next();
                System.out.print("3. Introduce la matrícula del coche: ");
                matricula = scanner.next();
                System.out.print("4. Introduce la velocidad del coche: ");
                velocidad = scanner.nextInt();

                coche = new Coche(marca, modelo, matricula, velocidad);
                if(!coches.contains(coche)){
                    System.out.println("Lo siento, ese coche no existe en nuestro concesionario");
                    return false;
                }

                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("******************");
                System.out.println("* - 1) Marca     *");
                System.out.println("* - 2) Modelo    *");
                System.out.println("* - 3) Velocidad *");
                System.out.println("******************");
                System.out.print("Opción [1, 2, 3]= ");
                int mod = scanner.nextInt();

                switch (mod) {
                    case 1:
                        System.out.print("Introduce la nueva marca: ");
                        marca = scanner.next();
                        coche.setMarca(marca);
                        return false;

                    case 2:
                        System.out.print("Introduce el nuevo modelo: ");
                        modelo = scanner.next();
                        coche.setModelo(modelo);
                        return false;

                    case 3:
                        System.out.print("Introduce la nueva velocidad: ");
                        velocidad = scanner.nextInt();
                        if(velocidad > coche.velocidadMaxima()){
                            System.out.println("La velocidad máxima permitida es de 180 km/h");
                            velocidad = coche.velocidadMaxima();
                        }
                        coche.setVelocidad(velocidad);
                        return false;
                
                    default:
                        System.out.println("Por favor, elige una opción existente");
                        return false;
                }

            case 5:
                System.out.println(coches);
                return false;
        
            case 6:
                return true;

            default:
                System.out.println("Por favor, elige una opción existente");
                return false;
        }
    }

    public static boolean motocicleta(){
        System.out.println();
        System.out.println("¿Qué acción quieres realizar?");
        System.out.println("*******************************");
        System.out.println("* - 1) Añadir Motocicleta     *");
        System.out.println("* - 2) Eliminar Motocicleta   *");
        System.out.println("* - 3) Obtener Motocicleta    *");
        System.out.println("* - 4) Modificar Motocicleta  *");
        System.out.println("* - 5) Ver lista Motocicleta  *");
        System.out.println("* - 6) Cambiar Vehículo       *");
        System.out.println("*******************************");
        System.out.print("Opción [1, 2, 3, 4, 5]= ");
        int accionMotocicleta = scanner.nextInt();

        switch (accionMotocicleta) {
            case 1:
                System.out.print("1. Introduce la marca de la motocicleta: ");
                String marca = scanner.next();
                System.out.print("2. Introduce el modelo de la motocicleta: ");
                String modelo = scanner.next();
                System.out.print("3. Introduce la matrícula de la motocicleta: ");
                String matricula = scanner.next();
                System.out.print("4. Introduce la velocidad de la motocicleta: ");
                int velocidad = scanner.nextInt();

                if(velocidad > motocicleta.velocidadMaxima()){
                    System.out.println("La velocidad máxima permitida es de 120 km/h");
                    velocidad = motocicleta.velocidadMaxima();
                }
                motocicleta = new Motocicleta(marca, modelo, matricula, velocidad);
                motocicletas.add(motocicleta);
                System.out.println("Añadida: "+motocicleta);
                return false;

            case 2:
                System.out.print("1. Introduce la marca de la motocicleta: ");
                marca = scanner.next();
                System.out.print("2. Introduce el modelo de la motocicleta: ");
                modelo = scanner.next();
                System.out.print("3. Introduce la matrícula de la motocicleta: ");
                matricula = scanner.next();
                System.out.print("4. Introduce la velocidad de la motocicleta: ");
                velocidad = scanner.nextInt();

                motocicleta = new Motocicleta(marca, modelo, matricula, velocidad);
                if(motocicletas.contains(motocicleta)){
                    System.out.println("Eliminada: "+motocicleta);
                    motocicletas.remove(motocicleta);
                } else {
                    System.out.println("Lo siento, esa motocicleta no existe en nuestro concesionario");
                }
                return false;
            
            case 3:
                System.out.print("1. Introduce la marca de la motocicleta: ");
                marca = scanner.next();
                System.out.print("2. Introduce el modelo de la motocicleta: ");
                modelo = scanner.next();
                System.out.print("3. Introduce la matrícula de la motocicleta: ");
                matricula = scanner.next();
                System.out.print("4. Introduce la velocidad de la motocicleta: ");
                velocidad = scanner.nextInt();

                motocicleta = new Motocicleta(marca, modelo, matricula, velocidad);
                if(motocicletas.contains(motocicleta)){
                    System.out.println(motocicleta);
                } else {
                    System.out.println("Lo siento, esa motocicleta no existe en nuestro concesionario");
                }
                return false;
        
            case 4:
                System.out.print("1. Introduce la marca de la motocicleta: ");
                marca = scanner.next();
                System.out.print("2. Introduce el modelo de la motocicleta: ");
                modelo = scanner.next();
                System.out.print("3. Introduce la matrícula de la motocicleta: ");
                matricula = scanner.next();
                System.out.print("4. Introduce la velocidad de la motocicleta: ");
                velocidad = scanner.nextInt();

                motocicleta = new Motocicleta(marca, modelo, matricula, velocidad);
                if(!motocicletas.contains(motocicleta)){
                    System.out.println("Lo siento, esa motocicleta no existe en nuestro concesionario");
                    return false;
                }

                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("******************");
                System.out.println("* - 1) Marca     *");
                System.out.println("* - 2) Modelo    *");
                System.out.println("* - 3) Velocidad *");
                System.out.println("******************");
                System.out.print("Opción [1, 2, 3]= ");
                int mod = scanner.nextInt();

                switch (mod) {
                    case 1:
                        System.out.print("Introduce la nueva marca: ");
                        marca = scanner.next();
                        motocicleta.setMarca(marca);
                        return false;

                    case 2:
                        System.out.print("Introduce el nuevo modelo: ");
                        modelo = scanner.next();
                        motocicleta.setModelo(modelo);
                        return false;

                    case 3:
                        System.out.print("Introduce la nueva velocidad: ");
                        velocidad = scanner.nextInt();
                        if(velocidad > motocicleta.velocidadMaxima()){
                            System.out.println("La velocidad máxima permitida es de 120 km/h");
                            velocidad = motocicleta.velocidadMaxima();
                        }
                        motocicleta.setVelocidad(velocidad);
                        return false;
                
                    default:
                        System.out.println("Por favor, elige una opción existente");
                        return false;
                }

            case 5:
                System.out.println(motocicletas);
                return false;

            case 6:
                return true;

            default:
                System.out.println("Por favor, elige una opción existente");
                return false;
        }
    }

    public static boolean bicicleta(){
        System.out.println();
        System.out.println("¿Qué acción quieres realizar?");
        System.out.println("*******************************");
        System.out.println("* - 1) Añadir Bicicleta       *");
        System.out.println("* - 2) Eliminar Bicicleta     *");
        System.out.println("* - 3) Obtener Bicicleta      *");
        System.out.println("* - 4) Modificar Bicicleta    *");
        System.out.println("* - 5) Ver lista Bicicletas   *");
        System.out.println("* - 6) Cambiar Vehículo       *");
        System.out.println("*******************************");
        System.out.print("Opción [1, 2, 3, 4, 5]= ");
        int accionBicicleta = scanner.nextInt();

        switch (accionBicicleta) {
            case 1:
                System.out.print("1. Introduce la marca de la bicicleta: ");
                String marca = scanner.next();
                System.out.print("2. Introduce el modelo de la bicicleta: ");
                String modelo = scanner.next();
                System.out.print("3. Introduce la matrícula de la bicicleta: ");
                String matricula = scanner.next();
                System.out.print("4. Introduce la velocidad de la bicicleta: ");
                int velocidad = scanner.nextInt();

                if(velocidad > bicicleta.velocidadMaxima()){
                    System.out.println("La velocidad máxima permitida es de 40 km/h");
                    velocidad = bicicleta.velocidadMaxima();
                }
                bicicleta = new Bicicleta(marca, modelo, matricula, velocidad);
                bicicletas.put(matricula, bicicleta);
                System.out.println("Añadida: "+bicicleta);
                return false;

            case 2:
                System.out.print("Introduce la matrícula de la bicicleta: ");
                matricula = scanner.next();

                bicicleta = new Bicicleta(matricula);
                if(bicicletas.containsKey(matricula)){
                    System.out.println("Añadida: "+bicicleta);
                    bicicletas.remove(matricula, bicicleta);
                } else {
                    System.out.println("Lo siento, esa bicicleta no existe en nuestro concesionario");
                }
                return false;
            
            case 3:
                System.out.print("Introduce la matrícula de la bicicleta: ");
                matricula = scanner.next();

                bicicleta = new Bicicleta(matricula);
                if(bicicletas.containsKey(matricula)){
                    System.out.println(bicicleta);
                } else {
                    System.out.println("Lo siento, esa bicicleta no existe en nuestro concesionario");
                }
                return false;
        
            case 4:
                System.out.print("Introduce la matrícula de la bicicleta: ");
                matricula = scanner.next();

                bicicleta = new Bicicleta(matricula);
                if(!bicicletas.containsKey(matricula)){
                    System.out.println("Lo siento, esa bicicleta no existe en nuestro concesionario");
                    return false;
                }

                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("******************");
                System.out.println("* - 1) Marca     *");
                System.out.println("* - 2) Modelo    *");
                System.out.println("* - 3) Velocidad *");
                System.out.println("******************");
                System.out.print("Opción [1, 2, 3]= ");
                int mod = scanner.nextInt();

                switch (mod) {
                    case 1:
                        System.out.print("Introduce la nueva marca: ");
                        marca = scanner.next();
                        bicicleta.setMarca(marca);
                        return false;

                    case 2:
                        System.out.print("Introduce el nuevo modelo: ");
                        modelo = scanner.next();
                        bicicleta.setModelo(modelo);
                        return false;

                    case 3:
                        System.out.print("Introduce la nueva velocidad: ");
                        velocidad = scanner.nextInt();
                        if(velocidad > bicicleta.velocidadMaxima()){
                            System.out.println("La velocidad máxima permitida es de 40 km/h");
                            velocidad = bicicleta.velocidadMaxima();
                        }
                        bicicleta.setVelocidad(velocidad);
                        return false;
                
                    default:
                        System.out.println("Por favor, elige una opción existente");
                        return false;
                }
        
            case 5:
                System.out.println(bicicletas);
                return false;

            case 6:
                return true;

            default:
                System.out.println("Por favor, elige una opción existente");
                return false;
        }
    }

    public static boolean camion(){
        System.out.println();
        System.out.println("¿Qué acción quieres realizar?");
        System.out.println("*******************************");
        System.out.println("* - 1) Añadir Camion          *");
        System.out.println("* - 2) Eliminar Camion        *");
        System.out.println("* - 3) Obtener Camion         *");
        System.out.println("* - 4) Modificar Camion       *");
        System.out.println("* - 5) Ver lista Camion       *");
        System.out.println("* - 5) Cambiar Vehículo       *");
        System.out.println("*******************************");
        System.out.print("Opción [1, 2, 3, 4, 5]= ");
        int accionBicicleta = scanner.nextInt();

        switch (accionBicicleta) {
            case 1:
                System.out.print("1. Introduce la marca del camion: ");
                String marca = scanner.next();
                System.out.print("2. Introduce el modelo del camion: ");
                String modelo = scanner.next();
                System.out.print("3. Introduce la matrícula del camion: ");
                String matricula = scanner.next();
                System.out.print("4. Introduce la velocidad del camion: ");
                int velocidad = scanner.nextInt();

                if(velocidad > camion.velocidadMaxima()){
                    System.out.println("La velocidad máxima permitida es de 160 km/h");
                    velocidad = camion.velocidadMaxima();
                }
                camion = new Camion(marca, modelo, matricula, velocidad);
                camiones.put(matricula, camion);
                System.out.println("Añadido: "+camion);
                return false;

            case 2:
                System.out.print("Introduce la matrícula del camion: ");
                matricula = scanner.next();

                camion = new Camion(matricula);
                if(camiones.containsKey(matricula)){
                    System.out.println("Eliminado: "+camion);
                    camiones.remove(matricula, camion);
                } else {
                    System.out.println("Lo siento, ese camion no existe en nuestro concesionario");
                }
                return false;
            
            case 3:
                System.out.print("Introduce la matrícula del camion: ");
                matricula = scanner.next();

                camion = new Camion(matricula);
                if(camiones.containsKey(matricula)){
                    System.out.println(camion);
                } else {
                    System.out.println("Lo siento, ese camion no existe en nuestro concesionario");
                }
                return false;
        
            case 4:
                System.out.print("Introduce la matrícula del camion: ");
                matricula = scanner.next();

                camion = new Camion(matricula);
                if(!camiones.containsKey(matricula)){
                    System.out.println("Lo siento, ese camion no existe en nuestro concesionario");
                    return false;
                }

                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("******************");
                System.out.println("* - 1) Marca     *");
                System.out.println("* - 2) Modelo    *");
                System.out.println("* - 3) Velocidad *");
                System.out.println("******************");
                System.out.print("Opción [1, 2, 3]= ");
                int mod = scanner.nextInt();

                switch (mod) {
                    case 1:
                        System.out.print("Introduce la nueva marca: ");
                        marca = scanner.next();
                        camion.setMarca(marca);
                        return false;

                    case 2:
                        System.out.print("Introduce el nuevo modelo: ");
                        modelo = scanner.next();
                        camion.setModelo(modelo);
                        return false;

                    case 3:
                        System.out.print("Introduce la nueva velocidad: ");
                        velocidad = scanner.nextInt();
                        if(velocidad > camion.velocidadMaxima()){
                            System.out.println("La velocidad máxima permitida es de 160 km/h");
                            velocidad = camion.velocidadMaxima();
                        }
                        camion.setVelocidad(velocidad);
                        return false;
                
                    default:
                        System.out.println("Por favor, elige una opción existente");
                        return false;
                }
        
            case 5:
                System.out.println(camiones);
                return false;

            case 6:
                return true;

            default:
                System.out.println("Por favor, elige una opción existente");
                return false;
        }
    }
}