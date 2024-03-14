package ies.puerto;

public class Ejercicio5 {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    public boolean palindromo(String text){
        String textoFormateado = text.toLowerCase().replace(" ", "");
        if(ejercicio3.invertirCadena(textoFormateado).equals(textoFormateado)){
            return true;
        }
        return false;
    }
}
