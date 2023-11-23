package ies.puerto;

public class Break4 {
    public int negativoArray(){
        int[] array = {2, -4, 6, -8};
        int valor = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                valor = array[i];
                break;
            }
        }
        return valor;
    }
}
