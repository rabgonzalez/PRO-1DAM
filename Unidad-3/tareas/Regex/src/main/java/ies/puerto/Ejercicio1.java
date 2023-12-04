package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu correo electronico: ");
        String email = scanner.nextLine();

        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";

        String checker = "Algo ha salido mal";
        if(Pattern.matches(regex, email)){
            checker = "válido";
        }
        System.out.println(checker);
    }
}