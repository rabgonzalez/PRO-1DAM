package es.ies.puerto.config;

import es.ies.puerto.exception.MarvelException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class AppConfig {
    String urlBd;
    String bdName;

    public AppConfig() throws MarvelException {
        Properties properties = new Properties();  


        URL urlApp = AppConfig.class.getClassLoader().getResource("app.properties");
        try (FileInputStream fis = new FileInputStream(urlApp.getPath())) {
            properties.load(fis);
            bdName = (String) properties.get("urlBd");
        } catch(Exception e){
            throw new MarvelException("Se ha producido un error en la lectura del fichero:"+e.getMessage());
        }
    }

    public String getUrlBd() {
        if (urlBd == null) {
            URL resource = AppConfig.class.getClassLoader().getResource(bdName);
            urlBd = resource.getPath();
        }
        return urlBd;
    }
}
