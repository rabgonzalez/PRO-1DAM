package ies.puerto;

public class Break3 {
    public int sieteArray(){
        int[] array = {1, 5, 9, 7, 2};
        int valor = 0;

        for(int i : array){
            if(i == 7){
                valor = i;
                break;
            }
        }
        return valor;
    }
}
