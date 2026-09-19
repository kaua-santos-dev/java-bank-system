package model;

public class Conta {
    public Cliente dono;
    public double saldo = 0;

    public Conta(Cliente dono) {
        this.dono = dono;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositou: " + valor);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacou: " + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public void transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferiu para " + destino.dono.nome);
        }
    }

    public void mostrarSaldo() {
        System.out.println(dono.nome + " - Saldo: R$ " + saldo);
    }
}