package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio93{
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce una fecha");
        String text = scanner.nextLine();
        scanner.close();
        
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date userDate = format.parse(text);

        System.out.println(dayOfWeek(dateToCalendar(userDate)));
    }

    public static Calendar dateToCalendar(Date userDate) throws ParseException{
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(userDate);
        return calendar;
    }

    public static String dayOfWeek(Calendar calendar){
        int DayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
        String result = "Sábado";
        switch (DayOfWeek) {
            case 1:
                result = "Domingo";
                break;
            case 2:
                result = "Lunes";
                break;
            case 3:
                result = "Martes";
                break;
            case 4:
                result = "Miércoles";
                break;
            case 5:
                result = "Jueves";
                break;
            case 6:
                result = "Viernes";
                break;
            }
        return result;
    }
}
