package ies.puerto.Ejercicio4;

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
