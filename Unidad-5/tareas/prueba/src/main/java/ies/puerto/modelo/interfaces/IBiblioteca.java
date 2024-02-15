package main.java.ies.puerto.modelo.interfaces;

import java.util.List;

import main.java.ies.puerto.modelo.entity.BibliotecaEntity;
import main.java.ies.puerto.modelo.entity.LibroEntity;

public interface IBiblioteca {
    public BibliotecaEntity buscarBiblioteca(int id);
    public BibliotecaEntity updateBiblioteca(int id);
    public BibliotecaEntity deleteBiblioteca(int id);
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity);
}