package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    List<Integer> resultado = new ArrayList<>();

    public List<Integer> conteoRegresivoTradicional(int numero){
        for(int i = numero; i > 0; i--){
            resultado.add(i);
        }
        return resultado;
    }

    public List<Integer> conteoRegresivo(int numero){
        if(numero == 0){
            return resultado;
        }
        resultado.add(numero);
        return conteoRegresivo(numero - 1);
    }
}
