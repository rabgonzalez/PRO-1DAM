package ies.puerto.negocio;

import java.util.List;

import ies.puerto.modelo.fichero.impl.FicheroCsv;
import ies.puerto.modelo.fichero.interfaces.IFichero;
import ies.puerto.modelo.impl.Persona;
import ies.puerto.negocio.interfaces.ICrudOperaciones;

public class Negocio implements ICrudOperaciones{
    IFichero fichero;
    List<Persona> personas;

    public Negocio(){
        fichero = new FicheroCsv();
        personas = fichero.obtenerPersonas();
    }

    @Override
    public Persona obtenerPersona(Persona persona){
        if(!personas.contains(persona)){
            return null;
        }
        int posicion = personas.indexOf(persona);
        return personas.get(posicion);
    }

    @Override
    public boolean crearPersona(Persona persona) {
        if(personas.contains(persona)){
            return false;
        }
        return personas.add(persona);
    }

    @Override
    public boolean eliminarPersona(Persona persona) {
        if(personas.contains(persona)){
            return personas.remove(persona);
        }
        return false;
    }

    @Override
    public boolean actualizarPersona(Persona persona) {
        if(!personas.contains(persona)){
            return false;
        }
        int posicion = personas.indexOf(persona);
        personas.set(posicion, persona);
        return true;
    }
}