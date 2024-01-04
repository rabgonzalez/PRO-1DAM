package ies.puerto;

public class Persona8{
    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona8(){}

    public Persona8(String nombre){
        this.nombre = nombre;
    }

    public Persona8(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona8(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Persona8 persona1 = new Persona8("Ruben", "Abreu", 12);
        Persona8 persona2 = new Persona8("Raul", "Abreu", 79);
        Persona8 persona3 = new Persona8("Ruben", "Gonzalez", 19);
        Persona8 persona4 = new Persona8("Jonay", "Contreras", 36);

        Persona8[] personas = {persona4, persona3, persona2, persona1};

        System.out.println(mostrarInformacion(ordenarPersonas(personas)));
    }

    public static Persona8[] ordenarPersonas(Persona8[] personas){
        Persona8 temp;
        for(int i = 0; i < personas.length; i++){
            for(int j = i+1; j < personas.length; j++){
                if(personas[i].getEdad() >= personas[j].getEdad()){
                    temp = personas[i];
                    personas[i] = personas[j];
                    personas[j] = temp;
                }
            }
        }
        return personas;
    }

    public static String mostrarInformacion(Persona8[] personas){
        String info = "";
        for(int i = 0; i < personas.length; i++){
            info += personas[i].getNombre()+ " "+personas[i].getApellido()+", "+personas[i].getEdad()+" años\n";
        }
        return info;
    }
}