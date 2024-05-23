package es.ies.puerto.services;

import java.util.Set;

import javax.ws.rs.*;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.repositorio.PoderRepositorio;

public class PoderService {
    private PoderRepositorio poderRepositorio = new PoderRepositorio();

    @GET
    @Path("/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Set<PoderDTO> getPoderes(){
        return poderRepositorio.getPoderes();
    }

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public PoderDTO getPoderById(@PathParam("id") String id){
        return poderRepositorio.getPoderById(id);
    }

    @GET
    @Path("/xml/{id}")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml" })
    public PoderDTO getPoderXML(@PathParam("id") String id){
        return poderRepositorio.getPoderById(id);
    }

    @POST
    @Path("/{poder}")
    @Consumes({ "application/json" })
    public void addPoder(@PathParam("poder") PoderDTO poder){
        poderRepositorio.addPoder(poder);
    } 
}
