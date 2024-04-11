package es.ies.puerto;

public class Ejercicio4 {
    int temp;
    int resultado = 1;
    int valorAnterior = 0;

    public int fibonacci(int cantidad){
        if(cantidad <= 2){
            return 0;
        }

        temp = resultado;
        resultado += valorAnterior;
        valorAnterior = temp;
        System.out.println(resultado);
        return fibonacci(cantidad-1);
    }
}
