package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Rectangulo{
    private int Largo;
    private int Ancho;

    public Rectangulo(){}

    public Rectangulo(int Largo, int Ancho){
        this.Largo = Largo;
        this.Ancho = Ancho;
    }

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
    
    public int areaRectangulo(){
        return Ancho * Largo;
    }

    public int perimetroRectangulo(){
        return 2*(Ancho + Largo);
    }
}