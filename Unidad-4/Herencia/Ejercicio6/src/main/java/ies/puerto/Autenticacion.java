package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autenticacion extends Persona {

    public Autenticacion(String nombre, int edad, String dni){
        super(nombre, edad, dni);
    }

    public boolean credencialOK(){
        String regex = "^\\d{8}[A-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(getDni());
        boolean matchFound = matcher.find();

        boolean bool = false;
        if(matchFound){
            bool = true;
        }
        return bool;
    }
}
