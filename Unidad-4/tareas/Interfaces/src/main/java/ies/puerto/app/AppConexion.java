package ies.puerto.app;

import ies.puerto.impl.Ejercicio4.ConexionEthernet;
import ies.puerto.impl.Ejercicio4.ConexionWifi;

public class AppConexion {
    static ConexionEthernet ethernet;
    static ConexionWifi wifi;

    public static void main(String[] args) {
        ethernet = new ConexionEthernet();
        ethernet.conectar();

        wifi = new ConexionWifi();
        wifi.conectar();
    }
}
