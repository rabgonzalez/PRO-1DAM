package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio8 {
    public static void main(String[] args) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        String fecha1 = "30-11-2023";
        Date fecha = formatoFecha.parse(fecha1);

        System.out.println(fecha);
    }    
}