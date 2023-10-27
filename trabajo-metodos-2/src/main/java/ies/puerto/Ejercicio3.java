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
    public int sumarNumeros(int valorA, int valorB){
        return (valorA + valorB);
    }
    public int sumarNumeros(int valorA, int valorB, int valorC){
        int resultado = sumarNumeros(valorA, valorB);
        return sumarNumeros(resultado, valorC);
    }
    public int sumarNumeros(int valorA, int valorB, int valorC, int valorD){
        int resultado = sumarNumeros(valorA, valorB, valorC);
        return sumarNumeros(resultado, valorD);
    }
    public int sumarNumeros(int valorA, int valorB, int valorC, int valorD, int valorE){
        int resultado = sumarNumeros(valorA, valorB, valorC, valorD);
        return sumarNumeros(resultado, valorE);
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
    public String mostrarNumeros(int valorA, int valorB, int valorC, int valorD, int valorE){
        String resultado = (valorA + "" + valorB + "" + valorC + "" + valorD + "" + valorE);
        return resultado;
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
    public int ordenCreciente(int valorA, int valorB){
        int mayor = valorB;
        if(valorA > valorB){
            mayor = valorA;
        }
        return mayor;
    }
    public int ordenCreciente(int valorA, int valorB, int valorC){
        int resultado = ordenCreciente(valorA, valorB);
        return ordenCreciente(resultado, valorC);
    }

    public int ordenDecreciente(int valorA, int valorB){
        int menor = valorA;
        if(valorA > valorB){
            menor = valorB;
        }
        return menor;
    }
    public int ordenDecreciente(int valorA, int valorB, int valorC){
        int resultado = ordenCreciente(valorA, valorB);
        return ordenCreciente(resultado, valorC);
    }

    public String mostrarResultado(int valorA, int valorB, int valorC){
        int mayor = ordenCreciente(valorA, valorB, valorC);
        int menor = ordenDecreciente(valorA, valorB, valorC);
        int intermedio = (valorA + valorB + valorC) - (ordenCreciente(valorA, valorB, valorC)+ordenDecreciente(valorA, valorB, valorC));
        String orden = mayor + "" + intermedio + "" + menor;
        return orden;
    }
}   
