package ies.puerto;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio99{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce la cantidad de días");
        int amount = scanner.nextInt();
        scanner.close();  

        System.out.println(sumarDias(amount));
    }

    public static String sumarDias(int amount){
        Calendar calendar = Calendar.getInstance();

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)+amount);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String result = "Estaríamos a: "+day+"/"+month+"/"+year;
        return result;
    }
}
