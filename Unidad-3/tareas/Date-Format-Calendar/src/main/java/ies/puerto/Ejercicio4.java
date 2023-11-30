package ies.puerto;

import java.util.Calendar;

public class Ejercicio4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)+10);
        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH)+1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);


        System.out.println("" +dia + "-" +mes+ "-" +año);
    }       
}