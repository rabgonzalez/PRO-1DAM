package ies.puerto;


public class Ejercicio7 {
    
    public String mayuscula(String texto){
        String[] palabras = texto.toLowerCase().split(" ");
        String resultado = "";

        for(String palabra : palabras){
            resultado += palabra.toUpperCase().charAt(0)+palabra.substring(1)+" ";
        }
        return resultado;
    }
}
