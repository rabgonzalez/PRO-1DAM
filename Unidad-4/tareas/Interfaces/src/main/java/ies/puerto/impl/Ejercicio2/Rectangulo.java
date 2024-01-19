package ies.puerto.impl.Ejercicio2;

import ies.puerto.abstrac.Ejercicio2.RegularesAbstract;
import ies.puerto.interfaz.Ejercicio2.IFormaGeometrica;

public class Rectangulo extends RegularesAbstract implements IFormaGeometrica {

    public Rectangulo(float lado){
        super(lado, lado);
    }

    public Rectangulo(float base, float altura){
        super(base, altura);
    }
}
