package ies.puerto;

public class Break2 {
    public int primoMayor(){
        int numero= 100;
        int contador = 0;

        while(true){
            for(int i = 1; i <= numero/2; i++){
                if(numero % i == 0){
                    contador++;
                }
            }
            if(contador <= 2){
                break;
            }
            contador = 0;
            numero++;
        }
        return numero;
    }
}