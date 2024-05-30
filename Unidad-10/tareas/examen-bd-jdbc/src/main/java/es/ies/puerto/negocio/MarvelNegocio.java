package es.ies.puerto.negocio;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperAlias;
import es.ies.puerto.mappers.struct.IMapperEquipamiento;
import es.ies.puerto.mappers.struct.IMapperPersonaje;
import es.ies.puerto.mappers.struct.IMapperPoder;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

@Repository
public class MarvelNegocio {
    DaoPoder daoPoder;
    DaoAlias daoAlias;
    DaoEquipamiento daoEquipamiento;
    DaoPersonaje daoPersonaje;

    public MarvelNegocio() throws MarvelException{
        daoPoder = new DaoPoder();
        daoAlias = new DaoAlias();
        daoEquipamiento = new DaoEquipamiento();
        daoPersonaje = new DaoPersonaje();
    }

    public Set<PoderDTO> getPoderes() throws MarvelException{
        Set<Poder> poderes = daoPoder.findAllPoder();
        if(poderes == null){
            return null;
        }
        Set<PoderDTO> resultado = new HashSet<>();
        for(Poder poder : poderes){
            resultado.add(IMapperPoder.INSTANCE.poderEntityToPoderDTO(poder));
        }
        return resultado;
    }

    public PoderDTO getPoderById(String id) throws MarvelException{
        if(id == null){
            return null;
        }
        Poder poder = new Poder(id);
        return IMapperPoder.INSTANCE.poderEntityToPoderDTO(daoPoder.findPoder(poder));
    }

    public boolean addPoder(PoderDTO poder, Set<String> personajes_id) throws MarvelException{
        if(poder == null || personajes_id == null){
            return false;
        }
        Set<PersonajeDTO> personajes = new HashSet<>();
        for(String id : personajes_id){
            PersonajeDTO personaje = IMapperPersonaje.INSTANCE.personajeEntityToPersonajeDTO(daoPersonaje.findPersonaje(new Personaje(id)));
            personajes.add(personaje);
        }
        Poder poderEntity = IMapperPoder.INSTANCE.poderDTOToPoderEntity(poder, personajes);
        return daoPoder.insertPoder(poderEntity);
    }

    public boolean removePoder(PoderDTO poder) throws MarvelException{
        daoPoder.deletePoder(IMapperPoder.INSTANCE.poderDTOToPoderEntity(poder, null));
        if(getPoderById(poder.getId()).equals(poder)){
            return false;
        }
        return true;
    }

    public Set<AliasDTO> getAlias() throws MarvelException{
        Set<Alias> alias = daoAlias.findAllAlias();
        if(alias == null){
            return null;
        }
        Set<AliasDTO> resultado = new HashSet<>();
        for(Alias aliasBuscar : alias){
            resultado.add(IMapperAlias.INSTANCE.aliasEntityToAliasDTO(aliasBuscar));
        }
        return resultado;
    }

    public AliasDTO getAliasById(String id) throws MarvelException{
        if(id == null){
            return null;
        }
        Alias alias = new Alias(id);
        return IMapperAlias.INSTANCE.aliasEntityToAliasDTO(daoAlias.findAlias(alias));
    }

    public boolean addAlias(AliasDTO alias, String personaje_id) throws MarvelException{
        if(alias == null || personaje_id == null){
            return false;
        }
        Alias aliasEntity = IMapperAlias.INSTANCE.aliasDTOToAliasEntity(alias, new PersonajeDTO(personaje_id));
        return daoAlias.insertAlias(aliasEntity);
    }

    public boolean removeAlias(AliasDTO aliasDTO) throws MarvelException{
        if(aliasDTO == null){
            return false;
        }
        daoAlias.deleteAlias(IMapperAlias.INSTANCE.aliasDTOToAliasEntity(aliasDTO, null));
        if(getAliasById(aliasDTO.getId()).equals(aliasDTO)){
            return false;
        }
        return true;
    }

    public Set<EquipamientoDTO> getEquipamientos() throws MarvelException{
        Set<Equipamiento> equipamientos = daoEquipamiento.findAllEquipamiento();
        if(equipamientos == null){
            return null;
        }
        Set<EquipamientoDTO> resultado = new HashSet<>();
        for(Equipamiento equipamiento : equipamientos){
            resultado.add(IMapperEquipamiento.INSTANCE.equipamientoEntityToEquipamientoDTO(equipamiento));
        }
        return resultado;
    }

    public EquipamientoDTO getEquipamientoById(String id) throws MarvelException{
        if(id == null){
            return null;
        }
        Equipamiento equipamiento = new Equipamiento(id);
        return IMapperEquipamiento.INSTANCE.equipamientoEntityToEquipamientoDTO(daoEquipamiento.findEquipamiento(equipamiento));
    }

    public boolean addEquipamiento(EquipamientoDTO equipamiento, String personaje_id) throws MarvelException{
        if(equipamiento == null || personaje_id == null){
            return false;
        }
        PersonajeDTO personaje = new PersonajeDTO(personaje_id);
        Equipamiento equipamientoEntity = IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamientoEntity(equipamiento, personaje);
        return daoEquipamiento.insertEquipamiento(equipamientoEntity);
    }

    public boolean removeEquipamiento(EquipamientoDTO equipamientoDTO) throws MarvelException{
        if(equipamientoDTO == null){
            return false;
        }
        daoEquipamiento.deleteEquipamiento(IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamientoEntity(equipamientoDTO, null));
        if(getEquipamientoById(equipamientoDTO.getId()).equals(equipamientoDTO)){
            return false;
        }
        return true;
    }

    public Set<PersonajeDTO> getPersonajes() throws MarvelException{
        Set<Personaje> personajes = daoPersonaje.findAllPersonaje();
        if(personajes == null){
            return null;
        }
        Set<PersonajeDTO> resultado = new HashSet<>();
        for(Personaje personaje : personajes){
            resultado.add(IMapperPersonaje.INSTANCE.personajeEntityToPersonajeDTO(personaje));
        }
        return resultado;
    }

    public PersonajeDTO getPersonajeById(String id) throws MarvelException{
        if(id == null){
            return null;
        }
        Personaje personaje = new Personaje(id);
        return IMapperPersonaje.INSTANCE.personajeEntityToPersonajeDTO(daoPersonaje.findPersonaje(personaje));
    }

    public boolean addPersonaje(PersonajeDTO personaje) throws MarvelException{
        if(personaje == null){
            return false;
        }
        Personaje personajeEntity = IMapperPersonaje.INSTANCE.personajeDTOToPersonajeEntity(personaje);
        return daoPersonaje.insertPersonaje(personajeEntity);
    }

    public boolean removePersonaje(PersonajeDTO personaje) throws MarvelException{
        if(personaje == null){
            return false;
        }
        daoPersonaje.deletePersonaje(IMapperPersonaje.INSTANCE.personajeDTOToPersonajeEntity(personaje));
        if(getPersonajeById(personaje.getId()).equals(personaje)){
            return false;
        }
        return true;
    }
}
