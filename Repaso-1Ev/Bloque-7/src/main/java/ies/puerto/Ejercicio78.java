package ies.puerto;

import java.util.Scanner;

public class Ejercicio78{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        boolean game = true;
        
        do{
            System.out.println("Introduce tu jugada (1: piedra / 2: papel / 3: tijeras)");
            int play = scanner.nextInt();
            int computerPlay = (int) (Math.random() * 3) + 1;

            String[] jugada = {"piedra", "papel", "tijeras"};

            //empate
            if(play == computerPlay){
                System.out.println("Tu jugada: "+jugada[play-1]+"\nSu jugada: "+jugada[computerPlay-1]+"\nEMPATE");

            //ganas
            } else if(play == computerPlay+1){
                System.out.println("Tu jugada: "+jugada[play-1]+"\nSu jugada: "+jugada[computerPlay-1]+"\n¡HAS GANADO!");
            } else if(play == 1 && computerPlay == 3){
                System.out.println("Tu jugada: "+jugada[play-1]+"\nSu jugada: "+jugada[computerPlay-1]+"\n¡HAS GANADO!");

            
            //pierdes
            } else {
                System.out.println("Tu jugada: "+jugada[play-1]+"\nSu jugada: "+jugada[computerPlay-1]+"\n¡HAS PERDIDO!");

            }

            System.out.println("¿Quieres seguir jugando?");
            game = scanner.nextBoolean();
        } while(game);
        scanner.close();
    }
}