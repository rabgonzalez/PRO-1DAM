package ies.puerto.Abstract;

public abstract class Figura {
    private float base;
    private float altura;
    private float profundidad;

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getProfundidad(){
        return this.profundidad;
    }

    public void setProfundidad(float profundidad){
        this.profundidad = profundidad;
    }

    public Figura(){}

    public Figura(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public Figura(float base, float altura, float profundidad){
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    @Override
    public String toString(){
        return "base: "+base+", altura: "+altura+", profundidad: "+profundidad;
    }

    public abstract float calcularArea();
}
