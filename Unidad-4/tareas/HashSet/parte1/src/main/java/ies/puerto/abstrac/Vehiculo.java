package ies.puerto.abstrac;
import java.util.Objects;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private int velocidad;

    public Vehiculo() {}

    public Vehiculo(int velocidad){
        this.velocidad = velocidad;
    }

    public Vehiculo(String marca, String modelo, String matricula, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

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

    public String getMatricula() {
        return this.matricula;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehiculo)) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, matricula, velocidad);
    }

    @Override
    public String toString() {
        return "Soy un vehiculo\nmarca= "+getMarca()+", modelo= "+getModelo()+", matricula= "+getMatricula()+", velocidad= "+getVelocidad();
    }
}
