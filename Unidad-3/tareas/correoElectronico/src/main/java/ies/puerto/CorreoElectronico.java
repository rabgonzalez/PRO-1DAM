package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CorreoElectronico {
    private String direccionCorreo;

    public CorreoElectronico(String direccionCorreo) throws CorreoInvalidoException {
       this.direccionCorreo = direccionCorreo;
       validar();
    }

   public static void main(String[] args)throws CorreoInvalidoException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su dirección de correo electrónico: ");
        CorreoElectronico correoElectronico = new CorreoElectronico(scanner.nextLine());
    }
    
    public void validar() throws CorreoInvalidoException {
        String regex = "^[a-zA-Z_$%·&?¿]+@[a-zA-Z_$%·&?¿]+\\.\\w{2,3}$";
        Pattern pattern = Pattern.compile(regex);
    
        if(pattern.matches(regex, direccionCorreo)){
            System.out.println("Formato de correo electrónico válido");
        } else {
            throw new CorreoInvalidoException("El formato de correo es erroneo");
        }
    }
}
