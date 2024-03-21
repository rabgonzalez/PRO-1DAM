package ies.puerto.modelo.fichero.abstractas;

import java.io.File;


import ies.puerto.modelo.fichero.interfaces.IFichero;
import ies.puerto.utilidades.Utilidades;

public abstract class Fichero extends Utilidades implements IFichero {

    @Override
    public boolean existeFichero(String path){
        if(path == null || path.isEmpty()){
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }   
}