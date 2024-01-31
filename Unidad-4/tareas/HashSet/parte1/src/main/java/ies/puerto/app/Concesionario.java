package ies.puerto.app;

import java.util.HashSet;
import java.util.List;

import ies.puerto.impl.Coche;
import ies.puerto.impl.Motocicleta;

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

    public boolean removeMotocicleta(){
        return true;
    }
}
