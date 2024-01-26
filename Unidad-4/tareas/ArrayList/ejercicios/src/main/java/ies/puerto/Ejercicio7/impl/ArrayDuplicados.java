package ies.puerto.Ejercicio7.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDuplicados {
    static List<String> cadenaTexto;

    public static void main(String[] args) {
        cadenaTexto = new ArrayList<>(Arrays.asList("hola", "me", "llamo", "ruben", "hola"));

        System.out.println(valorRepetido());
    }

    public static List<String> valorRepetido() {
        List<String> resultado = new ArrayList<>(); 

        for(String duplicado:cadenaTexto){
            if(!resultado.contains(duplicado)){
                resultado.add(duplicado);
            }
        }
        return resultado;
    }
}
