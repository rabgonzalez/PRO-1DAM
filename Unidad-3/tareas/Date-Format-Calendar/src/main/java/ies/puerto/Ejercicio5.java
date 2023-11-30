package ies.puerto;

import java.util.Calendar;

public class Ejercicio5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)-1, calendar.get(Calendar.DAY_OF_MONTH));
        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);


        System.out.println("" +dia + "-" +mes+ "-" +año);
    }       
}