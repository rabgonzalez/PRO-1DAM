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
        
        System.out.println(numeroComun());
        
    }

    public static boolean numeroComun(){
        for(Integer numero:array1){
            if(array2.contains(numero)){
                return true;
            }
        }
        return false;
    }

    /** 
    public static boolean numeroComunRecursivo(List<Integer> array1, List<Integer> array2){

        if(array2.size() > array1.size()){
            numeroComunRecursivo(array2, array1);
        }

        for(Integer numero:array1){
            if(array2.contains(numero)){
                return true;
            }
        }
        return false;
    }
    */
}
