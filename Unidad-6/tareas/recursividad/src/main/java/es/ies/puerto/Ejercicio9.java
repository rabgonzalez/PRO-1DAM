package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
    List<Integer> resultado = new ArrayList<>();

    public List<Integer> serieNumeroTradicional(int numero){
        for(int i = 1; i <= numero; i++){
            resultado.add(i);
        }
        return resultado;
    }

    public List<Integer> serieNumero(int numero){
        if(numero == 0){
            return resultado;
        }
        resultado.add(0, numero);
        return serieNumero(numero - 1);
    }
}
