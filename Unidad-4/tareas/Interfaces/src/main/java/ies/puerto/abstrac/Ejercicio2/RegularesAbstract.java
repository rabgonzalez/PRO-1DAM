package ies.puerto.abstrac.Ejercicio2;

public abstract class RegularesAbstract {
    private float base;
    private float altura;

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

    public RegularesAbstract(){}

    public RegularesAbstract(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea(){
        return base*altura;
    }
}
