package ies.puerto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio9 {
    Map<String, String> diccionario;

    public void importarDicionario(){
        diccionario = new HashMap<>();
        diccionario.put(".--.", "hola");
    }

    public boolean verificarTexto(String texto){
        String regex = "[A-z]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return matcher.find();
    }

    public String convertir(String texto){
        if(verificarTexto(texto)){
            return convertirMorse(texto);
        }
        return convertirTexto(texto);
    }

    public String convertirMorse(String texto){
        importarDicionario();
        String[] palabras = texto.split("\\s{2}");
        String textoConvertido = "";

        for(String palabra : palabras){
            String conversion = diccionario.get(palabra);
            textoConvertido += conversion;
        }
        return textoConvertido;
    }

    public String convertirTexto(String texto){
        importarDicionario();
        String[] palabras = texto.split("\\s");
        String textoConvertido = "";
        Set<String> llaves = diccionario.keySet();

        for(String palabra : palabras){
            for(String llave : llaves){
                if(diccionario.get(llave).equals(palabra)){
                    textoConvertido += llave;
                }
            }
        }
        return textoConvertido;
    }
}
