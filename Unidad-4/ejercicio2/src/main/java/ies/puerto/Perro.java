package ies.puerto;

public class Perro extends Especie {
    
    public Perro(String nombre, String chip){
        super(nombre, chip);
    }

    @Override
    public String suSonido(){
        return "guau";
    }
}
