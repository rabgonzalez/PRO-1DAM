package ies.puerto;

/**
 * Realiza una función que realiza el cálculo del área en circulo.
 * @author rabgonzalez
 */

public class Ejercicio2 {

    /**
     * calcular el area del circulo
     * @param radio radio del circulo
     * @return operacion que calcula el area del circulo teniendo el valor de PI y el radio
     */

    public double areaCirculo(int radio) {
        double resultado = 0;
        double PI = 3.14;
        resultado = (radio*radio)*PI;

        return resultado;
    }
}