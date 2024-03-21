package ies.puerto.modelo.fichero.interfaces;

import java.util.List;

import ies.puerto.modelo.impl.Persona;

public interface IFichero {
    public boolean existeFichero(String path);
    public List<Persona> obtenerPersonas();
    public boolean escribir(List<Persona> personas);
}
