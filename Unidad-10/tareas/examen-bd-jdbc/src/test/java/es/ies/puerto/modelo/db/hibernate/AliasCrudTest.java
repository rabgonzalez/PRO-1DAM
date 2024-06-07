package es.ies.puerto.modelo.db.hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;

public class AliasCrudTest {
    static EntityManagerFactory emf;
    static AliasCRUD aliasCRUD;

    //@BeforeAll
    void beforeAll(){
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        aliasCRUD = new AliasCRUD(emf);
    }
}
