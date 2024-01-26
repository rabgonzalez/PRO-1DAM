package ies.puerto.Ejercicio9.impl;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String numeroCliente;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Cliente(String nombre, String numeroCliente) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.saldo = 0f;
    }

    public Cliente(String nombre, String numeroCliente, float saldo) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumeroCliente() {
        return this.numeroCliente;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void actualizarSaldo(float cantidad){
        this.saldo +=cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente registroClientes = (Cliente) o;
        return Objects.equals(numeroCliente, registroClientes.numeroCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroCliente, saldo);
    }

    @Override
    public String toString() {
        return "nombre= " + getNombre() + "/" +
            " numeroCliente= " + getNumeroCliente() + "/" +
            " saldo= " + getSaldo();
    }
}
