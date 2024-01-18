package ies.puerto.impl.Ejercicio2;

import ies.puerto.abstrac.RegularesAbstract;
import ies.puerto.interfaz.IFormaGeometrica;

public class Rectangulo extends RegularesAbstract implements IFormaGeometrica {

    public Rectangulo(float lado){
        super(lado, lado);
    }

    public Rectangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    public float calcularArea(){
        return getBase() * getAltura();
    }
}
