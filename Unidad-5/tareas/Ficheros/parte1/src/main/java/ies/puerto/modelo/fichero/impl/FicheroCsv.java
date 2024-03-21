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

import ies.puerto.modelo.fichero.abstractas.Fichero;
import ies.puerto.modelo.impl.Persona;

public class FicheroCsv extends Fichero {
    
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
                String[] array = linea.split(DELIMITADOR);
                List<String> poderes = new ArrayList<>();
                
                for(int i = POSICION_PODERES; i < array.length; i++){
                    poderes.add(array[i]);
                }
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

    public boolean limpiarFichero(String path){
        if(!existeFichero(path)){
            return false;
        }
        File file = new File(path);
        try(OutputStream fileOutputStream = new FileOutputStream(file)){
            byte[] vacio =  {};
            fileOutputStream.write(vacio);
        } catch(IOException o){
            o.printStackTrace();
        }
        return true;
    }

    public boolean actualizar(List<Persona> personas) {
        if(!existeFichero(PATH_CSV)){
            return false;
        }
        return limpiarFichero(PATH_CSV) && escribir(personas);
    }
}
