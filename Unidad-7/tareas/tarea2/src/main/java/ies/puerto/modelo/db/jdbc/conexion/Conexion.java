package ies.puerto.modelo.db.jdbc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

import ies.puerto.modelo.excepcion.PersonajeExcepcion;

public class Conexion extends AppConexion {
    private String url;
    private Connection con;

    public Conexion() throws PersonajeExcepcion {
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
