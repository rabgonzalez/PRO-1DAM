package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Circulo{
    private double Radio;

    public Circulo(){}

    public double getRadio(){
        return this.Radio;
    }

    public void setRadio(double Radio){
        this.Radio = Radio;
    }

    public double areaCirculo(double Radio){
        double PI = 3.14;
        return PI*(Radio*Radio);
    }

    public double circunferenciaCirculo(double Radio){
        double PI = 3.14;
        return 2*PI*Radio;
    }
}

