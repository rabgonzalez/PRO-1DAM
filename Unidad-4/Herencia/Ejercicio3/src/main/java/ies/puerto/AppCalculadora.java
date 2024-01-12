package ies.puerto;

import java.util.Scanner;

public class AppCalculadora {
    static Calculadora calculadora;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 2 valores:");
        float valorA = scanner.nextFloat();
        float valorB = scanner.nextFloat();

        System.out.println("¿Que operación desea realizar? \nOperaciones= 1) suma 2) resta 3) multiplicacion 4) division");
        int oper = scanner.nextInt();
        scanner.close();

        calculadora = new Calculadora(valorA, valorB);
        switch (oper) {
            case 1:
            System.out.println(calculadora.suma());
                break;
            case 2:
            System.out.println(calculadora.resta());
                break;
            case 3:
            System.out.println(calculadora.multiplicacion());
                break;
            case 4:
            System.out.println(calculadora.dividir());
                break;
            default:
            System.out.println("No ha introducido una operacion disponible");
                break;
        }
        
    }
}
