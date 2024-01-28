package ies.puerto.Ejercicio1.abstrac;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public abstract class Persona {
    private String nombre;
    private String dni;
    private String fechaNacimiento;

    public Persona() {}

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "nombre: "+getNombre()+" / dni: "+getDni()+" / fechaNacimiento: "+getFechaNacimiento();
    }

    public Long anios() throws ParseException {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFormateada = formatoFecha.parse(fechaNacimiento);

        long edad = (fechaActual.getTime()-fechaFormateada.getTime())/31536000000L;
        return edad;
    }
}