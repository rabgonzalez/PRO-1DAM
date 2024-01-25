package ies.puerto.Prueba.app;

import java.util.ArrayList;
import java.util.List;

import ies.puerto.Prueba.impl.Persona;

public class AppPersona {
    static Persona ramon;
    static Persona juan;

    static String dni1 = "12345678P";
    static String dni2 = "87654321H";

    static List<Persona> personas;
    static List<Double> calificaciones;

    public static void main(String[] args) {
        ramon = new Persona(dni1, "Ramon", "Gonzalez", "Perez", 8);
        juan = new Persona(dni2, "Juan", "Perez", "Gonzalez", 9);

        personas = new ArrayList<Persona>();
        personas.add(ramon);
        personas.add(juan);
        System.out.println(personas);

        Persona ramon2 = new Persona(dni1, "Ramon", "Gonzalez", "Perez", 8);
        if(personas.contains(ramon2)) {
            System.out.println("La lista contiene a "+ramon);
        }

        calificaciones = new ArrayList<>();
        calificaciones.add(8d);
        calificaciones.add(9d);
        System.out.println(ramon.media());
    }

    public static Double media() {
        Double resultado = 0d;
        Double suma = 0d;
        if (calificaciones.isEmpty()) {
            return resultado;
        }
        for(Double nota:calificaciones) {
            suma += nota;
        }
        return suma;
    }
}
