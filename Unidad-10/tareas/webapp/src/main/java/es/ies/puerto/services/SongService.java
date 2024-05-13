package es.ies.puerto.services;

import javax.ws.rs.*;

import es.ies.puerto.modelos.Song;
import es.ies.puerto.repositorio.SongRepository;

@Path("/songs")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class SongService {
    
    private SongRepository songRepository = new SongRepository();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Song getSongById(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }
}
