package main.java.ies.puerto.modelo.fichero.abstractas;

import java.io.File;

public abstract class BibliotecaFile {

    public boolean existeFichero(String path){
        if(path == null || path.isEmpty()){
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public boolean esDirectorio(String path){
        if(path == null || path.isEmpty()){
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isDirectory();
    }
}
