package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio95{
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce una fecha");
        String text = scanner.nextLine();
        scanner.close();  

        System.out.println(dateComparison(dateFormat(text)));
    }

    public static Date dateFormat(String text) throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date userDate = format.parse(text);
        return userDate;
    }

    public static String dateComparison(Date userDate){
        Date actualDate = new Date();
        int comparison = userDate.compareTo(actualDate);

        String result = "Las fechas son iguales";
        if(comparison > 0){
            result = userDate +" es más tardía que "+actualDate;
        } else if(comparison < 0){
            result = actualDate +" es más tardía que "+userDate;
        }
        return result;
    }
}
