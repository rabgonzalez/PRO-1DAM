package ies.puerto.Prueba.app;

import java.util.ArrayList;
import java.util.List;

public class AppFechas {
    static List<String> fechas;

    public static void main(String[] args) {
        String fecha1 = "22/01/24";
        fechas = new ArrayList<>();

        if(!fechas.contains(fecha1)) {
            fechas.add(fecha1);
        }

        System.out.println(fechas);
    }
}
