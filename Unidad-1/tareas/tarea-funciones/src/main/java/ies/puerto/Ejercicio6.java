package ies.puerto;

/**
 * Crear una función que convierte de grados Fahrenheit a Celsius.
 * @author rabgonzalez
 */
public class Ejercicio6 {

    /**
     * calcular la temperatura en grados Celsius
     * @param grados valor de la temperatura en Fahrenheit
     * @return operacion que pasa de grados Fahrenheit a grados Celsius
     */
    public double calcularTemperatura(int grados){
        double resultado = 0;
        resultado = ((5/9.0)*(grados - 32));

        return resultado;
    }
}
