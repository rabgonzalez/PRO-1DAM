package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio100{
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha");
        String text = scanner.nextLine();
        scanner.close();

        System.out.println(holiday(stringToCalendar(text)));
    }

    public static Calendar stringToCalendar(String text) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date userDate = format.parse(text);
        Calendar userCalendar = Calendar.getInstance();
        userCalendar.setTime(userDate);
        return userCalendar;
    }

    //No funciona
    public static boolean holiday(Calendar userCalendar){
        Calendar christmas = Calendar.getInstance();
        christmas.set(2024, 12, 25);
        Calendar newYear = Calendar.getInstance();
        newYear.set(2024, 12, 31);

        Calendar[] holidays = {christmas, newYear};

        boolean found = false;
        for(int i = 0; i < holidays.length; i++){
            if(userCalendar.compareTo(christmas) == 0){
                found = true;
            }
        }
        return found;
    }
}
