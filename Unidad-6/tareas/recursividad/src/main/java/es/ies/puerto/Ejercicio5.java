package es.ies.puerto;

public class Ejercicio5 {

    public int factorial(int valor){
        if(valor == 1){
            return valor;
        }
        return valor * factorial(valor - 1);
    }
}
