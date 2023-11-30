package ies.puerto;

import java.util.Calendar;

public class Ejercicio7 {
    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        
        int resultado = calendar1.compareTo(calendar2);
        System.out.println(resultado);
    }    
}
/** int diferenciaDia;
         int diferenciaMes;
         int diferenciaAño;

        if(calendar1.after(calendar2)){
            diferenciaDia = calendar1.get(Calendar.DAY_OF_MONTH) - calendar2.get(Calendar.DAY_OF_MONTH);
            diferenciaMes = calendar1.get(Calendar.MONTH) - calendar2.get(Calendar.MONTH);
            diferenciaAño = calendar1.get(Calendar.YEAR) - calendar2.get(Calendar.YEAR);
        } else {
            diferenciaDia = calendar2.get(Calendar.DAY_OF_MONTH) - calendar1.get(Calendar.DAY_OF_MONTH);
            diferenciaMes = calendar2.get(Calendar.MONTH) - calendar1.get(Calendar.MONTH);
            diferenciaAño = calendar2.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR);
        }
        */