package ies.puerto.impl;

import java.util.HashSet;
import java.util.List;

public class Concesionario {
    private HashSet<Coche> coches;
    private List<Motocicleta> motocicletas;

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
        return (velocidadMediaCoches()+velocidadMediaMotocicletas())/(motocicletas.size()+coches.size());
    }
}
