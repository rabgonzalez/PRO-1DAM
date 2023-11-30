package ies.puerto;

import java.util.Date;

public class Ejercicio6 {
    public static void main(String[] args) {
        Date fecha1 = new Date();
        Date fecha2 = new Date();   

        if(fecha1.equals(fecha2)){
            System.out.println("Son iguales");
        } else{
            System.out.println("No son iguales");
        }
    }    
}