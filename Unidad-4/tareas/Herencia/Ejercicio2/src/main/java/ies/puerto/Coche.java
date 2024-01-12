package ies.puerto;

public class Coche extends Vehiculo {
    private String motor;

    public Coche(String nombre, String marca, String modelo, int precio, String motor){
        super(nombre, marca, modelo, precio);
        this.motor = motor;
    }

    @Override
    public String toString(){
        return "Soy un coche";
    }

    @Override 
    public String mostrarInformacion(){
        return "Conductor: "+getNombre()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nPrecio: "+getPrecio()+"\nMotor: "+motor;
    }
}
