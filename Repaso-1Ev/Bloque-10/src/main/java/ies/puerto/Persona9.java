package ies.puerto;

/**
 * Si usas un scanner para introducir el nombre, el if de la línea 69 no lo detecta como que sean iguales
 * Por lo que he tenido que hacerlo con una variable en vez de pedir el valor por consola
 */

public class Persona9{
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

    public Persona9(){}

    public Persona9(String nombre){
        this.nombre = nombre;
    }

    public Persona9(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona9(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[] args) {
        String name = "Ruben";

        Persona9 persona1 = new Persona9("Ruben", "Abreu", 12);
        Persona9 persona2 = new Persona9("Raul", "Abreu", 79);
        Persona9 persona3 = new Persona9("Ruben", "Gonzalez", 19);
        Persona9 persona4 = new Persona9("Jonay", "Contreras", 36);

        Persona9[] personas = {persona1, persona2, persona3, persona4};

        System.out.println(mostrarInformacion(buscarPersonas(personas, name)));
    }

    public static Persona9[] buscarPersonas(Persona9[] personas, String name){
        int length = 0;
        for(int i = 0; i < personas.length; i++){
            if(name == personas[i].getNombre()){
                length++;
            } 
        }

        Persona9[] result = new Persona9[length];
        int j = 0;
        for(int i = 0; i < personas.length; i++){
             if(name == personas[i].getNombre()){
                result[j] = personas[i];
                j++;
            }
        }  
        return result;
    }
        

    public static String mostrarInformacion(Persona9[] result){
        String info = "";
        for(int i = 0; i < result.length; i++){
            info += result[i].getNombre()+ " "+result[i].getApellido()+", "+result[i].getEdad()+" años\n";
        }
        return info;
    }
}