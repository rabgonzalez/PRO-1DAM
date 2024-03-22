package ies.puerto.modelo.fichero.abstractas;

import java.io.File;


import ies.puerto.modelo.fichero.interfaces.IFichero;

public abstract class Fichero implements IFichero {
    public final String PATH_CSV = "src/main/resources/Personaje.csv";
    public final String PATH_XML = "src/main/resources/Personaje.xml";
    public final String PATH_JSON = "src/main/resources/Personaje.json";

    @Override
    public boolean existeFichero(String path){
        if(path == null || path.isEmpty()){
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }   
}