package ies.puerto;

/**
 * Realiza una función que realiza el cálculo del área en triángulo.
 * @author rabgonzalez
 */

public class Ejercicio1 {
 
    /**
     * Calcular area del triangulo
     * @param base base del triangulo
     * @param altura altura dell triangulo
     * @return operacion que calcula el area teniendo la base y la altura
     */

    public int areaTriangulo(int base, int altura) {
        int resultado = 0;
        resultado = (base * altura)/2;
        return resultado;
    }

}