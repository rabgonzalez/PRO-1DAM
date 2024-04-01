package ies.puerto.modelo.impl;

import ies.puerto.modelo.abstractas.Persona;

public class Usuario extends Persona {
    public Usuario(String id){
        super(id);
    }

    public Usuario(String id, String nombre, int edad, String ciudad) {
        super(id, nombre, edad, ciudad);
    }

    @Override
    public String toString() {
        return " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", ciudad='" + getCiudad() + "'";
    }  
}
