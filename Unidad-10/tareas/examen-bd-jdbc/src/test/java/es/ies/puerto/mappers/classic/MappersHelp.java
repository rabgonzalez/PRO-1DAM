package es.ies.puerto.mappers.classic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MappersHelp {

    public static final String ID = "abc";
    public static final String DESCRIPCION = "descripcion";
    public static final String PERSONAJE_ID = "abc";
    public static final String NOMBRE = "nombre";
    public static final String GENERO = "Masculino";

    public Alias alias;
    public AliasDTO aliasDTO;
    public Equipamiento equipamiento;
    public EquipamientoDTO equipamientoDTO;
    public Personaje personaje;
    public PersonajeDTO personajeDTO;
    public Poder poder;
    public PoderDTO poderDTO;
    public Set<Equipamiento> equipamientos;
    public Set<Poder> poderes;
    public Set<EquipamientoDTO> equipamientosDTO;
    public Set<PoderDTO> poderesDTO;

    @BeforeEach
    public void beforeEach(){
        alias = new Alias();
        alias.setId(ID);
        alias.setDescripcion(DESCRIPCION);
        alias.setPersonaje_id(PERSONAJE_ID);

        aliasDTO = new AliasDTO();
        aliasDTO.setId(ID);
        aliasDTO.setDescripcion(DESCRIPCION);

        equipamiento = new Equipamiento();
        equipamiento.setId(ID);
        equipamiento.setDescripcion(DESCRIPCION);
        equipamiento.setNombre(NOMBRE);
        equipamiento.setPersonaje_id(PERSONAJE_ID);

        equipamientoDTO = new EquipamientoDTO();
        equipamientoDTO.setId(ID);
        equipamientoDTO.setDescripcion(DESCRIPCION);
        equipamientoDTO.setNombre(NOMBRE);

        poder = new Poder();
        poder.setId(ID);
        poder.setNombre(NOMBRE);

        poderDTO = new PoderDTO();
        poderDTO.setId(ID);
        poderDTO.setNombre(NOMBRE);

        personaje = new Personaje();
        personaje.setId(ID);
        personaje.setNombre(NOMBRE);
        personaje.setGenero(GENERO);
        personaje.setAlias(alias);
        personaje.setEquipamientos(equipamientos);
        personaje.setPoderes(poderes);

        personajeDTO = new PersonajeDTO();
        personajeDTO.setId(ID);
        personajeDTO.setNombre(NOMBRE);
        personajeDTO.setGenero(GENERO);
        personajeDTO.setAlias(alias);
        personajeDTO.setEquipamientos(equipamientos);   
        personajeDTO.setPoderes(poderes);
    }
}
