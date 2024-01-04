package ies.puerto;

public class Persona6{
    private float edad;

    public float getEdad() {
        return this.edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public Persona6(){}

    public Persona6( float edad){ 
        this.edad = edad;
    }

    public static float promedioEdad(float[] personas){
        float sum = 0;
        for(int i = 0; i < personas.length; i++){
            sum += personas[i];
        }
        float result = sum/personas.length;
        return result;
    }

    public static void main(String[] args){
        Persona6 persona1 = new Persona6(15);
        Persona6 persona2 = new Persona6(30);
        Persona6 persona3 = new Persona6(20);
        Persona6 persona4 = new Persona6(60);
        float[] personas = {persona1.getEdad(), persona2.getEdad(), persona3.getEdad(), persona4.getEdad()};
        System.out.println(promedioEdad(personas));
    }
}