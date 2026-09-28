package models;

public class ContaBancaria {
   private  double saldo = 757.27;

    public void Depositar(double valor) {
        if (valor>0) saldo+= valor;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

