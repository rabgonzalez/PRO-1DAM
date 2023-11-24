package ies.puerto;

public class Break5 {
    public int divisor5MayorQue30(){
        int divisor = 31;

        while(true){
            if(divisor % 5 == 0){
                break;
            }
            divisor++;
        }
        return divisor;
    }
}
