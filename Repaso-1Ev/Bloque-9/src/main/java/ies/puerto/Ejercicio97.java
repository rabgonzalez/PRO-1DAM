package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio97{
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce tu fecha de nacimiento");
        String text = scanner.nextLine();
        scanner.close();  

        System.out.println(edad(text));
    }

    public static Long edad(String text) throws ParseException{
        Date actualDate = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date userDate = format.parse(text);

        long years = (actualDate.getTime() - userDate.getTime())/1000/3600/24/365;
        return years;
    }
}
