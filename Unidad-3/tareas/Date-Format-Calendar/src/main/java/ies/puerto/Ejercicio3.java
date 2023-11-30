package ies.puerto;

import java.util.Calendar;

public class Ejercicio3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("la fecha es:" +dia+ "-" +mes+ "-" +año);
    }       
}