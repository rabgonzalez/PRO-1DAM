package ies.puerto.modelo.db.hibernate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.db.impl.OperacionesHibernate;
import ies.puerto.modelo.excepcion.PersonajeExcepcion;
import ies.puerto.modelo.impl.Alias;
import ies.puerto.modelo.impl.Personajes;
import ies.puerto.modelo.impl.Poderes;


public class OperacionesHibernateTest {
    static OperacionesHibernate oh;
	static EntityManagerFactory emf;

    Personajes personaje;
    Poderes poder;
    Set<Poderes> poderes;
    Alias alias;

    @BeforeAll
    public static void beforeAll(){
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        oh = new OperacionesHibernate(emf);
    }

    @BeforeEach
    public void beforeEach() throws PersonajeExcepcion{
        poder = new Poderes();
        alias = new Alias();

        poder.setPoder("poderJPA");
        poderes = new HashSet<>(Arrays.asList(poder));
        poder.setPersonajes(new HashSet<>(Arrays.asList(personaje)));

        alias.setAlias("aliasJPA");
        alias.setPersonaje(personaje);

        personaje = new Personajes(); 
        personaje.setNombre("nombreJPA");
        personaje.setGenero("generoJPA");
        personaje.setPoderes(poderes);
        personaje.setAlias(alias);

        
		oh.insertarPersonaje(personaje);
    }

    @Test
    public void obtenerPersonajesTest() throws PersonajeExcepcion{
        int cantidad = oh.obtenerPersonajes().size();
        Assertions.assertEquals(2, cantidad);
    }

    @Test
	public void obtenerPersonajeTest() throws PersonajeExcepcion{
		Personajes personajeBuscar = oh.obtenerPersonaje(personaje);
		Assertions.assertEquals(personaje.getNombre(), personajeBuscar.getNombre());
	}

	@Test
	public void actualizarPersonajeTest() throws PersonajeExcepcion{
        String nombreActualizar = "nombreJPA";
		personaje.setNombre(nombreActualizar);

        oh.actualizarPersonaje(personaje);
        Assertions.assertEquals(nombreActualizar, oh.obtenerPersonaje(personaje).getNombre());
	}

	@AfterEach
	public void closeEntityManager() throws PersonajeExcepcion{
		oh.eliminarPersonaje(personaje);
	}
}