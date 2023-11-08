package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Banco{
    private int NumeroCuenta;
    private String NombreTitular;
    private int Saldo;

    public Banco(){}

    public Banco(int NumeroCuenta, String NombreTitular, int Saldo){
        this.NumeroCuenta = NumeroCuenta;
        this.NombreTitular = NombreTitular;
        this.Saldo = Saldo;
    }

    public int getNumeroCuenta() {
        return this.NumeroCuenta;
    }

    public String getNombreTitular() {
        return this.NombreTitular;
    }

    public int getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public int depositarDinero(int dineroDepositado){
        return Saldo + dineroDepositado;
    }

    public int retirarDinero(int dineroRetirado){
        return Saldo - dineroRetirado;
    }

    public String mostrarSaldoActual(){
        return NombreTitular + ", " + "usted tiene: " + Saldo + "€";
    }
}