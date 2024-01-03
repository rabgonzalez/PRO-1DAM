package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio96{
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce una fecha");
        String text = scanner.nextLine();
        System.out.println("Introduce la cantidad de días que quieres sumar");
        int days = scanner.nextInt();
        scanner.close();  

        System.out.println(stringToCalendar(text, days));
    }

    public static String stringToCalendar(String text, int days) throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date userDate = format.parse(text);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(userDate);

        calendar.add(Calendar.DAY_OF_MONTH, days);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH)+1;
        int year = calendar.get(Calendar.YEAR);
        String result = day+"/"+month+"/"+year;
        return result;
    }
}
