package ies.puerto.modelo.db.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ies.puerto.modelo.excepcion.PersonajeExcepcion;

public class AppConexion {
    String urlBD;

    public AppConexion() throws PersonajeExcepcion {
        Properties properties = new Properties();

        try(FileInputStream fis = new FileInputStream("src/main/resources/app.properties")){
            properties.load(fis);
            urlBD = (String) properties.get("urlBD");
        } catch(IOException e){
            throw new PersonajeExcepcion(e.getMessage());
        }
    }

    public String getUrl(){
        return this.urlBD;
    }
}
