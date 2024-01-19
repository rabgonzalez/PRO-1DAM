package ies.puerto.impl.Ejercicio4;

import ies.puerto.interfaz.Ejercicio4.IConexionRed;

public class ConexionWifi implements IConexionRed{
    @Override
    public void conectar(){
        System.out.println("Conexion por Wifi conectada");
    }
}
