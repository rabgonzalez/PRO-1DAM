package ies.puerto.modelo.db.impl;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import ies.puerto.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.db.abstractas.Conexion;
import ies.puerto.modelo.impl.Personaje;

public class OperacionesCRUD extends Conexion{
    public OperacionesCRUD() throws PersonajeExcepcion{}

    public Set<String> obtenerPoderes(String qry){
        Set<String> poderes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                String poder = rs.getString("poder");
            }
        } catch(Exception e){
            
        }
    }

    public Set<Personaje> obtener(String qry) throws PersonajeExcepcion{
        Set<Personaje> personajes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try{
            statement = conexion().createStatement();
            rs = statement.executeQuery(qry);

            while(rs.next()){
                String nombre = rs.getString("nombre");
                String alias = rs.getString("alias");
                String genero = rs.getString("genero");
                Personaje personaje = new Personaje(nombre, alias, genero, null);
                personajes.add(personaje);
            }
        } catch(SQLException e){

        }
        return personajes;
    }

    public Personaje actualizar(String qry){

    }
}
