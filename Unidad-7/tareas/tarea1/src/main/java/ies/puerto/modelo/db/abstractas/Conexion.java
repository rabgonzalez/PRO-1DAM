package ies.puerto.modelo.db.abstractas;

import java.sql.Connection;
import java.sql.DriverManager;

import ies.puerto.conexion.AppConexion;
import ies.puerto.excepcion.PersonajeExcepcion;

public abstract class Conexion extends AppConexion{
    private String url;
    private Connection con;
    
    public Conexion() throws PersonajeExcepcion{
        this.url = "jdbc:sqlite:"+getUrl();
    }

    public Connection conexion() throws PersonajeExcepcion{
        try{
            this.con = DriverManager.getConnection(url);
        } catch(Exception e){
            throw new PersonajeExcepcion(e.getMessage(), e);
        }
        return con;
    }
}
