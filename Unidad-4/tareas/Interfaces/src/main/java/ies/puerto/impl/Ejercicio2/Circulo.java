package ies.puerto.impl.Ejercicio2;

import ies.puerto.interfaz.Ejercicio2.IFormaGeometrica;

public class Circulo implements IFormaGeometrica {
    private float radio;

    public float getRadio() {
        return this.radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo(){}

    public Circulo(float radio){
        this.radio = radio;
    }

    @Override
    public float calcularArea(){
        return 3.14f * (radio*radio);
    }
}
