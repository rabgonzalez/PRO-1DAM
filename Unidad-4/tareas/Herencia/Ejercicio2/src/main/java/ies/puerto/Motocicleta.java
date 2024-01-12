package ies.puerto;

public class Motocicleta extends Vehiculo {
    private int cc;
    public Motocicleta(String nombre, String marca, String modelo, int precio, int cc){
        super(nombre, marca, modelo, precio);
        this.cc = cc;
    }

    @Override
    public String toString(){
        return "Soy una motocicleta";
    }

    @Override 
    public String mostrarInformacion(){
        return "Conductor: "+getNombre()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nPrecio: "+getPrecio()+"\nCentímetros cúbicos: "+cc+" CC";
    }
}
