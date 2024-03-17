package ies.puerto.negocio.interfaces;

import ies.puerto.modelo.impl.Persona;

public interface ICrudOperaciones {
    public boolean crearPersona(Persona persona);
    public boolean eliminarPersona(Persona persona);
    public Persona obtenerPersona(Persona persona);
    public boolean actualizarPersona(Persona persona);
} 
