package es.ies.puerto.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.ies.puerto.map.Persona;

public class AppPersona {
    static Persona persona1;
    static HashMap<String, Persona> personHashMap;
    static List<Persona> personaList;

    public static void main(String[] args) {
        persona1 = new Persona("Carlos", "12345678A");
        personHashMap = new HashMap<>();
        personaList = new ArrayList<>();

        addPersonaLista(persona1);
        System.out.println(personaList);
        System.out.println();
        addPersonaHashMap(persona1);
        System.out.println(personHashMap);
        
    }

    public static boolean addPersonaLista(Persona persona){
        if(!existePersonaLista(persona)){
            return personaList.add(persona);
        }
        return true;
    }

    public static boolean existePersonaLista(Persona persona) {
        if(personaList.isEmpty()){
            return false;
        }

        if(!personaList.contains(persona)){
            return false;
        }
        return true;
    }

    public static boolean addPersonaHashMap(Persona persona){
        if(!existePersonaHashMap(persona)){
            personHashMap.put(persona.getDni(), persona);
        }
        return true;
    }

    public static boolean existePersonaHashMap(Persona persona) {
        if(personHashMap.isEmpty()){
            return false;
        }
        if(!personHashMap.containsKey(persona.getDni())){
            return false;
        }
        return true;
    }
}
