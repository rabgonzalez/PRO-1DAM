package ies.puerto;

public class Ejercicio3 {
    
    public String invertirCadena(String cadena){
        String cadenaInvertida = "";
        for(int i = cadena.length()-1; i >= 0; i--){
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }
}
