package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Libro{
    private String Titulo;
    private String Autor;
    private int AnioPublicacion;

    public Libro(){}
    
    public Libro(String Titulo, String Autor, int AnioPublicacion){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AnioPublicacion = AnioPublicacion;

    }

    public String getTitulo(){
        return this.Titulo;
    }

    public String getAutor(){
        return this.Autor;
    }

    public int getAnioPublicacion(){
        return this.AnioPublicacion;
    }

    public void setAnioPublicacion(int AnioPublicacion){
        this.AnioPublicacion = AnioPublicacion;
    }

    public String imprimir(){
        return "Titulo: " + Titulo + "Autor: " + Autor + "Año Publicacion: " + AnioPublicacion;
    }
}