package ies.puerto;

public class Ejercicio6 {
/**
 * Crear una función que convierte de grados Fahrenheit a Celsius.
 * @author rabgonzalez
 */
    public double calcularTemperatura(int grados){
        double resultado = 0;
        resultado = ((5/9.0)*(grados - 32));

        return resultado;
    }
}
