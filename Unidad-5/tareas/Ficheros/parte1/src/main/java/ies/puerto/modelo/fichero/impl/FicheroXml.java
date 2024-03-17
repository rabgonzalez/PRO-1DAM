package ies.puerto.modelo.fichero.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        Persister persister = new Persister(new AnnotationStrategy());

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            PersonaList personaList = persister.read(PersonaList.class, file);
            personajes = personaList.getPersonas();
        } catch(Exception e){
            e.printStackTrace();
        }
        return personajes;
    }

    @Override
    public boolean escribir(List<Persona> personas){
        if(!existeFichero(PATH_XML)){
            return false;
        }
        Persister serializer = new Persister();
        try{
            serializer.write(personas, new File(PATH_XML));
        } catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean actualizar(List<Persona> personas){
        return limpiarFichero(PATH_XML) && escribir(personas);
    }
}
