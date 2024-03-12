package ies.puerto;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            int contador = 0;
            String fizzbuzz = "";
            if(i % 3 == 0){
                System.out.println(fizzbuzz+="fizz");
                contador++;
            }
            if(i % 5 == 0){
                System.out.println(fizzbuzz+="buzz");
                contador++;
            } 
            if(contador == 0) {
                System.out.println(i);
            }
        }
    }
}
