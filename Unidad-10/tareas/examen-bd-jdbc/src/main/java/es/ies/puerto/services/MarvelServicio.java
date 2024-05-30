package es.ies.puerto.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.MarvelNegocio;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
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
}
