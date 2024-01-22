package ies.puerto.Prueba.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppListaInteger {
    static List<Integer> miListaEnteros;

    public static void main(String[] args) {
        miListaEnteros = new ArrayList<Integer>();
        addElement(1);
        addElement(2);

        List<Integer> subLista = new ArrayList<>();
        subLista.add(3);
        subLista.add(4);
        addSubLista(subLista);

        System.out.println(miListaEnteros);
    }

    public static boolean addElement(Integer elemento) {
        return miListaEnteros.add(elemento);
    }

    public static boolean removeElement(Integer elemento) {
        return miListaEnteros.remove(elemento);
    }

    public static boolean addSubLista(Collection subLista) {
        return miListaEnteros.addAll(subLista);
    }
}