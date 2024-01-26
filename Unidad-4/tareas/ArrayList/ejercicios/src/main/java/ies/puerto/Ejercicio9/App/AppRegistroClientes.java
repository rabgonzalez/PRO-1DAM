package ies.puerto.Ejercicio9.App;

import java.util.ArrayList;
import java.util.List;

import ies.puerto.Ejercicio9.impl.Cliente;

public class AppRegistroClientes {
    private List<Cliente> clientes;

    public AppRegistroClientes(){
        clientes = new ArrayList<>();
    }

    public AppRegistroClientes(List<Cliente> clientes){
        this.clientes = clientes;
    }

    public void añadirCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
        }
    }

    public void eliminarCliente(Cliente cliente){
        if(clientes.contains(cliente)){
            clientes.remove(cliente);
        }
    }

    public Cliente buscarCliente(String numeroCliente){
        Cliente buscarCliente = new Cliente(numeroCliente);
        return buscarCliente(buscarCliente);
    }

    public Cliente buscarCliente(Cliente cliente){
        for(Cliente clienteLista:clientes){
            if(clientes.equals(clienteLista)){
                return clienteLista;
            }
        }
        return null;
    }

    public void transaccion(float cantidad, String numeroCliente) {
        Cliente clienteActualizar = new Cliente(numeroCliente);

        if(!clientes.contains(clienteActualizar)){
            return;
        }

        int posicionCliente = clientes.indexOf(clienteActualizar);

        clienteActualizar = buscarCliente(clienteActualizar);

        clienteActualizar.actualizarSaldo(cantidad);

        clientes.add(posicionCliente, clienteActualizar);
    }
}