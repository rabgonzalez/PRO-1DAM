package es.ies.puerto;

public class Ejercicio6 {

    public int potencia(int base, int exponente){
        if(exponente == 0){
            return 1;
        }
        
        if(exponente == 1){
            return base;
        }
        return base * potencia(base, exponente - 1);
    }
}
