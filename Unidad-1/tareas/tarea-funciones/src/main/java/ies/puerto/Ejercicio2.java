package ies.puerto;

/**
 * Realiza una función que realiza el cálculo del área en circulo.
 * @author rabgonzalez
 */

public class Ejercicio2 {

    /**
     * 
     * @param radio
     * @return
     */

    public double areaCirculo(int radio) {
        double resultado = 0;
        double PI = 3.14;
        resultado = (radio*radio)*PI;

        return resultado;
    }
}