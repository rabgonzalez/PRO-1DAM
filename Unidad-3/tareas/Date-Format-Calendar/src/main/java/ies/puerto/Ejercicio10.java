package ies.puerto;

import java.util.Calendar;

public class Ejercicio10 {
public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    int diaSemana = calendar.get(calendar.DAY_OF_WEEK);
    switch (diaSemana) {
        case 1:
            System.out.println("Quedan 5 días para el finde, estas a Lunes");
            break;
        case 2:
            System.out.println("Quedan 4 días para el finde, estas a Martes");
            break;
        case 3:
            System.out.println("Quedan 3 días para el finde, estas a Miércoles");
            break;
        case 4:
            System.out.println("Quedan 2 días para el finde, estas a Jueves");
            break;
        case 5:
            System.out.println("Quedan 1 días para el finde, estas a Viernes");
            break;
        case 6:
            System.out.println("Es fin de semana, estas a Sábado");
            break;
        case 7:
            System.out.println("Es fin de semana, estas a Domingo");
            break;
        }   
    } 
}