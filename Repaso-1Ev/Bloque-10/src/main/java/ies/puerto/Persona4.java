package ies.puerto;

public class Persona4{
    private int edad;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona4(){}

    public Persona4( int edad){ 
        this.edad = edad;
    }

    public static void main(String[] args){
        Persona4 persona1 = new Persona4(18);
        Persona4 persona2 = new Persona4(44);
        persona1.setEdad(22);
        int age1 = persona1.getEdad();
        persona2.setEdad(11);
        int age2 = persona2.getEdad();
        System.out.println(persona1.compararEdad(persona1.getEdad(), persona2.getEdad()));
    }

    public String compararEdad(int age1, int age2){
        String result = "";
        if(age1 > age2){
            result = age1+" es mayor por "+ (age1-age2);
        } else {
            result = age2+" es mayor por "+ (age2-age1);
        }
        return result;
    }
}