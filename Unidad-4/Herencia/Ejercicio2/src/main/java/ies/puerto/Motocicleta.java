package ies.puerto;

public class Motocicleta extends Vehiculo {
    
    public Motocicleta(String marca, String modelo, int precio){
        super(marca, modelo, precio);
    }

    @Override
    public String toString(){
        return "Soy una motocicleta";
    }
}
