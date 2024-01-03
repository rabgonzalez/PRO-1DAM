package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio98{
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce tu fecha de nacimiento");
        String text = scanner.nextLine();
        scanner.close();  

        System.out.println(edadCompleta(text));
    }

    public static String edadCompleta(String text) throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date userDate = format.parse(text);

        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(userDate);

        calendar2.set( (calendar2.get(Calendar.YEAR)-calendar.get(Calendar.YEAR)) , (calendar2.get(Calendar.MONTH)-calendar.get(Calendar.MONTH)), (calendar2.get(Calendar.DAY_OF_MONTH)-calendar.get(Calendar.DAY_OF_MONTH)));
        int year = calendar2.get(Calendar.YEAR);
        int month = calendar2.get(Calendar.MONTH)+1;
        int day = calendar2.get(Calendar.DAY_OF_MONTH);
        String result = "Tienes "+year+" años, "+month+" meses, "+day+" días.";
        return result;
    }
}
