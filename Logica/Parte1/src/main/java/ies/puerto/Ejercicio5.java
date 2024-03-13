package ies.puerto;

public class Ejercicio5 {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    public boolean palindromo(String text){
        if(ejercicio3.invertirCadena(text).equals(text)){
            return true;
        }
        return false;
    }
}
