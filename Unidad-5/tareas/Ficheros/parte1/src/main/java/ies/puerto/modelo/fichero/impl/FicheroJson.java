package ies.puerto.modelo.fichero.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ies.puerto.modelo.fichero.abstractas.Fichero;
import ies.puerto.modelo.impl.Persona;

public class FicheroJson extends Fichero{
    @Override
    public List<Persona> obtenerPersonas(){
        List<Persona> personajes = new ArrayList<>();
        if(!existeFichero(PATH_JSON)){
            return personajes;
        }

        try {
            String lectura = new String(Files.readAllBytes(Paths.get(PATH_JSON)));
            Type listType = new TypeToken<ArrayList<Persona>>(){}.getType();

            Gson gson = new Gson();
            personajes = gson.fromJson(lectura, listType);

        } catch(IOException e){
            e.printStackTrace();
        }
        return personajes;
    }

    @Override
    public boolean escribir(List<Persona> personas){
        try(FileWriter fw = new FileWriter(PATH_JSON)){

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(personas, fw);

        } catch(IOException e){
            e.printStackTrace();
        }
        return true;
    }
}
