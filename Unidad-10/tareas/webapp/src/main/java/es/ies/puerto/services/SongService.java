package es.ies.puerto.services;

import java.util.List;

import javax.ws.rs.*;

import es.ies.puerto.modelos.Song;
import es.ies.puerto.repositorio.SongRepository;

@Path("/")
public class SongService {
    
    private SongRepository songRepository = new SongRepository();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Song getSongById(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }

    @GET
    @Path("/xml/{id}")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml" })
    public Song getSongXML(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }

    @GET
    @Path("/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public List<Song> getSongs(){
        return songRepository.getSongs();
    }

    @POST
    @Path("/{song}")
    @Consumes({ "application/json" })
    public void addSong(@PathParam("song") Song song){
        songRepository.saveSong(song);
    }
}