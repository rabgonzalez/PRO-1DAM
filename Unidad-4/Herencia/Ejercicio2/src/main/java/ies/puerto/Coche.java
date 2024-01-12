package ies.puerto;

public class Coche extends Vehiculo {
    
    public Coche(String marca, String modelo, int precio){
        super(marca, modelo, precio);
    }

    @Override
    public String toString(){
        return "Soy un coche";
    }
}
