package ies.puerto.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Concesionario {
    private HashSet<Coche> coches = new HashSet<>();;
    private List<Motocicleta> motocicletas = new ArrayList<>(); 

    public Concesionario() {
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
    }

    public HashSet<Coche> getCoches() {
        return this.coches;
    }

    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }

    public List<Motocicleta> getMotocicletas() {
        return this.motocicletas;
    }

    public void setMotocicletas(List<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Concesionario)) {
            return false;
        }
        Concesionario concesionario = (Concesionario) o;
        return Objects.equals(coches, concesionario.coches) && Objects.equals(motocicletas, concesionario.motocicletas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coches, motocicletas);
    }

    @Override
    public String toString() {
        return "coches= "+getCoches()+"\nmotocicletas= "+getMotocicletas();
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

    public float velocidadMediaVehiculos(){
        return (velocidadMediaCoches()+velocidadMediaMotocicletas())/(2);
    }
}
