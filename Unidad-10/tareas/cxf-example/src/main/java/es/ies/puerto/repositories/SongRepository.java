package es.ies.puerto.repositories;

import es.ies.puerto.models.Song;

import java.util.ArrayList;
import java.util.List;

public class SongRepository {
    private List<Song> lista;

    public SongRepository(){
        lista = new ArrayList<>();
        lista.add(new Song("1", "Karma Police","4.00"));
        lista.add(new Song("2", "Pepe Benavente","10.00"));
    }

    public Song getSongById(String id) {
        return lista.get(Integer.valueOf(id));
    }

    public List<Song> getSongs() {
        return lista;
    }

    public boolean saveSong(Song song) {
        if (lista.contains(song)) {
            return false;
        }
        return lista.add(song);
    }

    public boolean deleteSongById(String id) {
        Song song = new Song(id);
        return lista.remove(Integer.valueOf(id));
    }
}
