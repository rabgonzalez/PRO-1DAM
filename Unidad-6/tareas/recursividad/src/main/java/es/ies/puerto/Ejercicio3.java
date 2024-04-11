package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public List<Integer> imprimirPares(int cantidad){
        List<Integer> resultado = new ArrayList<>();
        if(cantidad == 0){
            return resultado;
        }
        if(cantidad % 2 == 0){
            resultado.add(cantidad);
        }
        resultado.addAll(imprimirPares(cantidad - 1));
        return resultado;
    }
}
