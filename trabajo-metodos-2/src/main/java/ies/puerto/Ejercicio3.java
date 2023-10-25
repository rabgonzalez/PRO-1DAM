package ies.puerto;

/**
 * Realiza un programa que contenga los suficientes métodos para: 
 * pedir 5 números,
 * mostrar los 5 números, 
 * muestra la suma y los muestra en orden creciente y en orden decreciente.
 * @author rabgonzalez
 */
public class Ejercicio3 {


    /**
     * Calcular la suma de los 5 valores
     * @param valorA primer valor
     * @param valorB segundo valor
     * @param valorC tercer valor
     * @param valorD cuarto valor
     * @param valorE quinto valor
     * @return suma de los 5 valores
     */
    public int sumarNumeros(int valorA, int valorB, int valorC, int valorD, int valorE){
        int resultado = 0;
        resultado = valorA + valorB + valorC + valorD + valorE;
        return resultado;
    }

    /**
     * Mostrar los 5 valores por pantalla
     * @param valorA primer valor
     * @param valorB segundo valor
     * @param valorC tercer valor
     * @param valorD cuarto valor
     * @param valorE quinto valor
     * @return valores en pantalla
     */
    public int mostrarNumeros(int valorA, int valorB, int valorC, int valorD, int valorE){
        int resultado = 0;
        return resultado = valorA;
    }

    /**
     * Ordenar los 5 valores de menor a mayor
     * @param valorA primer valor
     * @param valorB segundo valor
     * @param valorC tercer valor
     * @param valorD cuarto valor
     * @param valorE quinto valor
     * @return 
     */
    public int ordenCreciente(int valorA, int valorB, int valorC, int valorD, int valorE){
        int [] arrays = {valorA, valorB, valorC, valorD, valorE};
        int menor = 0;

        for( int i = 0; i <= 10; i++){
            menor= arrays[0];
            
            if(arrays[i] < menor){
            menor = arrays[i];
        }
    }
        return menor;
    }
}
