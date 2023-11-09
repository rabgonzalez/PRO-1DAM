package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Producto{
    private String Nombre;
    private int Precio;
    private boolean Stock;

    public Producto(){}

    public Producto(String Nombre, int Precio, boolean Stock){
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

    public boolean getStock() {
        return this.Stock;
    }

    public void setStock(boolean Stock) {
        this.Stock = Stock;
    }

    public String mostrarProductos(){
        return "Nombre: " + Nombre + " " + "Precio: " + Precio + " " + "Stock? " + Stock;
    }
}