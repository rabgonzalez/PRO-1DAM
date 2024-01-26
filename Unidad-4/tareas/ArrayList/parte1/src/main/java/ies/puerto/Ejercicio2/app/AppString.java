package ies.puerto.Ejercicio2.app;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AppString {
    static List<String> listaCadenas;

     public static void main(String[] args) {
        listaCadenas = new ArrayList<>();
        listaCadenas.add("No comienzo por A");
        listaCadenas.add("Tampoco comienzo por A");
        listaCadenas.add("Aveces comienzo por A");
        listaCadenas.add("Adios mundo cruel");
        listaCadenas.add("El profe de pro es el mejor");
        listaCadenas.add("Le vamos a traer dulces");
        listaCadenas.add("Angelo trae la caja de dulces");

        int count = 0;
        for(String cadena : listaCadenas){
            if(comienzaPorA(cadena)){
                count++;
            }
        }
        System.out.println("La cantidad de cadenas que empiezan por A son: "+count);
    }

    public static boolean comienzaPorA(String cadena){
        String regex = "^[a|A].*";

        if(Pattern.matches(regex, cadena)){
            return true;
        }
        return false;
    }
}