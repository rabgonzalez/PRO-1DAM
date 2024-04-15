package es.ies.puerto;

public class Ejercicio8 {
    
    public int sumaDigitosTradicional(int numero){
        int suma = 0;
        for(int i = 1; i <= numero; i++){
            suma += i;
        }
        return suma;
    }

    public int sumaDigitos(int numero){
        if(numero == 1){
            return 1;
        }
        return numero + sumaDigitos(numero - 1);
    }
}
