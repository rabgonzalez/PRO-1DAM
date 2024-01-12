package ies.puerto;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int precio;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Vehiculo(){}

    public Vehiculo(String marca, String modelo, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String toString(){
        return "Soy un vehículo";
    }

    public String mostrarInformacion(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+" €";
    }
}
