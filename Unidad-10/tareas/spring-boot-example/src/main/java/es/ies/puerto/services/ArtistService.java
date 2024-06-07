package es.ies.puerto.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.models.Artist;
import es.ies.puerto.repositories.ArtistRepository;

import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;

@RestController
@RequestMapping("/v1/artist")
public class ArtistService {
    ArtistRepository artistRepository;

    private static Logger LOG = LoggerFactory.getLogger(ArtistService.class);

    private ArtistService(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    @GetMapping("/")
    public List<Artist> getArtists() {
        return artistRepository.getList();
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable(name = "id") final String id) {
        return artistRepository.getById(id);
    }
}
