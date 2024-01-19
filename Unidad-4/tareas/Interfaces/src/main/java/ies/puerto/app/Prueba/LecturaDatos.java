package ies.puerto.app.Prueba;

import ies.puerto.abstrac.Prueba.LecturaDatosAbstract;
import ies.puerto.impl.Prueba.LecturaDatosBaseDatos;
import ies.puerto.interfaz.Prueba.ILecturaDatos;

public class LecturaDatos {
    static LecturaDatosAbstract lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.cierre());
        System.out.println(lecturaDatos.lectura());
        //tipo(lecturaDatos);
    }

    public static void tipo(ILecturaDatos lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
}
