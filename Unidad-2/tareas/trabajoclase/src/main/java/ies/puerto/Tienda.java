package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Tienda{
    private String Nombre;
    private int Precio;
    private boolean Stock;

    /**
     * Getter y Setter
     */
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
    
    /**
     * Constructor para crear objetos
     */
    public Tienda(){}

    public Tienda(String Nombre, int Precio, boolean Stock){
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
    }
}