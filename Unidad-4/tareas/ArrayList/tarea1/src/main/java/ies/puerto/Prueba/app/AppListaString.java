package ies.puerto.Prueba.app;

import java.util.ArrayList;
import java.util.List;

public class AppListaString {
    static List<String> miLista;

    public static void main(String[] args) {
        String dni1 = "12345678H";
        String dni2 = "87654321R";
        miLista = new ArrayList<String>();

        addElement(dni1);
        addElement(dni2);
        System.out.println(miLista);

        boolean existeElemento = exists(dni1);
        if(existeElemento) {
            System.out.println("Existe el elemento "+dni1+" en la lista:" +miLista);
        }
    }

    public static boolean addElement(String dni){
        return miLista.add(dni);
    }

    public static boolean exists(String elemento){
        return miLista.contains(elemento);
    }
}
