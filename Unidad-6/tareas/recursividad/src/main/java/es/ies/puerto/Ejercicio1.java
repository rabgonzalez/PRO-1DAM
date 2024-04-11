package es.ies.puerto;

public class Ejercicio1 {

    public int cuentaRegresiva(int numero){
       if(numero == 1){
            return 1;
       }
       return numero * cuentaRegresiva(numero - 1);
    }
}