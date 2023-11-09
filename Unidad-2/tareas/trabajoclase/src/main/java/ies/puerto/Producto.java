package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Producto{
    private String Nombre;
    private int Precio;
    private int Stock;

    public Producto(){}

    public Producto(String Nombre, int Precio, int Stock){
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public int getPrecio() {
        return this.Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return this.Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String mostrarProductos(){
        return "Nombre: " + Nombre + " " + "Precio: " + Precio + " " + "Stock: " + Stock;
    }

    public int agregarProductos(int valorAgregado){
        return Stock + valorAgregado;
    }

    public int retirarProductos(int valorRetirado){
        return Stock - valorRetirado;
    }
}