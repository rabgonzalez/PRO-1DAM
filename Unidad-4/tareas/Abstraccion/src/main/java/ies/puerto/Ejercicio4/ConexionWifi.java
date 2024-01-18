package ies.puerto.Ejercicio4;

public class ConexionWifi implements ConexionRed{
    @Override
    public void conectar(){
        System.out.println("Conexion por Wifi conectada");
    }
}
