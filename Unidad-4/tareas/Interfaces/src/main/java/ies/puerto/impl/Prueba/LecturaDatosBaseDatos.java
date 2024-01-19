package ies.puerto.impl.Prueba;

import ies.puerto.abstrac.Prueba.LecturaDatosAbstract;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract {

    @Override
    public String lectura() {
        return "realiza la lectura de datos desde base datos";
    }

    @Override
    public String apertura() {
        return "abriendo lectura de base datos";
    }

    @Override
    public String cierre() {
        return "Cerrando lectura BBDD";
    }
    
}
