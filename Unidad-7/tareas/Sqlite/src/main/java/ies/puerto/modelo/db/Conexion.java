package ies.puerto.modelo.db;

import java.sql.ResultSet;

import ies.puerto.exception.UsuarioException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private String url;
    private String user;
    private String password;
    private Connection con;

    public Conexion(String url){
        this.url = "jdbc:sqlite:"+url;
    }

    public Conexion(String url, String user, String password) {
        this.url = url;
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
