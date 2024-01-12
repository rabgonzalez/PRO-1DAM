package ies.puerto;

public class Coche extends Motor {
    
    public Coche(){
        super();
    }

    public Coche(String color) {
        super(color);
    }

    public Coche(String color, String matricula){
        super(color);
        setMatricula(matricula);
    }

    @Override
    public String toString(){
        String mensaje = "Yo soy un Coche";
        //return "Yo soy un Coche, mi color es: "+getColor();
        if(getColor() != null){
            mensaje += ", mi color es: "+getColor();
        }
        if(getMatricula() != null){
            mensaje += ", mi matrícula es: "+getMatricula();
        }
        return mensaje;
    }
}
