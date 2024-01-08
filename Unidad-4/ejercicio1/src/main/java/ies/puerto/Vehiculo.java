package ies.puerto;

public class Vehiculo {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehiculo(){}
    
    public Vehiculo(String color) {
        this.color = color;
    }

    public void mover() {
        System.out.println("El vehículo se está moviendo:");
    }

    private void apagar(){
        System.out.println("El vehículo esta apagado");
    }

    public void miColor(){
        System.out.println("Mi color es: "+color);
    }

    public String toString(){
        return "Mi color es: "+color;
    }
}