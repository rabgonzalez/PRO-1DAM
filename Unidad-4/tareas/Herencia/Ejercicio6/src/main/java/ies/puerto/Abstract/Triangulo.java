package ies.puerto.Abstract;

public class Triangulo extends Figura{
    public Triangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    public String toString(){
        return "base: "+getBase()+", altura: "+getAltura();
    }
    
    @Override 
    public float calcularArea(){
        return (getBase()*getAltura())/2;
    }
}
