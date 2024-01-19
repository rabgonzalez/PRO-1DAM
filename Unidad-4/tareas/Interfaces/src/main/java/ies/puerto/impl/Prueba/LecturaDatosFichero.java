package ies.puerto.impl.Prueba;

import ies.puerto.interfaz.Prueba.ILecturaDatos;

public class LecturaDatosFichero implements ILecturaDatos {

    @Override
    public String lectura() {
        return "realiza la lectura de datos desde fichero";
    }

    @Override
    public String apertura() {
        return "abriendo lectura de datos";
    }

    @Override
    public String cierre() {
        return "Cerrando lectura";
    }
    
}
