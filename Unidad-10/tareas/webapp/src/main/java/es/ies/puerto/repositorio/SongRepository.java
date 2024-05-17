package es.ies.puerto.repositorio;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import es.ies.puerto.modelos.Song;

public class SongRepository {
    private List<Song> lista;

    public SongRepository(){
        lista = new ArrayList<>();
        lista.add(new Song("1", "Karma Police","4.00"));
        lista.add(new Song("2", "JonayKB","69.00"));
    }

    public void setSongs(List<Song> lista) {
        this.lista = lista;
    }

    public Song getSongById(String id) {
        return lista.get(Integer.valueOf(id));
    }

    public List<Song> getSongs() {
        return lista;
    }

    public void saveSong(Song cancion){
        if(lista.contains(cancion)){
            return;
        }
        lista.add(cancion);
    }
}
