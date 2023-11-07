package ies.puerto;

/**
 * Realizar un programa que calcule el sueldo de un trabajador, 
 * el programa debe de tener un método que reciba el numero de horas que has trabajado en un mes, 
 * las horas se pagan a 10€.
 * @author rabgonzalez
 */
public class Ejercicio1 {

    /**
     * Calcular el sueldo de un trabajador segun las horas de trabajo
     * @param numeroHoras numero de horas trabajadas al mes
     * @return calculo de numero de horas * 10€ la hora
     */
    public int calcularSueldoHoras(int numeroHoras){
        return (numeroHoras*10);
    }
}