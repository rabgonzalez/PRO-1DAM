package ies.puerto.modelo.db.hibernate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.impl.Alias;
import ies.puerto.modelo.impl.Personajes;
import ies.puerto.modelo.impl.Poderes;


public class OperacionesHibernateTest {
    static EntityManagerFactory emf;
    EntityManager em;

    Personajes personaje;
    Poderes poder;
    Set<Poderes> poderes;
    Alias alias;

    @BeforeAll
    public static void beforeAll(){
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
    }

    @BeforeEach
    public void beforeEach(){
        em = emf.createEntityManager();
        /**
        alias = new Alias(1, 1, "Tony Stark");
        poder = new Poderes(1, "Vuelo", null);
        poderes = new HashSet<>(Arrays.asList(poder));
        */
        personaje = new Personajes(); 
        personaje.setNombre("Iron Man");

        try{
            em.getTransaction().begin();
            em.persist(personaje);
            em.getTransaction().commit();
        } catch(Throwable e){
            Assertions.fail("Se ha producido un error:"+e.getMessage());
        }
    }

    @Test
	public void buscarPersonajeTest() {
		try {
			Personajes personajeBuscar = em.find(Personajes.class, personaje.getId());
			Assertions.assertEquals(personaje.getNombre(), personajeBuscar.getNombre());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void actualizarPersonajeTest() {
		try {
			Personajes personajeActualizar = em.find(Personajes.class, personaje.getId());
			personajeActualizar.setNombre("otroNombre");

			em.getTransaction().begin();
			em.merge(personajeActualizar);
			em.getTransaction().commit();

			Personajes personajeActualizado = em.find(Personajes.class, personaje.getId());
			Assertions.assertEquals(personajeActualizar.getNombre(), personajeActualizado.getNombre());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void eliminarPersonajeTest() {
		try {
			int id = personaje.getId();
			Personajes personaje = em.find(Personajes.class, id); 
			em.getTransaction().begin();
			em.remove(personaje);
			em.getTransaction().commit();

			Personajes personEliminado = em.find(Personajes.class, id);
			Assertions.assertNull(personEliminado);
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void closeEntityManager() {
		em.close();
		em = null;
	}

	@AfterAll
	public static void closeEntityManagerFactory() {
		emf.close();
	}
}
