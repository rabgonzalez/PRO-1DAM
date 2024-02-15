package main.java.ies.puerto.modelo.fichero.xml.implementacion;

import java.util.List;

import main.java.ies.puerto.modelo.entity.BibliotecaEntity;
import main.java.ies.puerto.modelo.entity.LibroEntity;
import main.java.ies.puerto.modelo.interfaces.IBiblioteca;

public class BibliotecaXml implements IBiblioteca {
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
}
