package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Circulo{
    private double Radio;

    public Circulo(){}

    public Circulo(double Radio){
        this.Radio = Radio;
    }

    public double getRadio(){
        return this.Radio;
    }

    public void setRadio(double Radio){
        this.Radio = Radio;
    }

    public double areaCirculo(){
        double PI = 3.14;
        return PI*(Radio*Radio);
    }

    public double circunferenciaCirculo(){
        double PI = 3.14;
        return 2*PI*Radio;
    }
}

