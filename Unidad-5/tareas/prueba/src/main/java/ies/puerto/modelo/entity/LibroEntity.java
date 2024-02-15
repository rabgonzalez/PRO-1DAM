package main.java.ies.puerto.modelo.entity;
import java.util.Objects;

public class LibroEntity {
    private String isbn;
    private String titulo;
    private String autor;
    private String fechaPublicacion;
    private int idBiblioteca;


    public LibroEntity() {
    }

    public LibroEntity(String isbn, String titulo, String autor, String fechaPublicacion, int idBiblioteca) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.idBiblioteca = idBiblioteca;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LibroEntity)) {
            return false;
        }
        LibroEntity libroEntity = (LibroEntity) o;
        return Objects.equals(isbn, libroEntity.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, titulo, autor, fechaPublicacion);
    }

    @Override
    public String toString() {
        return "{" +
            " isbn='" + getIsbn() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", fechaPublicacion='" + getFechaPublicacion() + "'" +
            "}";
    }
    
}
