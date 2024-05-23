package es.ies.puerto.repositorio;

import java.util.Set;

import es.ies.puerto.dto.PoderDTO;

public class PoderRepositorio {
    private Set<PoderDTO> lista;

    public PoderRepositorio(){
        lista.add(new PoderDTO("1", "Volar"));
        lista.add(new PoderDTO("2", "Armadura"));
    }

    public void setPoderes(Set<PoderDTO> lista){
        this.lista = lista;
    }

    public Set<PoderDTO> getPoderes(){
        return lista;
    }

    public PoderDTO getPoderById(String id){
        PoderDTO poderDTO = new PoderDTO(id);
        if(!lista.contains(poderDTO)){
            return null;
        }
        for(PoderDTO poderBuscar : lista){
            if(poderBuscar.equals(poderDTO)){
                return poderBuscar;
            }
        }
        return null;
    }

    public void addPoder(PoderDTO poderDTO){
        if(lista.contains(poderDTO)){
            return;
        }
        lista.add(poderDTO);
    }
}
