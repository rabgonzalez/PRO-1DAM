package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio2 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        String fechaFormateada = formatoFecha.format(fechaActual);

        System.out.println("La fecha actual es: "+fechaFormateada);
    }
}