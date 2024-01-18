package ies.puerto.Ejercicio4;

public class ConexionEthernet implements ConexionRed{
    @Override
    public void conectar(){
        System.out.println("Conexion por cable Ethernet conectada");
    }
}
