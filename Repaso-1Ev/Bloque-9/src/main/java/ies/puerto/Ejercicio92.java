package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio92{
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce una fecha:");
        String text = scanner.nextLine();
        scanner.close();

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date actualDate = new Date();

        try{
            Date userDate = format.parse(text);
            long result = (actualDate.getTime() - userDate.getTime())/1000/3600/24;
            System.out.println(result);
        } catch (ParseException e){
            throw new ParseException("formato de fecha incorrecto", 0);
        } 
    }
}
