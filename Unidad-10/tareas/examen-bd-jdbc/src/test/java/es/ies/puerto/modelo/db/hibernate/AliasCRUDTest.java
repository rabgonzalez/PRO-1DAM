package es.ies.puerto.modelo.db.hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Alias;

public class AliasCRUDTest {
    static EntityManagerFactory emf;
    static AliasCRUD aliasCRUD;
    Alias alias;

    @BeforeAll
    public static void beforeAll(){
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        aliasCRUD = new AliasCRUD(emf);
    }

    @BeforeEach
    public void beforeEach() throws MarvelException{
        alias = new Alias("abc", "hola", "2");
        aliasCRUD.insertarAlias(alias);
    }

    @Test
    public void obtenerAllAlias(){
        int cantidad = aliasCRUD.obtenerAllAlias().size();
        Assertions.assertEquals(4, cantidad);
    }

    @AfterEach
    public void afterEach() throws MarvelException{
        aliasCRUD.eliminarAlias(alias);
    }
}
