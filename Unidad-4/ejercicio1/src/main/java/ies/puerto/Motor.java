package ies.puerto;

public class Motor extends Vehiculo {
    private String matricula;

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Motor(){
        super();
    }

    public Motor(String color){
        super(color);
    }

    public Motor(String color, String matricula){
        super(color);
        this.matricula = matricula;
    }
}
