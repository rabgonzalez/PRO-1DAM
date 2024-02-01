package ies.puerto.Ejercicio10.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppNombres {
    static List<String> nombres;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        nombres = new ArrayList<>();

        boolean continuar = true;
        String nombre;

        do {
            System.out.println("Introduce un nombre: ");
            nombre = scanner.next();
            nombres.add(nombre);

            System.out.println("¿Quieres continuar? (true/false)");
            continuar = scanner.nextBoolean();
        } while(continuar);

        nombres.sort(null);

        System.out.println(nombres);
    }
}