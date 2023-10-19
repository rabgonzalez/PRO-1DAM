import java.util.Scanner;
/**
 * @author rabgonzalez
 * Ejercicio Numero 7
 * Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
 */

public class Ej7 {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        int dia;
        System.out.println("Ingrea el número del día de la semana: ");
        dia = lectura.nextInt();
            
        switch(dia){
            case 1:
            System.out.println("Es lunes");
            break;
            case 2:
            System.out.println("Es martes");
            break;
            case 3:
            System.out.println("Es miércoles");
            break;
            case 4:
            System.out.println("Es jueves");
            break;
            case 5:
            System.out.println("Es viernes");
            break;
            case 6:
            System.out.println("Es sábado");
            break;
            case 7:
            System.out.println("Es domingo");
            break;
        }
        if(dia > 7)
        {
            System.out.println(dia+ " no es un día de la semana");
        }
    }
}