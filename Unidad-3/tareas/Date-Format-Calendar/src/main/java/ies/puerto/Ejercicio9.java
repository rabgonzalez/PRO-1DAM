package ies.puerto;

import java.util.Calendar;

public class Ejercicio9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int mes = calendar.getActualMinimum(calendar.DAY_OF_MONTH);
        System.out.println(mes);
    }    
}