package es.ies.puerto.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.ies.puerto.models.Artist;
import es.ies.puerto.models.Song;

@Repository("artistRepositoryV2")
public class ArtistRepositoryV2 {
    private ArtistRepository artistRepository;

    private SongRepository songRepository;

    public ArtistRepositoryV2(){
    }

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Autowired
    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Artist getById(String id){
        Artist artist = new Artist(id);
        if(!artistRepository.getList().contains(artist)){
            return null;
        }
        int position = artistRepository.getList().indexOf(artist);
        artist = artistRepository.getList().get(position);
        artist.getSongs().add(songRepository.getSongById(id));
        return artist;
    }

    public List<Artist> getList() {
        return artistRepository.getList();
    }
}
