package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio6 {
    
    public int diasDiferencia(String fecha1, String fecha2){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = new Date();
        Date date2 = new Date();
        try{
            date1 = formatoFecha.parse(fecha1);
            date2 = formatoFecha.parse(fecha2);
        }catch (ParseException e){
            e.getMessage();
        }

        long date1ToMil = date1.getTime()/(1000L*3600L*24L);
        long date2ToMil = date2.getTime()/(1000L*3600L*24L);
        return (int) (date1ToMil-date2ToMil);
    }
}
