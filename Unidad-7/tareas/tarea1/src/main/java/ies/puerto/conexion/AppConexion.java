package ies.puerto.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ies.puerto.excepcion.PersonajeExcepcion;

public abstract class AppConexion {
    String urlBd;

    public AppConexion() throws PersonajeExcepcion {
        Properties properties = new Properties();

        try(FileInputStream fis = new FileInputStream("src/main/resources/app.properties")){
            properties.load(fis);
            urlBd = (String) properties.get("urlBd");
        } catch(IOException e){
            throw new PersonajeExcepcion(e.getMessage());
        }
    }

    public String getUrl(){
        return this.urlBd;
    }
}
