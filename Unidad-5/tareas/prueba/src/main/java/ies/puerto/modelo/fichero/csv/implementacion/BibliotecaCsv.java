package main.java.ies.puerto.modelo.fichero.csv.implementacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import main.java.ies.puerto.modelo.entity.BibliotecaEntity;
import main.java.ies.puerto.modelo.entity.LibroEntity;
import main.java.ies.puerto.modelo.fichero.abstractas.BibliotecaFile;
import main.java.ies.puerto.modelo.interfaces.IBiblioteca;

public class BibliotecaCsv extends BibliotecaFile implements IBiblioteca {
    @Override
    public BibliotecaEntity buscarBiblioteca(int id){
        return null;
    }

    @Override
    public BibliotecaEntity updateBiblioteca(int id){
        return null;
    }

    @Override
    public BibliotecaEntity deleteBiblioteca(int id){
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity){
        return null;
    }

    public void lectura(String path) {
        File fichero = new File(path);
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }
}
