package ies.puerto;

public class Ejercicio4 {
    
    public int contarPalabrasRepetidas(String texto){
        int contador = 0;
        String[] palabras = texto.toLowerCase().split(" ");
        
        for(int i = 0; i < palabras.length; i++){
            for(int j = i+1; j < palabras.length; j++){
                if(palabras[i].equals(palabras[j])){
                    contador++;
                }
            }
        }
        return contador;
    }
}
