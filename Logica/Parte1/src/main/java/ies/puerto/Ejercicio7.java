package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {
    
    public int mayuscula(String texto){
        String regex = "\\s*([a-z]+)\\s*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);

        int contador = 0;
        while(matcher.find()){
            contador++;
        }
        return contador;
    }
}
