package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {
    List<Integer> resultado = new ArrayList<>();

    public List<Integer> imprimirImparesTradicional(int numero){
        for(int i = 1; i <= numero; i++){
            if(i % 2 != 0){
                resultado.add(i);
            }
        }
        return resultado;
    }

    public List<Integer> imprimirImpares(int numero){
        if(numero == 0){
            return resultado;
        }
        if(numero % 2 != 0){
            resultado.add(0, numero);
        }
        return imprimirImpares(numero - 1);
    }
}
