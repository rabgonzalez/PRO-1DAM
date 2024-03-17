package ies.puerto.negocio;

import java.util.ArrayList;
import java.util.List;

import ies.puerto.modelo.impl.Persona;
import ies.puerto.negocio.interfaces.ICrudOperaciones;

public class Negocio implements ICrudOperaciones{
    Persona persona;
    List<Persona> personas;

    public Negocio(){
        personas = new ArrayList<>();
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
        return true;
    }

    @Override
    public boolean actualizarPersona(Persona persona) {
        if(!personas.contains(persona)){
            return false;
        }
        int posicion = personas.indexOf(persona);
        personas.add(posicion, persona);
        return true;
    }
}