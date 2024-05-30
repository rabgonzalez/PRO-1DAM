package es.ies.puerto.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.negocio.MarvelNegocio;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/marvel")
public class MarvelServicio {
    private static Logger LOG = LoggerFactory.getLogger(MarvelServicio.class);

    private MarvelNegocio marvelNegocio;

    @Autowired
    public void setMarvelNegocio(MarvelNegocio marvelNegocio) {
        this.marvelNegocio = marvelNegocio;
    }

    public MarvelServicio(){
    }

    @GetMapping("/poder/{id}")
    public PoderDTO getPoderById(@PathVariable(name = "id") final String id) throws MarvelException{
        return marvelNegocio.getPoderById(id);
    }

    @GetMapping("/poder")
    public Set<PoderDTO> getPoderes() throws MarvelException{
        return marvelNegocio.getPoderes();
    }
    
    @PostMapping("/poder/{idsPersonajes}")
    public void addPoder(@PathVariable(name = "idsPersonajes") final Set<String> idsPersonajes, @RequestBody final PoderDTO poder) throws MarvelException{
        if(idsPersonajes == null){
            return;
        }
        marvelNegocio.addPoder(poder, idsPersonajes);
    }
    
    @DeleteMapping("/poder/{id}")
    public void deletePoder(@PathVariable(name = "id") final String id) throws MarvelException{
        if(id == null){
            return;
        }
        marvelNegocio.removePoder(new PoderDTO(id));
    }

    @GetMapping("/alias/{id}")
    public AliasDTO getAliasById(@PathVariable(name = "id") final String id) throws MarvelException{
        return marvelNegocio.getAliasById(id);
    }

    @GetMapping("/alias")
    public Set<AliasDTO> getAllAlias() throws MarvelException{
        return marvelNegocio.getAlias();
    }
    
    @PostMapping("/alias/{idPersonaje}")
    public void addAlias(@PathVariable(name = "idPersonaje") final String idPersonaje, @RequestBody final AliasDTO alias) throws MarvelException{
        if(idPersonaje == null){
            return;
        }
        marvelNegocio.addAlias(alias, idPersonaje);
    }
    
    @DeleteMapping("/alias/{id}")
    public void deleteAlias(@PathVariable(name = "id") final String id) throws MarvelException{
        if(id == null){
            return;
        }
        marvelNegocio.removeAlias(new AliasDTO(id));
    }

    @GetMapping("/equipamiento/{id}")
    public EquipamientoDTO getEquipamientoById(@PathVariable(name = "id") final String id) throws MarvelException{
        return marvelNegocio.getEquipamientoById(id);
    }

    @GetMapping("/equipamiento")
    public Set<EquipamientoDTO> getEquipamientos() throws MarvelException{
        return marvelNegocio.getEquipamientos();
    }
    
    @PostMapping("/equipamiento/{idPersonaje}")
    public void addEquipamiento(@PathVariable(name = "idPersonaje") final String idPersonaje, @RequestBody final EquipamientoDTO equipamiento) throws MarvelException{
        if(idPersonaje == null){
            return;
        }
        marvelNegocio.addEquipamiento(equipamiento, idPersonaje);
    }
    
    @DeleteMapping("/equipamiento/{id}")
    public void deleteEquipamiento(@PathVariable(name = "id") final String id) throws MarvelException{
        if(id == null){
            return;
        }
        marvelNegocio.removeEquipamiento(new EquipamientoDTO(id));
    }

    @GetMapping("/personaje/{id}")
    public PersonajeDTO getPersonajeById(@PathVariable(name = "id") final String id) throws MarvelException{
        return marvelNegocio.getPersonajeById(id);
    }

    @GetMapping("/personaje")
    public Set<PersonajeDTO> getPersonajes() throws MarvelException{
        return marvelNegocio.getPersonajes();
    }
    
    @PostMapping("/Personaje")
    public void addPersonaje(@RequestBody final PersonajeDTO personaje) throws MarvelException{
        marvelNegocio.addPersonaje(personaje);
    }
    
    @DeleteMapping("/personaje/{id}")
    public void deletePersonaje(@PathVariable(name = "id") final String id) throws MarvelException{
        if(id == null){
            return;
        }
        marvelNegocio.removePersonaje(new PersonajeDTO(id));
    }
}
