package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio94{
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce el día y mes");
        String text = scanner.nextLine();
        scanner.close();
        
        System.out.println(dateToCalendar(dateFormat(text)));
    }

    public static Date dateFormat(String text) throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/MM");
        Date userDate = format.parse(text);
        return userDate;
    }

    public static int dateToCalendar(Date userDate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(userDate); 

        int dayOfMonth = calendar.get(calendar.DAY_OF_MONTH);
        int daysForMonth = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
        int result = daysForMonth - dayOfMonth;
        return result;
    }
}
