package ies.puerto;

public class UtilidadesCal {
    private float a;
    private float b;

    public UtilidadesCal(){}

    public UtilidadesCal(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float suma(){
        return a+b;
    }

    public float resta(){
        return a-b;
    }

    public float multiplicacion(){
        return a*b;
    }

    public float dividir(){
        return a/b;
    }
}
