package ies.puerto;

public class AppAnimal {
    //static Animal animal;
    static Gato gato;
    static Perro perro;
    static Loro loro;
    static Serpiente serpiente;

    public static void main(String[] args) {
        //animal = new Animal();
        //System.out.println("Sonido Animal: "+animal.suSonido());

        gato = new Gato("pepe", "1");
        System.out.println("Su sonido: "+gato.suSonido());
        System.out.println(gato.toString());

        perro = new Perro("paco", "2");
        System.out.println("Su sonido: "+perro.suSonido());
        System.out.println(perro.toString());

        loro = new Loro("juanito", "3");
        System.out.println("Su sonido: "+loro.suSonido());
        System.out.println(loro.toString());

        serpiente = new Serpiente();
        System.out.println(serpiente.suSonido());
    }
}
