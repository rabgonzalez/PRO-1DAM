package ies.puerto.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.db.Conexion;

public class ConexionTest {
    Conexion conexion;
    String url = "src/main/resources/usuarios.db";

    @BeforeEach
    public void beforeEach(){
        conexion = new Conexion(url);
    }

    @Test
    public void conexionTest(){
        try{
            conexion.conexion();
        } catch(Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}