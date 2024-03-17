package ies.puerto.modelo.fichero.abstractas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import ies.puerto.modelo.fichero.interfaces.IFichero;
import ies.puerto.modelo.impl.Persona;
import ies.puerto.utilidades.Utilidades;

public class Fichero extends Utilidades implements IFichero {

    @Override
    public boolean existeFichero(String path){
        if(path == null || path.isEmpty()){
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    @Override
    public boolean limpiarFichero(String path){
        if(!existeFichero(path)){
            return false;
        }
        File file = new File(path);
        try(OutputStream fileOutputStream = new FileOutputStream(file)){
            byte[] vacio =  {};
            fileOutputStream.write(vacio);
        } catch(IOException o){
            o.printStackTrace();
        }
        return true;
    }

    @Override
    public List<Persona> obtenerPersonas() {
        return null;
    }

    @Override
    public boolean escribir(List<Persona> personas) {
        return false;
    }

    @Override
    public boolean actualizar(List<Persona> personas) {
        return false;
    }
}
