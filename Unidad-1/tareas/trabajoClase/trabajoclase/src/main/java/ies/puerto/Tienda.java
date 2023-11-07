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

    public void mostrarProductos(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Precio: "+ Precio);
        System.out.println("Stock? " + Stock);
    }
    
    /**
     * Constructor para crear objetos
     */
    public Tienda(String Nombre){
        this.Nombre = Nombre;
    }

    public Tienda(String Nombre, int Precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public Tienda(String Nombre, int Precio, boolean Stock){
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
    }


    Tienda producto1 = new Tienda("Plátano", 1, true);
    Tienda producto2 = new Tienda("Silla", 25, true);
    Tienda producto3 = new Tienda("Pizza", 3, false);
    Tienda producto4 = new Tienda("iPhone", 1500, false);
}