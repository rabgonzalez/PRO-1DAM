package ies.puerto.modelo.fichero.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ies.puerto.modelo.fichero.abstractas.Fichero;
import ies.puerto.modelo.impl.Persona;
import ies.puerto.modelo.impl.Poder;

public class FicheroCsv extends Fichero {
    
    @Override
    public List<Persona> obtenerPersonas() {
        List<Persona> personajes = new ArrayList<>();
        if(!existeFichero(PATH_CSV)){
            return personajes;
        }
        File file = new File(PATH_CSV);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String linea;
            int filas = 0;
            while((linea = br.readLine()) != null){
                if(filas > 0){
                    String[] array = linea.split(DELIMITADOR);
                    Set<Poder> poderes = new HashSet<>();
                    for(int i = POSICION_PODERES; i < array.length; i++){
                        Poder poder = new Poder(array[i]);
                        poderes.add(poder);
                    }
                    Persona aniadirPersona = new Persona(array[POSICION_NOMBRE], array[POSICION_ALIAS], array[POSICION_GENERO], poderes);
                    personajes.add(aniadirPersona);
                }
                filas++;
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
            for(Persona personaEscribir : personas){
                bw.write(personaEscribir.personaToCsv()+"\n");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean actualizar(List<Persona> personas) {
        if(!existeFichero(PATH_CSV)){
            return false;
        }
        return limpiarFichero(PATH_CSV) && escribir(personas);
    }
}
