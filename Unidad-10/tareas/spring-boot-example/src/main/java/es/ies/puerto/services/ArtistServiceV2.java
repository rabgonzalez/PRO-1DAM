package es.ies.puerto.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.models.Artist;
import es.ies.puerto.repositories.ArtistRepository;
import es.ies.puerto.repositories.ArtistRepositoryV2;

import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;

@RestController
@RequestMapping("/v2/artist")
public class ArtistServiceV2 {
    ArtistRepositoryV2 artistRepositoryV2;

    private static Logger LOG = LoggerFactory.getLogger(ArtistService.class);

    private ArtistServiceV2(ArtistRepositoryV2 artistRepositoryV2){
        this.artistRepositoryV2 = artistRepositoryV2;
    }

    @GetMapping("/")
    public List<Artist> getArtists() {
        return artistRepositoryV2.getList();
    }

    @GetMapping("/{id}")
    public Artist getById(@PathVariable(name = "id") final String id) {
        return artistRepositoryV2.getById(id);
    }
}
