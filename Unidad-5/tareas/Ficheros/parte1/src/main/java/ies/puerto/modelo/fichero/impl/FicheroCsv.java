package ies.puerto.modelo.fichero.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import ies.puerto.modelo.fichero.abstractas.Fichero;
import ies.puerto.modelo.impl.Persona;

public class FicheroCsv extends Fichero {
    public final int POSICION_NOMBRE = 0;
    public final int POSICION_ALIAS = 1;
    public final int POSICION_GENERO = 2;
    public final int POSICION_PODERES = 3;
    
    @Override
    public List<Persona> obtenerPersonas() {
        List<Persona> personajes = new ArrayList<>();
        if(!existeFichero(PATH_CSV)){
            return null;
        }
        File file = new File(PATH_CSV);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] array = linea.split(",");
                List<String> poderes = new ArrayList<>();
                Persona aniadirPersona = new Persona(array[POSICION_NOMBRE], array[POSICION_ALIAS], array[POSICION_GENERO], poderes);
                personajes.add(aniadirPersona);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return personajes;
    }

    @Override
    public boolean escribir(List<Persona> personas) {
        if(!existeFichero(PATH_CSV)){
            return false;
        }
        File file = new File(PATH_CSV);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for(Persona personaAñadir : personas){
                bw.write(personaAñadir.personaToCsv()+"\n");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return true;
    }

}
