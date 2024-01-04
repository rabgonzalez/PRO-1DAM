package ies.puerto;

public class Persona7{
    private int edad;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona7(){}

    public Persona7(int edad){ 
        this.edad = edad;
    }

    public static void main(String[] args) {
        Persona7 persona = new Persona7(17);
        persona.setEdad(20);

        System.out.println(mayorEdad(persona.getEdad()));
    }

    public static boolean mayorEdad(int age){
        boolean result = false;
        if(age >= 18){
            result = true;
        }
        return result;
    }
}