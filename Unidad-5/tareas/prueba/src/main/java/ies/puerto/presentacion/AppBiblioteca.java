package main.java.ies.puerto.presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {
    public static void main(String[] args) {
        List<Articulo> alimentos = lectura("src/main/resources/alimentos.csv");
        List<Articulo> aparatos = lectura("src/main/resources/aparatos.csv");
    }

    public static List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos = new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if(i > 0){
                        switch (articulo) {
                            case "alimento":
                                String[] array = linea.split(",");
                                articulo = new Articulo(array[0], array[3], array[2], array[4], Float.parseFloat(array[1]));
                                break;

                            case "aparato":

                                break;
                        
                            default:
                                break;
                        }
                    articulos.add(articulo);
                }
                i++;
            }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }
}
