package ies.puerto.modelo.db;

import java.sql.ResultSet;

import ies.puerto.config.AppConfig;
import ies.puerto.exception.UsuarioException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion extends AppConfig{
    private String url;
    private String user;
    private String password;
    private Connection con;

    public Conexion() throws UsuarioException{
        this.url = "jdbc:sqlite:"+getUrl();
    }

    public Conexion(String user, String password) throws UsuarioException{
        this.url = "jdbc:sqlite:"+getUrl();
        this.user = user;
        this.password = password;
    }

    public Connection conexion() throws UsuarioException{
        try{
            //Class.forName("org.sqlite.JDBC");
            this.con = DriverManager.getConnection(url);
        } catch(Exception e){
            System.out.println(e.getMessage());
            throw new UsuarioException("no se ha podido establecer la conexión", e);
        }
        return con;
    }
}
