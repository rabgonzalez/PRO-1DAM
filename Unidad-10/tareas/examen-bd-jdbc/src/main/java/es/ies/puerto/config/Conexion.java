package es.ies.puerto.config;

import java.sql.Connection;
import java.sql.DriverManager;

import es.ies.puerto.exception.MarvelException;

public class Conexion extends AppConfig {
    private String url;
    private Connection con;

    public Conexion() throws MarvelException {
        this.url = "jdbc:sqlite:"+getUrlBd();
    }
    
    public Connection conexion() throws MarvelException{
        try{
            this.con = DriverManager.getConnection(url);
        } catch(Exception e){
            throw new MarvelException(e.getMessage(), e);
        }
        return con;
    }
}
