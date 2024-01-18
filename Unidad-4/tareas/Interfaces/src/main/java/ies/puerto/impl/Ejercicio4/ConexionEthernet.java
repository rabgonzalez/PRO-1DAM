package ies.puerto.impl.Ejercicio4;

import ies.puerto.interfaz.IConexionRed;

public class ConexionEthernet implements IConexionRed{
    @Override
    public void conectar(){
        System.out.println("Conexion por cable Ethernet conectada");
    }
}
