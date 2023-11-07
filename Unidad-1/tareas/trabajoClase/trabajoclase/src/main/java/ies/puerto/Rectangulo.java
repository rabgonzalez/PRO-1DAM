package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Rectangulo{
    private int Largo;
    private int Ancho;

    public int getLargo() {
        return this.Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public int getAncho() {
        return this.Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }
    
    public int areaRectangulo(int Ancho, int Largo){
        return Ancho * Largo;
    }

    public int perimetroRectangulo(int Ancho, int Largo){
        return 2*(Ancho + Largo);
    }
}