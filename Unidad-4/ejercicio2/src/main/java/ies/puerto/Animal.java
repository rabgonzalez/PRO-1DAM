package ies.puerto;

public abstract class Animal {
    private String chip;
    private String nombre;

    public Animal(){}

    public Animal(String nombre, String chip){
        this.nombre = nombre;
        this.chip = chip;
    }

    public String suSonido(){
        return "soy un sonido de Animal";
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", chip: "+chip;
    }
}
