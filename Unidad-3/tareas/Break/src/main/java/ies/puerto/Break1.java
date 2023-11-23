package ies.puerto;

public class Break1 {
    public int primerDivisible(){
        int numero = 0;
        for(int i = 1; i <= 100; i++){
            if((i % 5 == 0) && (i % 7 == 0)){
                numero = i;
                break;
            }
        }
        return numero;
    }
}