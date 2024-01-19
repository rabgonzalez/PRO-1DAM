package ies.puerto.app.Ejercicio4;

import ies.puerto.impl.Ejercicio4.ConexionEthernet;
import ies.puerto.impl.Ejercicio4.ConexionWifi;
import ies.puerto.interfaz.Ejercicio4.IConexionRed;

public class AppConexion {
    static IConexionRed ethernet;
    static IConexionRed wifi;

    public static void main(String[] args) {
        ethernet = new ConexionEthernet();
        ethernet.conectar();

        wifi = new ConexionWifi();
        wifi.conectar();
    }
}
