package ies.puerto.modelo.fichero.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;

import ies.puerto.modelo.fichero.abstractas.Fichero;
import ies.puerto.modelo.impl.Persona;
import ies.puerto.modelo.impl.PersonaList;

public class FicheroXml extends Fichero{

    @Override
    public List<Persona> obtenerPersonas(){
        List<Persona> personajes = new ArrayList<>();
        if(!existeFichero(PATH_XML)){
            return personajes;
        }
        File file = new File(PATH_XML);

        try{
            Persister persister = new Persister();
            PersonaList personaList = persister.read(PersonaList.class, file);
            personajes = personaList.getPersonas();
        } catch(Exception e){
            e.printStackTrace();
        }
        return personajes;
    }

    @Override
    public boolean escribir(List<Persona> personas){
        PersonaList personaList = new PersonaList(personas);
        if(!existeFichero(PATH_XML)){
            return false;
        }
        File file = new File(PATH_XML);

        try{
            Persister persister = new Persister();
            persister.write(personaList, file);
        } catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
