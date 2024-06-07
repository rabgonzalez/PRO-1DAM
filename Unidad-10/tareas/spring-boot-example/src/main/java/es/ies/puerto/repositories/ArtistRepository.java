package es.ies.puerto.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.ies.puerto.models.Artist;

@Repository("artistRepository")
public class ArtistRepository {
    private List<Artist> list;

    public ArtistRepository(){
        list = new ArrayList<>();
        list.add(new Artist("1", "jonay"));
        list.add(new Artist("2", "kb"));
    }

    public Artist getById(String id){
        Artist artist = new Artist(id);
        if(!list.contains(artist)){
            return null;
        }
        int position = list.indexOf(artist);
        return list.get(position);
    }

    public List<Artist> getList() {
        return this.list;
    }

    public void setList(List<Artist> list) {
        this.list = list;
    }

}
