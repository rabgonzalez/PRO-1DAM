package ies.puerto.Ejercicio4.app;


import java.util.ArrayList;
import java.util.List;


public class AppListaComun {
    static List<Integer> array1;
    static List<Integer> array2;

    public static void main(String[] args) {
        array1 = new ArrayList<>();
        array1.add(1);
        array1.add(3);
        array1.add(9);
        System.out.println(array1);

        array2 = new ArrayList<>();
        array2.add(2);
        array2.add(4);
        array2.add(9);
        System.out.println(array2);

        System.out.println("Array más pequeño: "+arrayMasPequeño(array1, array2));
        System.out.println("Array más grande: "+arrayMasGrande(array1, array2));
        System.out.println(numeroComun());
        
    }

    public static List<Integer> arrayMasGrande(List<Integer> array1, List<Integer> array2){
        if(array1.size() > array2.size()){
            return array1;
        }
        return array2;
    }

    public static List<Integer> arrayMasPequeño(List<Integer> array1, List<Integer> array2){
        if(array1.size() > array2.size()){
            return array2;
        }
        return array1;
    }

    public static Object numeroComun(){
        Object[] arrayMasPequeño = arrayMasPequeño(array1, array2).toArray();
        Object[] arrayMasGrande = arrayMasGrande(array1, array2).toArray();

        for(int i=0; i < arrayMasGrande.length; i++){
            for(int j=0; j < arrayMasPequeño.length; j++){
                if(arrayMasGrande[i] == arrayMasPequeño[j]){
                    return arrayMasGrande[i];
                }
            }
        }
        return false;
    }
}
