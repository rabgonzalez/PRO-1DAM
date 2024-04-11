package ies.puerto.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ies.puerto.exception.UsuarioException;

public class AppConfig {
    String urlDB;

    public AppConfig() throws UsuarioException{
        Properties properties = new Properties();
        try(FileInputStream fis = new FileInputStream("src/main/resources/app.properties")){
            properties.load(fis);
            urlDB = (String) properties.get("urlDB");
        } catch(IOException e){
            throw new UsuarioException(e.getMessage());
        }
    }

    public String getUrl(){
        return this.urlDB;
    }
}
