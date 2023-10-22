package ies.puerto;

/**
 * Realiza una función que realiza el cálculo del área en cuadrado y un rectángulo.
 * @author rabgonzalez
 */

public class Ejercicio3 {

    /**
     * calcular el area del cuadrado
     * @param a valor del lado del cuadrado
     * @return operacion que multiplica el lado por el lado
     */
    public int areaCuadrado(int a) {
        int resultado = 0;
        resultado = a * a;

        return resultado;
    }

    /**
     * calcular el area del cuadrado
     * @param a valor del primer lado del rectangulo
     * @param b valor del segudo lado del rectangulo
     * @return operacion que multiplica el lado a por el lado b
     */
    public int areaRectangulo(int a, int b) {
        int resultado = 0;
        resultado = a * b;

        return resultado;
    }
}