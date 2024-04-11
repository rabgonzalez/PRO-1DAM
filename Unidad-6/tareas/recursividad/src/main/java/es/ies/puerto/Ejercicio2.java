package es.ies.puerto;

public class Ejercicio2 {

    public int sumaNaturales(int cantidad){
        if(cantidad == 0){
            return 0;
        }
        return cantidad + sumaNaturales(cantidad - 1);
    }
}
