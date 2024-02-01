package ies.puerto.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Concesionario {
    private HashSet<Coche> coches = new HashSet<>();;
    private List<Motocicleta> motocicletas = new ArrayList<>(); 
    private HashMap<String, Camion> camiones = new HashMap<>();
    private HashMap<String, Bicicleta> bicicletas = new HashMap<>();

    public Concesionario() {
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas, HashMap<String, Camion> camiones, HashMap<String, Bicicleta> bicicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
        this.bicicletas = bicicletas;
        this.camiones = camiones;
    }

    public HashSet<Coche> getCoches(){
        return this.coches;
    }

    public void setCoches(HashSet<Coche> coches){
        this.coches = coches;
    }

    public List<Motocicleta> getMotocicletas(){
        return this.motocicletas;
    }

    public void setMotocicletas(List<Motocicleta> motocicletas){
        this.motocicletas = motocicletas;
    }

    public HashMap<String, Bicicleta> getBiciletas(){
        return this.bicicletas;
    }

    public void setBicicleta(HashMap<String, Bicicleta> bicicletas){
        this.bicicletas = bicicletas;
    }

    public HashMap<String, Camion> getCamiones(){
        return this.camiones;
    }

    public void setCamiones(HashMap<String, Camion> camiones){
        this.camiones = camiones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Concesionario)) {
            return false;
        }
        Concesionario concesionario = (Concesionario) o;
        return Objects.equals(coches, concesionario.coches) && Objects.equals(motocicletas, concesionario.motocicletas) && Objects.equals(bicicletas, concesionario.bicicletas) && Objects.equals(camiones, concesionario.camiones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coches, motocicletas, bicicletas, camiones);
    }

    @Override
    public String toString() {
        return "coches= "+getCoches()+"\nmotocicletas= "+getMotocicletas()+"\nbicicletas= "+getBiciletas()+"\ncamiones= "+getCamiones();
    }
    
    public boolean addMotocicleta(Motocicleta motocicleta){
        if(motocicletas.contains(motocicleta)){
            return false;
        }
        motocicletas.add(motocicleta);
        return true;
    }

    public boolean removeMotocicleta(Motocicleta motocicleta){
        if(motocicletas.contains(motocicleta)){
            motocicletas.remove(motocicleta);
            return true;
        }
        return false;
    }

    public Motocicleta obtenerMotocicleta(String matricula){
        if(motocicletas.isEmpty()){
            return null;
        }

        for(Motocicleta moto:motocicletas){
            if(moto.getMatricula().equals(matricula)){
                return moto;
            }
        }
        return null;
    }

    public float velocidadMediaMotocicletas(){
        float resultado=0f;
        if(motocicletas.isEmpty()){
            return resultado;
        }

        for(Motocicleta moto:motocicletas){
            resultado+=moto.getVelocidad();
        }
        return resultado/motocicletas.size();
    }

    public boolean addCoche(Coche coche){
        if(coches.contains(coche)){
            return false;
        }
        coches.add(coche);
        return true;
    }

    public boolean removeCoche(Coche coche){
        if(coches.contains(coche)){
            coches.remove(coche);
            return true;
        }
        return false;
    }

    public Coche obtenerCoche(String matricula){
        if(coches.isEmpty()){
            return null;
        }

        for(Coche coche:coches){
            if(coche.getMatricula().equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    public float velocidadMediaCoches(){
        float resultado=0f;
        if(coches.isEmpty()){
            return resultado;
        }

        for(Coche coche:coches){
            resultado+=coche.getVelocidad();
        }
        return resultado/coches.size();
    }

    public boolean existeCamion(Camion camion){
        if(camiones.isEmpty()){
            return false;
        }
        if(!camiones.containsKey(camion.getMatricula())){
            return false;
        }
        return true;
    }

    public boolean addCamion(Camion camion){
        if(!existeCamion(camion)){
            camiones.put(camion.getMatricula(), camion);
        }
        return true;
    }

    public boolean removeCamion(Camion camion){
        if(existeCamion(camion)){
            camiones.remove(camion.getMatricula());
        }
        return true;
    }

    public Camion obtenerCamion(String matricula){
        if(camiones.isEmpty()){
            return null;
        }
        return camiones.get(matricula);
    }

    public float velocidadMediaCamion(){
        float resultado=0f;
        if(camiones.isEmpty()){
            return resultado;
        }

        for(Camion camion:camiones.values()){
            resultado+=camion.getVelocidad();
        }
        return resultado/camiones.size();
    }

    public boolean existeBicicleta(Bicicleta bicicleta){
        if(bicicletas.isEmpty()){
            return false;
        }
        if(bicicletas.containsKey(bicicleta.getMatricula())){
            return false;
        }
        return true;
    }

    public boolean addBicicleta(Bicicleta bicicleta){
        if(!existeBicicleta(bicicleta)){
            bicicletas.put(bicicleta.getMatricula(), bicicleta);
        }
        return true;
    }

    public boolean removeBicicleta(Bicicleta bicicleta){
        if(existeBicicleta(bicicleta)){
            bicicletas.remove(bicicleta.getMatricula());
        }
        return true;
    }

    public Bicicleta obtenerBicicleta(String matricula){
        if(bicicletas.isEmpty()){
            return null;
        }
        return bicicletas.get(matricula);
    }

    public float velocidadMediaBicicletas(){
        float resultado=0f;
        if(bicicletas.isEmpty()){
            return resultado;
        }

        for(Bicicleta bicicleta:bicicletas.values()){
            resultado+=bicicleta.getVelocidad();
        }
        return resultado/bicicletas.size();
    }

    public float velocidadMediaVehiculos(){
        return (velocidadMediaCoches()+velocidadMediaMotocicletas()+velocidadMediaBicicletas()+velocidadMediaCamion())/(4);
    }
}
